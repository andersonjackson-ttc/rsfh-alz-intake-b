package edu.tridentech.rsfh.alzintake.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

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
		String file = "RoperSpreadSheet2.xlsx";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("LastName", 1);
		map.put("FirstName", 2);
		map.put("DOB", 3);
		map.put("Race", 4);
		map.put("Gender", 5);
		map.put("Address", 6);
		map.put("Address2", 7);
		map.put("City", 8);
		map.put("State", 9);
		map.put("Zip", 10);
		map.put("Email", 11);
		map.put("Phone", 12);
		map.put("Status", 13);
		map.put("Deseased", 14);
		map.put("PCP", 15);
		map.put("Spec", 16);
		map.put("CurrentStudy", 17);
		map.put("Referral", 18);
		map.put("Mail", 19);
		
		
		try
		{
			FileInputStream inputStream = new FileInputStream(new File(file));
			Workbook workbook = WorkbookFactory.create(inputStream);
			
			Sheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getLastRowNum();
			
			Row row = sheet.createRow(++rowCount);
			
			Cell cell = row.createCell(map.get("LastName"));
			cell.setCellValue(rd.getLastName());
			
			cell = row.createCell(map.get("FirstName"));
			cell.setCellValue(rd.getFirstName());
			
			cell = row.createCell(map.get("DOB"));
			cell.setCellValue(rd.getDOB());
			
			cell = row.createCell(map.get("Race"));
			cell.setCellValue(rd.getRace());
			
			cell = row.createCell(map.get("Gender"));
			cell.setCellValue(rd.getGender());
			
			cell = row.createCell(map.get("Address"));
			cell.setCellValue(rd.getAddress());
			
			cell = row.createCell(map.get("Address2"));
			cell.setCellValue(rd.getAddress2());
			
			cell = row.createCell(map.get("City"));
			cell.setCellValue(rd.getAddress());
			
			cell = row.createCell(map.get("State"));
			cell.setCellValue(rd.getState());
			
			cell = row.createCell(map.get("Zip"));
			cell.setCellValue(rd.getZip());
			
			cell = row.createCell(map.get("Email"));
			cell.setCellValue(rd.getEmail());
			
			cell = row.createCell(map.get("Phone"));
			cell.setCellValue(rd.getPhone());
			
			//cell = row.createCell(15);
			//cell.setCellValue(rd.getScores());
			
			//cell = row.createCell(16);
			//cell.setCellValue(rd.getStatus());
			
			cell = row.createCell(map.get("PCP"));
			cell.setCellValue(rd.getPcp());
			
			cell = row.createCell(map.get("Spec"));
			cell.setCellValue(rd.getSpec());
			
			cell = row.createCell(map.get("Referral"));
			cell.setCellValue(rd.getReferral());
			
			//cell = row.createCell(map.get("Mail"));
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
	

