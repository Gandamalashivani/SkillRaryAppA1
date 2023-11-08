package testscripts;

import java.util.List;
import java.util.Map;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlibraries.Baseclass;

public class CreateCourseTest extends Baseclass {
	@Test
	public void createCourseTest() {
		home.clickCoursesTab();
		home.CreateCourseTest() ;
		course.ClickNewButton();
		Map<String ,String> map = excel.readFromExcel("Sheet1", "Add Course");
		String courseName = map.get("Name")+jutil.generateRandomNum(100);
		addCourse.setName(courseName);
		addCourse.selectCategory(WebUtil,map.get("category"));
		addCourse.setPrice(map.get("price"));
		addCourse.uploadPhoto(map.get("photo"));
		addCourse.setDescroption(WebUtil,map.get("Description"));
		addCourse.clickSaveButton();
		soft.assertTrue(course.getSuccessMessage().contains("Success");
		boolean ispresent = false;
		List<WebElement> courseNameList = course.getCourseList();
		for(WebElement name: courseNameList) {
			if(name.getText().equals(courseName)) {
				ispresent = true;
				break;
			}
		}
		soft.assertTrue(ispresent);
		course.clickDeleteButton(courseName, driver);
		course.clickDelete();
		soft.assertTrue(course.getSuccessMessage().contains("Success"));
		if(course.getSuccessMessage().contains("Success"))
		excel.writeToExcel("Sheet1", "Add Course","pass",IConstantPath.EXCEL_PATH);
		else 
			excel.writeToExcel("Sheet1", "Add Course","Fail",IConstantPath.EXCEL_PATH);
		soft.assertAll();
	}
}
	
		
		
		
		

		
		
		
		
		
		
		
		
	
		
	


