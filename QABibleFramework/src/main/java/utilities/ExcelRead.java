package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	static FileInputStream f; 
 	static XSSFWorkbook w; 
 	static XSSFSheet sh; 
 	 
 public static String getStringData(int a,int b) throws IOException 
 { 
 f=new FileInputStream((System.getProperty("user.dir") + "\\src\\test\\resources\\ExcelRead\\MyExcel.xlxs")); 
 w=new XSSFWorkbook(f); 
 sh=w.getSheet("Sheet1"); 
 Row r=sh.getRow(a); 
 Cell c=r.getCell(b); 
 return c.getStringCellValue(); 
  
 } 
 public static String getIntegerData(int a,int b) throws IOException   
 { 
 	f=new FileInputStream((System.getProperty("user.dir") + "\\src\\test\\resources\\ExcelRead\\MyExcel.xlxs")); 
     w=new XSSFWorkbook(f); 
     sh=w.getSheet("Sheet1"); 
     Row r=sh.getRow(a);//Row within sheet 
     Cell c=r.getCell(b);//Cell within row 
     int x= (int)c.getNumericCellValue(); 
     return String.valueOf(x);//value of is a method in string 
  
 } 
 }

