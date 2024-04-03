package Meeshotest;

import org.testng.annotations.Test;

import Meeshobasic.Basicmeesho;
import Meeshopage.Pagemesho;
import Meeshoutility.Utilitymeesho;



public class Meshotest  extends Basicmeesho {
	@Test
	public void verifylogin ()throws Exception
	{
		Pagemesho p1=new Pagemesho(driver) ;
		
		String x1="C:\\Users\\Anitta Samuel\\Downloads\\project.xlsx\"";
		String sheet="Sheet1";
		 int rowCount=Utilitymeesho.getRowCount(x1,sheet );
		 for(int i=1;i<=rowCount;i++)
		 {
		 String phoneno=Utilitymeesho.getCellValue(x1, sheet, i, 0);
			 System.out.println("Phoneno---"+phoneno);
			 String Password=Utilitymeesho.getCellValue(x1, sheet, i,1);
			 System.out.println("password--"+Password);
			 p1.setvaluea(phoneno, Password);
			 
			 p1.clickcart();;
		 
			
			 
			 
			 String expecteduarl="https://shoppydigital.com/";
			 String actualurl=driver.getCurrentUrl();
			 if(actualurl.equals(expecteduarl))
			 {
				 System.out.println("pass");
				 
			 }else
			 {
				 System.out.println("failed");
			 }
		 
		 }
	}
}
		 	
 
		 
	



