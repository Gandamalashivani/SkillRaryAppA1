package pompackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AddNewCourseListPage {
	//Declaration
		@FinfBy(xpath ="")
		private WebElement PageHeader;
		@FinfBy(xpath ="")
		private WebElement newButton;
		@FinfBy(xpath ="")
		private List<WebElement> courseList ;
		@FindBy(xpath ="")
		private WebElement successMessage;
		private String deletepath ="//td[text() = %s]/following-sibling::td"
		//Initialization
		public CourseListPage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		//Utilization
		public String PageHeader() {
			return PageHeader.getText();
		}
		public void ClickNewButton() {
			newButton.click();
		}
		public List<WebElement> getCourseList() {
			return courseList;
		}
		public String getSuccessMessage() {
			return successMessage.getText();
		}
		public void clickDeleteButton(String courseName,WebDriver driver) {
			String requiredpath = 
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
