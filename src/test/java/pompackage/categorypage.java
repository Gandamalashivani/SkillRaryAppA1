package pompackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class categorypage {

//Declaration
	@FindBy(xpath ="//h1[normalize-space(text())='Category']")
	private WebElement PageHeader;
	@FindBy(xpath ="//a[text() =' New']")
	private WebElement newButton;
	@FindBy(xpath ="//table/tbody/tr/td[1]")
	private List<WebElement> categoryList;
	private String deletepath ="//td[text()='%s']/following-sibling::td/Button[text()='delete']";
			@FindBy(xpath="//h4[text()='Sucess']")
	private WebElement SucessMessage;
	@FindBy(xpath="//button[@name='delete]")
	private WebElement deleteButton;
	//Initialization
	public categorypage(WebDriver driver) {
		PageFactory.initElements( driver,this)	;	
	}
	//Utilization
	public String getPageHeader() {
		return PageHeader.getText()	;
	}
	public void clickNewButton() {
		newButton.click();
	}
	public List<WebElement> getCategoryList() {
		return categoryList;
	}
	public String getSucessMessage() {
		return SucessMessage.getText();
	}
	public void clickDeleteButton(String courseName, WebDriver driver) {
		String requiredPath = String.format(deletepath, courseName);
		driver.findElement(By.xpath(requiredPath)).click();
	}
	public void clickDelete() {
		deleteButton.click();
	}
	
	}
