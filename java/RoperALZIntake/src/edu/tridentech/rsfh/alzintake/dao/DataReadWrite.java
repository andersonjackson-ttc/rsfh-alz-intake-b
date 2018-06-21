package edu.tridentech.rsfh.alzintake.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
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
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 * @throws EncryptedDocumentException 
	 */
	public boolean writeRecord(PartRecord rd) throws IOException, InvalidFormatException
	{
		String file = "RoperSpreadSheet2.xlsx";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("LastName", 1);
		map.put("FirstName", 2);
		map.put("DOB", 3);
		map.put("Race", 5);
		map.put("Gender", 6);
		map.put("Address", 7);
		map.put("Address2", 8);
		map.put("City", 9);
		map.put("State", 10);
		map.put("Zip", 11);
		map.put("Email", 12);
		map.put("Phone", 13);
		map.put("Status", 17);
		map.put("Deceased", 18);
		map.put("PCP", 19);
		map.put("Spec", 20);
		map.put("CurrentStudy", 21);
		map.put("Referral", 22);
		map.put("Mail", 23);
		
		
			File testFile = new File(file);
			
			if(!testFile.exists())
			{
				throw new IOException("File not found!");
			}
			
		
		    FileInputStream inputStream = new FileInputStream(testFile);
			Workbook workbook = WorkbookFactory.create(inputStream);
			
						
			
			Sheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getLastRowNum();
			
			Row row = sheet.createRow(++rowCount);
			
			String formula = String.format("IF(ISBLANK(D%d), \"\", (DATEDIF(D%d, NOW(), \"Y\")))", ++rowCount,rowCount);
			
			Cell cell = row.createCell(map.get("LastName"));
			cell.setCellValue(rd.getLastName());
			
			cell = row.createCell(map.get("FirstName"));
			cell.setCellValue(rd.getFirstName());
			
			CellStyle cellStyle = workbook.createCellStyle();
			CreationHelper createHelper = workbook.getCreationHelper();
			cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("MM/dd/yyyy"));
			
			
			cell = row.createCell(map.get("DOB"));
			cell.setCellValue(rd.getDOB());
			cell.setCellStyle(cellStyle);
			
			cell = row.createCell(4);
			cell.setCellFormula(formula);
			
			cell = row.createCell(map.get("Race"));
			cell.setCellValue(rd.getRace());
			
			cell = row.createCell(map.get("Gender"));
			cell.setCellValue(rd.getGender());
			
			cell = row.createCell(map.get("Address"));
			cell.setCellValue(rd.getAddress());
			
			cell = row.createCell(map.get("Address2"));
			cell.setCellValue(rd.getAddress2());
			
			cell = row.createCell(map.get("City"));
			cell.setCellValue(rd.getCity());
			
			cell = row.createCell(map.get("State"));
			cell.setCellValue(rd.getState());
			
			cell = row.createCell(map.get("Zip"));
			cell.setCellValue(rd.getZip());
			
			cell = row.createCell(map.get("Email"));
			cell.setCellValue(rd.getEmail());
			
			cell = row.createCell(map.get("Phone"));
			cell.setCellValue(rd.getPhone());
			
			cell = row.createCell(map.get("Status"));
			cell.setCellValue(" ");
			
			cell = row.createCell(map.get("PCP"));
			cell.setCellValue(rd.getPcp());
			
			cell = row.createCell(map.get("Deceased"));
			cell.setCellValue(" ");
			
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
		
	}
}

	

