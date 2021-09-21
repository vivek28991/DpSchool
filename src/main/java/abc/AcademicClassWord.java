package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AcademicClassWord extends AcademicAction {
	
	@Test(priority=7)
	public void classWord()
	{
		WebElement academicLink = driver.findElement(By.xpath("(//nav[@class='sidebar']//following::a)[2]"));
		academicLink.click();
		WebElement academic = driver.findElement(By.xpath("//h4[text()='Classwork']"));
		academic.click();
	}

}
