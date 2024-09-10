package introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class readexceldata {

	public static void main(String[] args) throws FileNotFoundException {


		FileInputStream file= new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\introduction\\src\\introduction\\Inputdata\\inputdata.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
	}

}
