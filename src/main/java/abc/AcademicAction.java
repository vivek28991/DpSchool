package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AcademicAction extends Academic {
	
	
	@Test(priority=4)
	public void acAction()
	{
		WebElement academicLink = driver.findElement(By.xpath("(//nav[@class='sidebar']//following::a)[2]"));
		academicLink.click();
		WebElement academic = driver.findElement(By.xpath("//h4[text()='Academic']"));
		academic.click();
	}
	
	 @Test(priority=5)
	public void actionAcademic()
	{
		WebElement acadac = driver.findElement(By.xpath("(//button[@class='btn btn-info dropdown-toggle'])[1]"));
		acadac.click();
		WebElement assclsub = driver.findElement(By.xpath("//a[text()='Assign Class Subjects']"));
		assclsub.click();
		WebElement slclass = driver.findElement(By.xpath("//div[@class='form-group mb-0']/select"));
		Select sl=new Select(slclass);
		sl.selectByVisibleText("Nursery");
		WebElement edit = driver.findElement(By.xpath("(//button[@class='btn btn-info btn-xs  ng-scope'])[1]"));
		edit.click();
		WebElement input = driver.findElement(By.xpath("//td[@class='col-sm-1']/input"));
		input.sendKeys("2");
		WebElement sub = driver.findElement(By.xpath("//select[@class='form-control ng-valid ng-scope ng-dirty ng-valid-parse ng-touched']"));
		Select ssub= new Select(sub);
		ssub.selectByVisibleText("Biology");
		WebElement sytpe = driver.findElement(By.xpath("//td[@class='col-sm-1']/select"));
		Select Sltype= new Select(sytpe);
		Sltype.selectByVisibleText("Compulsory");
		WebElement parentsub = driver.findElement(By.xpath("(//td[@class='col-sm-2']/select)[1]"));
		Select psub= new Select(parentsub);
		psub.selectByVisibleText("Foreign language");
		WebElement gscal = driver.findElement(By.xpath("(//td[@class='col-sm-2']/select)[2]"));
		Select Sgscal= new Select(gscal);
		Sgscal.selectByVisibleText("Select");
		WebElement save = driver.findElement(By.xpath("(//td[@class='col-sm-2']/button)[1]"));
		save.click();
		WebElement clicladd = driver.findElement(By.xpath("(//a[@class='btn-new btn-primary mo']/i)[2]"));
		clicladd.click();
		WebElement selectlaasub = driver.findElement(By.xpath("//label[@class='leftSubject']"));
		selectlaasub.click();
		WebElement selectlaacls = driver.findElement(By.xpath("//label[@class='leftClass']"));
		selectlaacls.click();
		WebElement submit = driver.findElement(By.xpath("//button[@id='btnSubmit']"));
		submit.click();
		
	}
	 
	 @Test(priority=6)
	 public void assignsectionsub()
	 {
		 WebElement acadac = driver.findElement(By.xpath("(//button[@class='btn btn-info dropdown-toggle'])[1]"));
			acadac.click();
			WebElement assingsecsub = driver.findElement(By.xpath("//a[text()='Assign Section Subjects']"));
			assingsecsub.click();
			WebElement slclass = driver.findElement(By.xpath("//div[@class='form-group col-sm-2']/select"));
			Select slclassvalue= new Select(slclass);
			slclassvalue.selectByVisibleText("Nursery");
			WebElement sub = driver.findElement(By.xpath("//div[@class='form-group col-sm-6']/select"));
			Select sbsub= new Select(sub);
			sbsub.selectByVisibleText("Nursery A");	
			/*WebElement assign = driver.findElement(By.xpath("//a[@class='btn-new btn-primary mo']"));
			assign.click();*/
			/*WebElement order = driver.findElement(By.xpath("//input[@class='form-control ng-dirty ng-invalid ng-invalid-parse ng-touched']"));
			order.sendKeys("1");
			
			WebElement subj = driver.findElement(By.xpath("//td[@class='col-sm-3']/select"));
			Select sbsu= new Select(subj);
			sbsu.selectByVisibleText("Biology");
			
			WebElement type = driver.findElement(By.xpath("//td[@class='col-sm-1']/select"));
			Select sltype=new Select(type);
			sltype.selectByVisibleText("Optional");
			
			WebElement parentsub = driver.findElement(By.xpath("(//td[@class='col-sm-2']/select)[1]"));
			Select slparentsub=new Select(parentsub);
			slparentsub.selectByVisibleText("Science");
			
			WebElement gscal = driver.findElement(By.xpath("(//td[@class='col-sm-2']/select)[2]"));
			Select slgscal=new Select(gscal);
			slgscal.selectByVisibleText("Select");
			
			WebElement save = driver.findElement(By.xpath("(//td[@class='col-sm-1']/button)[1]"));
			save.click();*/
			WebElement backHomepage = driver.findElement(By.xpath("//a[@class='navbar-brand']"));
			backHomepage.click();
	 }
	 
	

}
