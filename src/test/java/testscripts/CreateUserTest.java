package testscripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateUserTest extends BaseClass {
	@Test
	public void CreateUserTest() {
		SoftAssert soft = new SoftAssert();
		home.clickUsersTab();
		soft.assertTrue(users.getPageHeader().contains("Users"));
		users.clickNewButton();
		soft.assertEquals(addUser.getPageHeader(),"Add New User");
		Map<String ,String > map = excel.readFromExcel("Sheet1", "Add Course");
		addUser.createNewUser(map.get("Email"),map.get("password"),
				map.get("Firstname"),map.get("Lastname"),map.get("Address"),
				map.get("Contact Info"),map.get("photo"));
		soft.assertTrue(users.getSuccessMessage().contains("Sucess"));
		if(course.getSuccessMessage().contains("Success"))
			excel.writeToExcel(("Sheet1", "Add User","pass",IConstant.EXCEL_PATH);
			else
				excel.writeToExcel(("Sheet1", "Add User","Fail",IConstant.EXCEL_PATH);
				soft.assertAll();
	}
}
		
		
		
	


