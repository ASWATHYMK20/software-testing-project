package project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class my_project_form_widgets {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
					
		
		
		   w.get("https://demoqa.com/automation-practice-form"); 
	       w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[2]/span/div")) .click();
	    
	       Thread.sleep(2000);
			 
		   w.manage().window().maximize();
	       w.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("ASWATHY");
	       w.findElement(By.id("lastName")).sendKeys("MK");
	       w.findElement(By.id("userEmail")).sendKeys("aswathy@gmail.com");
	       w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div[2]/label")).click();
	    
	    
	       w.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();
	    
	       Select m=new Select(w.findElement(By.className("react-datepicker__month-select")));
	       m.selectByIndex(5);
	   
	       Select d=new Select(w.findElement(By.className("react-datepicker__year-select")));
	       d.selectByValue("1997");
	    
	   
	       w.findElement(By.xpath("//div[contains(text(),'20')]")).click();
	    
	    
	       w.findElement(By.id("userNumber")).sendKeys("9878563213");
			
	    
	       JavascriptExecutor js= (JavascriptExecutor) w;
	   	   js.executeScript("window.scrollTo(0,document.body.scrollHeight,)");
	    
	       w.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("parekkad house thozhuppadam p o");
	    
	       w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[2]/label")).click();
	       w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[3]/label")).click(); 
	    
	    
	       w.findElement(By.id("uploadPicture")).sendKeys("C:\\aswathy2\\2017-12-22-12-49-37-862.jpg");
	    
	       w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[10]/div[2]/div/div[1]/div[1]")).click();
	       w.findElement(By.xpath("//div[contains(text(),'Rajasthan')]")).click();
	    
	    
	      w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/form/div[10]/div[3]/div/div[1]/div[1]")).click();
	      w.findElement(By.xpath("//div[contains(text(),'Jaipur')]")).click();
	    
	    
	      Thread.sleep(2000);

	       w.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	    
	    
	      // w.findElement(By.xpath("//*[@id=\"closeLargeModal\"]")).click();
	    
			System.out.println("practice form done successfully ");
			
			
		//widgets
			
			
			
			  w.get("https://demoqa.com/widgets"); 
			  w.manage().window().maximize();
			    
		      JavascriptExecutor js1= (JavascriptExecutor) w;
			  js1.executeScript("window.scrollTo(0,document.body.scrollHeight,)");
			  
			  //ACCORDIAN
			  
			  w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[1]/span")).click();
				
		      w.findElement(By.xpath("//*[@id=\"section1Heading\"]")).click();
		      
		      w.findElement(By.xpath("//*[@id=\"section2Heading\"]")).click();
		      
		      w.findElement(By.xpath("//*[@id=\"section3Heading\"]")).click();
		      
		      Thread.sleep(1000);
		      
		      
		      
		      //DATE PICKER
		      
		     w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]")).click();
		      
		      w.findElement(By.xpath("//*[@id=\"datePickerMonthYearInput\"]")).clear();
		      
		      Select m1=new Select(w.findElement(By.className("react-datepicker__month-select")));
		      m1.selectByIndex(6);
		     
		      Select d1=new Select(w.findElement(By.className("react-datepicker__year-select")));
		      d1.selectByValue("1997");
		      
		      w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[4]")).click();   
		      
				
		      //DATE AND TIME
		      
		      w.findElement(By.xpath("//*[@id=\"dateAndTimePickerInput\"]")).clear();
		      Thread.sleep(1000);
		      
		      w.findElement(By.className("react-datepicker__month-read-view--down-arrow")).click();
		      w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]")).click();
		      w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]")).click();
		      
		      w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[13]/a")).click();
		      w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[11]")).click();
		      
		      w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]")).click();
		      w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[64]")).click();
		         
				
		      JavascriptExecutor jsa1= (JavascriptExecutor) w;
			  jsa1.executeScript("window.scrollTo(0,document.body.scrollHeight,)");
		  
			  Thread.sleep(1000);
			  
			  
			  
			  //progressbar
			  
			  
		      w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]")).click();
		      JavascriptExecutor js3=(JavascriptExecutor) w;
		      js3.executeScript("window.scrollBy(0,-1000)");
		      
		      w.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
		      
		      Thread.sleep(1000);
		      w.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
		     
		      Thread.sleep(1000);
		      w.findElement(By.xpath("//*[@id=\"startStopButton\"]")).click();
		      
		      Thread.sleep(10000);
		      
		      w.findElement(By.xpath("//*[@id=\"resetButton\"]")).click();
		      
		      
		      //TABS
		      Thread.sleep(1000);
		      JavascriptExecutor js4=(JavascriptExecutor) w;
		      js4.executeScript("window.scrollBy(0,1000)");
		     
		      
		     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[6]/span")).click(); 
		     w.findElement(By.xpath("//*[@id=\"demo-tab-what\"]")).click();
		     
		     w.findElement(By.xpath("//*[@id=\"demo-tab-origin\"]")).click();
		     w.findElement(By.xpath("//*[@id=\"demo-tab-use\"]")).click();
		     
		     Thread.sleep(1000);
		     
		     //MENU
		     
		     
		     JavascriptExecutor js5=(JavascriptExecutor) w;
		     js5.executeScript("window.scrollBy(0,1000)");
		    
		     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[8]/span")).click();
		    
		     
		     Thread.sleep(1000);
		     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/ul/li[2]/a")).click();
		     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/ul/li[2]/ul/li[3]/a")).click();
		     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[1]/ul/li[2]/ul/li[3]/ul/li[2]/a")).click();
		     
		     
		     //select menu
		     JavascriptExecutor js6=(JavascriptExecutor) w;
		     js6.executeScript("window.scrollBy(0,1000)");
		     
		     Thread.sleep(1000);
		     
		     w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[9]/span")).click();
		     
		     
		     w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
		     w.findElement(By.xpath("//div[contains(text(),'Group 2, option 1')]")).click();
		     
		     
		     w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]")).click();
		     w.findElement(By.xpath("//div[contains(text(),'Dr.')]")).click();
		     
		     
		     
		     //defect
		    // Select a=new Select(w.findElement(By.xpath("//select[@id='oldSelectMenu']")));
		    // a.selectByIndex(3);
		     
		     
		    // Select b=new Select(w.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")));
		    // b.selectByIndex(3);
		     
		    // Thread.sleep(2000);
		     
		     
		     
		     
		     
		     JavascriptExecutor js7=(JavascriptExecutor) w;
		     js7.executeScript("window.scrollBy(0,1000)");
		     
		    Select c=new Select(w.findElement(By.id("cars")));
		    c.selectByValue("Audi");

	}

}
