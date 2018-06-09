package edu.tridentech.rsfh.alzintake.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class DataReadWrite 
{
	private static DataReadWrite dwr = null;
	
	
	protected DataReadWrite()
	{
		//Stops constructor
	}
	
	/**
	 * Returns the singleton instance
	 * @return
	 */
	public static DataReadWrite getInstance()
	{
		if(dwr == null)
		{
			dwr = new DataReadWrite();
		}
		return dwr;
	}
	
	/**
	 * Writes a row in spread sheet from PartRecord
	 * 
	 * @param rd
	 * @return boolean true if write was successful
	 */
	public static boolean writeRecord(PartRecord rd)
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
			cell.setCellValue(rd.getLastName());
			
			cell = row.createCell(2);
			cell.setCellValue(rd.getFirstName());
			
			cell = row.createCell(3);
			cell.setCellValue(rd.getDOB());
			
			cell = row.createCell(5);
			cell.setCellValue(rd.getRace());
			
			cell = row.createCell(6);
			cell.setCellValue(rd.getGender());
			
			cell = row.createCell(7);
			cell.setCellValue(rd.getAddress());
			
			cell = row.createCell(8);
			cell.setCellValue(rd.getEmail());
			
			cell = row.createCell(9);
			cell.setCellValue(rd.getPhone());
			
			//cell = row.createCell(15);
			//cell.setCellValue(rd.getScores());
			
			//cell = row.createCell(16);
			//cell.setCellValue(rd.getStatus());
			
			cell = row.createCell(10);
			cell.setCellValue(rd.getPcp());
			
			cell = row.createCell(11);
			cell.setCellValue(rd.getSpec());
			
			cell = row.createCell(12);
			cell.setCellValue(rd.getReferral());
			
			//cell = row.createCell(13);
			//cell.setCellValue(rd.getMailing());
			
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
}
	

