package com.vtiger.comecast.Generic_utility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class contains all excel related libraries
 */

public class ExcelUtility {
	/**
	 *@throws IOException 
	 * @throws EncryptedDocumentException 
	 * @Laxmikanth 
	 * this method will allow user to  read the data from excel
	 */
	public String getDataFromExcel(String sheetName,int rowno, int cellno) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fin= new FileInputStream("./Data/Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fin);
		Sheet sh = wb.getSheet(sheetName);
		Row row=sh.getRow(rowno);
		String data = row.getCell(cellno).toString();
		 wb.close();
		return data;
		
		
	}

}
