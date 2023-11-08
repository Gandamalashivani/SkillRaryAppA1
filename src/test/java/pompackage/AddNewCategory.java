package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCategory {


@FindBy(xpath ="//b[text() ='Add New Category']")
private WebElement PageHeader;

@FindBy(id = "name")
private WebElement nameTF;
@FindBy(xpath ="//button[@name='add']")
private WebElement saveButton;
//Initialization
 public AddNewCategory(WebDriver driver) {
	PageFactory.initElements( driver,this);
}
//Utilization
public String getPageHeader() {
	return PageHeader.getText();
}
public void setName(String categoryName) {
	nameTF.sendKeys(categoryName);
}
public void clickSave() {
	saveButton.click();
}
	
	}















