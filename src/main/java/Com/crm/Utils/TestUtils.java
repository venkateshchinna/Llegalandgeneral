package Com.crm.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Com.crm.Base.TestBase;

public class TestUtils extends TestBase {

	
	public static long IMPLICIT_WAIT=20;

	public static String TESTDATA_SHEET_PATH="D:\\Ecplisepractice\\workspace\\MavenProject\\src\\main\\java\\Com\\crm\\Testdata\\Excel.xlsx";
	
	
	static Workbook book;
	static Sheet sheet;
	public void switchToframe()
	{
		driver.switchTo().frame("mainpanel");
	}
	
	
	public static Object[][] getTestData(String sheetName)
	{
		FileInputStream file=null;
		try {
			try{
				file=new FileInputStream(TESTDATA_SHEET_PATH);
				}catch(FileNotFoundException e)
			    {
					e.printStackTrace();
			    }
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try{
			try {
				book=WorkbookFactory.create(file);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}catch(IOException e)
		{
				e.printStackTrace();
		}
		
		sheet =book.getSheet(sheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		//System.out.println(sheet.getlastrownum()+"-----"+
		//sheet.getrow(0).getLastCellnum());
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				//System.out.print(data[i][j]);
			}
		} 
		return data;
}
	
	public static  void takeScreenShotAtEndOfTest() throws IOException{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String CurrentDir=System.getProperty("user.dir");
		
		FileUtils.copyFile(srcfile,new File(CurrentDir+"/screenshot/"+System.currentTimeMillis()+".png"));
	}
	
	

		
	
}
