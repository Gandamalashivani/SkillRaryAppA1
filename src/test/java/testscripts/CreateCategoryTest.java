package testscripts;

import java.util.Locale.Category;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateCategoryTest extends Baseclass {
	@Test
	public void CreateCategoryTest() {
		SoftAssert soft = new SoftAssert();
		home.clickCourseTab();
		home.clickCategory();
		soft.assertTrue(category.getPageHeader().contains("Category"));
		Category.clickNewButton();
		Thread.sleep(3000);
		
		
		
	}

}
