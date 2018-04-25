/**
 * Used for testing RSFH DAO
 * 
 * @author Kevin Franks
 */

package edu.tridentech.rsfh.alzintake.dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataBaseTest implements DbObject
{

	@Override
	public boolean saveRecord(PartRecord pr) 
	{
		String file = "RoperSpreadSheet.xlsx";
		
		try
		{
			FileInputStream inputStream = new FileInputStream(new File(file));
			Workbook workbook = WorkbookFactory.create(inputStream);
			
			Sheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getLastRowNum();
			
			Row row = sheet.createRow(++rowCount);
			
			Cell cell = row.createCell(1);
			cell.setCellValue(pr.getLastName());
			
			cell = row.createCell(2);
			cell.setCellValue(pr.getFirstName());
			
			cell = row.createCell(3);
			cell.setCellValue(pr.getDOB());
			
			cell = row.createCell(5);
			cell.setCellValue(pr.getRace());
			
			cell = row.createCell(6);
			cell.setCellValue(pr.getGender());
			
			inputStream.close();
			
			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);
			workbook.close();
			outputStream.close();
			
			return true;
		} catch (IOException | InvalidFormatException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateRecord(PartRecord pr) {
		// TODO Auto-generated method stub
		return false;
	}

	
	



public static void main(String[] args) throws Exception
{
	DataBaseTest db = new DataBaseTest();
	ParticipentTest pt = new ParticipentTest();
	
	db.saveRecord(pt);
	
}

}
