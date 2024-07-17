package excel.pkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static XSSFWorkbook w;



	public static XSSFSheet s;



	public static FileInputStream f;



	public static String readStringData(int i,int j) throws IOException {



	f= new FileInputStream("C:\\Users\\USER\\git\\ExcelRead\\ExcelRead\\src\\main\\resources\\student.xlsx");



	w= new XSSFWorkbook(f);



	s= w.getSheet("Sheet1");

	Row r=s.getRow(i);



	Cell c=r.getCell(j);

  System.out.println("Test");

	return c.getStringCellValue();



	}



	public static String readIntegerData(int i,int j) throws IOException {

		



			f= new FileInputStream("C:\\Users\\USER\\git\\ExcelRead\\ExcelRead\\src\\main\\resources\\student.xlsx");



			w= new XSSFWorkbook(f);



			s= w.getSheet("Sheet1");



			Row r=s.getRow(i);



			Cell c=r.getCell(j);



			int value=(int) c.getNumericCellValue();



			return String.valueOf(value);



			}

	}


