package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompackage.AddNewCategory;
import pompackage.AddNewCourseListPage;
import pompackage.CourseListPage;
import pompackage.UsersPage;
import pompackage.Welcomepage;

public class Baseclass {
//@BeforeSuite
//@BeforeTest
	protected propertiesUtility property;
	 protected ExcelUtility excel;
	 protected JavaUtility jutil;
	 protected WebDriverUtility WebUtil;
	 protected WebDriver driver;
	 
	public static WebDriver sdriver;
	public static JavaUtility sjutil;
	
	protected Welcomepage welcome;
	protected LoginPage login;
	protected AdminHomePage home;
	protected UsersPage users;
	protected CourseListPage course;
	protected CategoryPage;
	protected AddNewCourseListPage adduser;
	protected AddNewCoursePage;
	protected AddNewCategory addcategory;
	
	
   @BeforeClass
   public void classconfig() {
	property = new propertiesUtility();
	excel = new ExcelUtility();
	jutil = new JavaUtility();
	WebUtil = new WebDriverUtility();
	property.PropertiesInitialization(IConstantPath.PROPERTIES_PATH);
	driver = WebUtil.launchBrowser(property.readFromProperties("browser"));
	sdriver = driver;
	sjutil = jutil;
}
   @BeforeMethod
   public void methodconfig( ) {
	   excel.excelInitialization(IConstantPath.EXCEL_PATH);
	   welcome = new Welcomepage(driver);
	   login = new LoginPage(driver);
	   home = new AdminHomePage(driver);
	   users = new UsersPage(driver);
	   course = new CourseListPage(driver);
	   category = new CategoryPage(driver);
	   adduser = new AddNewUserPage(driver);
	   addcourse = new AddNewCoursePage(driver);
	   addcategory = new AddNewCategoryPage(driver);
	   
	   WebUtil.navigateToApp(property.readFromProperties("url"));
	   long time= Long.parseLong(property.readFromProperties("timeouts"));
	   WebUtil.waitTillElementFound(time);
	   welcome.ClickLogginButton();
	   login.setEmail(property.readFromProperties("username"));
	   login.setPassword(property.readFromProperties("password"));
	   login.clickLogin();
   }
   @AfterMethod
   public void classTeardown() {
	   excel.closeExcel();
	   home.signOutofApp();
   
   @AfterClass
   public void classTeardown() {
	   WebUtil.closeAllWindows();
   }
   //@AfterTest
   //@AfterSuite
	   
	   }






	
	
	
	
	
	
	
	
	
	
	
	
	

