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
	protected enum Fields
	{
		LAST_NAME, FIRST_NAME, DOB, RACE, GENDER,
		ADDRESS, ADDRESS2, CITY, STATE, ZIP, EMAIL,
		PHONE, STATUS, DECEASED, PRIMARY_CARE, SPECIALIST,
		CURRENT_STUDY, REFERRAL, MAIL_LIST, PREVIOUS_DIAG,
		MEMORY_LOSS, MEMORY_DATE, DISRUPTS_LIFE, DIFFICULTY_PLANNING,
		DIFFICULTY_TASKS, DIFFICULTY_WORDS, FAMILY_HISTORY,
		FAMILY_RELATION, ARICEPT, ARICEPT_START, ARICEPT_STOP,
		NAMENDA, NAMENDA_START, NAMENDA_STOP, EXELON, EXELON_START,
		EXELON_STOP, RAZADYNE, RAZADYNE_START, RAZADYNE_STOP,
		ARICEPT_NAMENDA, ARINAM_START, ARINAM_STOP, HPOA,
		POA_NAME, POA_PHONE, MARRIED, SPOUSE_NAME, SPOUSE_PHONE,
		CHILD, CHILD_NAME, CHILD_PHONE, MENTAL_ILLNESS, SLEEP_DISORDER,
		CANCER, CANCER_TYPE, PACEMAKER_MRI, DRUG_ALCHOHOL, ONGOING_ISSUES
	}
	
	
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
	public boolean writeRecord(PartRecord rd, String fileName) throws IOException, InvalidFormatException
	{
		String file = fileName;
		
		
		//Map for sheet 0
		HashMap<Fields, Integer> map = new HashMap<>();
		
		map.put(Fields.LAST_NAME, 1);
		map.put(Fields.FIRST_NAME, 2);
		map.put(Fields.DOB, 3);
		map.put(Fields.RACE, 5);
		map.put(Fields.GENDER, 6);
		map.put(Fields.ADDRESS, 7);
		map.put(Fields.ADDRESS2, 8);
		map.put(Fields.CITY, 9);
		map.put(Fields.STATE, 10);
		map.put(Fields.ZIP, 11);
		map.put(Fields.EMAIL, 12);
		map.put(Fields.PHONE, 13);
		map.put(Fields.STATUS, 17);
		map.put(Fields.DECEASED, 18);
		map.put(Fields.PRIMARY_CARE, 19);
		map.put(Fields.SPECIALIST, 20);
		map.put(Fields.CURRENT_STUDY, 21);
		map.put(Fields.REFERRAL, 22);
		map.put(Fields.MAIL_LIST, 23);
		
		
		//Map for sheet 1
		HashMap<Fields, Integer> map1 = new HashMap<>();
		
		map1.put(Fields.LAST_NAME, 1);
		map1.put(Fields.FIRST_NAME, 2);
		map1.put(Fields.DOB, 3);
		map1.put(Fields.PREVIOUS_DIAG, 4);
		map1.put(Fields.MEMORY_LOSS, 5);
		map1.put(Fields.MEMORY_DATE, 6);
		map1.put(Fields.DISRUPTS_LIFE, 7);
		map1.put(Fields.DIFFICULTY_PLANNING, 8);
		map1.put(Fields.DIFFICULTY_TASKS, 9);
		map1.put(Fields.DIFFICULTY_WORDS, 10);
		map1.put(Fields.FAMILY_HISTORY, 11);
		map1.put(Fields.FAMILY_RELATION, 12);
		map1.put(Fields.ARICEPT, 13);
		map1.put(Fields.ARICEPT_START, 14);
		map1.put(Fields.ARICEPT_STOP, 15);
		map1.put(Fields.NAMENDA, 16);
		map1.put(Fields.NAMENDA_START, 17);
		map1.put(Fields.NAMENDA_STOP, 18);
		map1.put(Fields.EXELON, 19);
		map1.put(Fields.EXELON_START, 20);
		map1.put(Fields.EXELON_STOP, 21);
		map1.put(Fields.RAZADYNE, 22);
		map1.put(Fields.RAZADYNE_START, 23);
		map1.put(Fields.RAZADYNE_STOP, 24);
		map1.put(Fields.ARICEPT_NAMENDA, 25);
		map1.put(Fields.ARINAM_START, 26);
		map1.put(Fields.ARINAM_STOP, 27);
		
		//Map for sheet 2
		HashMap<Fields, Integer> map2 = new HashMap<>();
		
		map2.put(Fields.FIRST_NAME, 1);
		map2.put(Fields.LAST_NAME, 2);
		map2.put(Fields.HPOA, 3);
		map2.put(Fields.POA_NAME, 4);
		map2.put(Fields.POA_PHONE, 5);
		map2.put(Fields.MARRIED, 6);
		map2.put(Fields.SPOUSE_NAME, 7);
		map2.put(Fields.SPOUSE_PHONE, 8);
		map2.put(Fields.CHILD, 9);
		map2.put(Fields.CHILD_NAME, 10);
		map2.put(Fields.CHILD_PHONE, 11);
		
		
		//Map for sheet 3
		HashMap<Fields, Integer> map3 = new HashMap<>();
		
		map3.put(Fields.FIRST_NAME, 1);
		map3.put(Fields.LAST_NAME, 2);
		map3.put(Fields.MENTAL_ILLNESS, 3);
		map3.put(Fields.SLEEP_DISORDER, 4);
		map3.put(Fields.CANCER, 5);
		map3.put(Fields.CANCER_TYPE, 6);
		map3.put(Fields.PACEMAKER_MRI, 7);
		map3.put(Fields.DRUG_ALCHOHOL, 8);
		map3.put(Fields.ONGOING_ISSUES, 9);
		
		
		
		
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
			
			Cell cell = row.createCell(map.get(Fields.LAST_NAME));
			cell.setCellValue(rd.getLastName());
			
			cell = row.createCell(map.get(Fields.FIRST_NAME));
			cell.setCellValue(rd.getFirstName());
			
			CellStyle cellStyle = workbook.createCellStyle();
			CreationHelper createHelper = workbook.getCreationHelper();
			cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("MM/dd/yyyy"));
			
			
			cell = row.createCell(map.get(Fields.DOB));
			cell.setCellValue(rd.getDOB());
			cell.setCellStyle(cellStyle);
			
			cell = row.createCell(4);
			cell.setCellFormula(formula);
			
			cell = row.createCell(map.get(Fields.RACE));
			cell.setCellValue(rd.getRace());
			
			cell = row.createCell(map.get(Fields.GENDER));
			cell.setCellValue(rd.getGender());
			
			cell = row.createCell(map.get(Fields.ADDRESS));
			cell.setCellValue(rd.getAddress());
			
			cell = row.createCell(map.get(Fields.ADDRESS2));
			cell.setCellValue(rd.getAddress2());
			
			cell = row.createCell(map.get(Fields.CITY));
			cell.setCellValue(rd.getCity());
			
			cell = row.createCell(map.get(Fields.STATE));
			cell.setCellValue(rd.getState());
			
			cell = row.createCell(map.get(Fields.ZIP));
			cell.setCellValue(rd.getZip());
			
			cell = row.createCell(map.get(Fields.EMAIL));
			cell.setCellValue(rd.getEmail());
			
			cell = row.createCell(map.get(Fields.PHONE));
			cell.setCellValue(rd.getPhone());
			
			cell = row.createCell(map.get(Fields.STATUS));
			cell.setCellValue(" ");
			
			cell = row.createCell(map.get(Fields.PRIMARY_CARE));
			cell.setCellValue(rd.getPcp());
			
			cell = row.createCell(map.get(Fields.DECEASED));
			cell.setCellValue(" ");
			
			cell = row.createCell(map.get(Fields.SPECIALIST));
			cell.setCellValue(rd.getSpec());
			
			cell = row.createCell(map.get(Fields.REFERRAL));
			cell.setCellValue(rd.getReferral());
			
			//cell = row.createCell(map.get(Fields.MAIL_LIST));
			//cell.setCellValue(rd.getMailList);
			
			
			//Sheet 1
            sheet = workbook.getSheetAt(1);
			
			rowCount = sheet.getLastRowNum();
			
			row = sheet.createRow(++rowCount);
			
			
			cell = row.createCell(map1.get(Fields.LAST_NAME));
			cell.setCellValue(rd.getLastName());
			
			cell = row.createCell(map1.get(Fields.FIRST_NAME));
			cell.setCellValue(rd.getFirstName());
			
			cell = row.createCell(map1.get(Fields.DOB));
			cell.setCellValue(rd.getDOB());
			cell.setCellStyle(cellStyle);
			
			cell = row.createCell(map1.get(Fields.PREVIOUS_DIAG));
			cell.setCellValue(rd.getDiagnosis());
			
			cell = row.createCell(map1.get(Fields.MEMORY_LOSS));
			if(rd.getMemoryLoss())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			
			if(rd.getMemoryLoss())
			{
				if(rd.getMemoryLossDate() != null)
				{
					cell = row.createCell(map1.get(Fields.MEMORY_DATE));
					cell.setCellValue(rd.getMemoryLossDate());
					cell.setCellStyle(cellStyle);
				}
			}
			
			
			
			cell = row.createCell(map1.get(Fields.DISRUPTS_LIFE));
			if(rd.getMemoryDisruption())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map1.get(Fields.DIFFICULTY_PLANNING));
			if(rd.getProblemSolving())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map1.get(Fields.DIFFICULTY_TASKS));
			if(rd.getFamiliarTask())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map1.get(Fields.DIFFICULTY_WORDS));
			if(rd.getProblemsConversations())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map1.get(Fields.FAMILY_HISTORY));
			if(rd.getFamilyHistory())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map1.get(Fields.FAMILY_RELATION));
			cell.setCellValue(rd.getFamilyRelation());
			
			cell = row.createCell(map1.get(Fields.ARICEPT));
			if(rd.getAricept())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			if(rd.getAricept())
			{
				if(rd.getAriceptNamendaStartDate() != null)
				{
					cell = row.createCell(map1.get(Fields.ARICEPT_START));
					cell.setCellValue(rd.getAriceptStartDate());
					cell.setCellStyle(cellStyle);
				}
				
				if(rd.getAriceptNamendaStopDate() != null)
				{
					cell = row.createCell(map1.get(Fields.ARICEPT_STOP));
					cell.setCellValue(rd.getAriceptStopDate());
					cell.setCellStyle(cellStyle);
				}
			}
			
			
			cell = row.createCell(map1.get(Fields.NAMENDA));
			if(rd.getNamenda())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			if(rd.getNamenda())
			{
				if(rd.getNamendaStartDate() != null)
				{
					cell = row.createCell(map1.get(Fields.NAMENDA_START));
					cell.setCellValue(rd.getNamendaStartDate());
					cell.setCellStyle(cellStyle);
				}
				
				if(rd.getAriceptNamendaStopDate() != null)
				{
					cell = row.createCell(map1.get(Fields.NAMENDA_STOP));
					cell.setCellValue(rd.getNamendaStopDate());
					cell.setCellStyle(cellStyle);
				}
			}
			
			cell = row.createCell(map1.get(Fields.EXELON));
			if(rd.getExelon())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			if(rd.getExelon())
			{
				if(rd.getExelonStartDate() != null)
				{
					cell = row.createCell(map1.get(Fields.EXELON_START));
					cell.setCellValue(rd.getExelonStartDate());
					cell.setCellStyle(cellStyle);
				}
				
				if(rd.getExelonStopDate() != null)
				{
					cell = row.createCell(map1.get(Fields.EXELON_STOP));
					cell.setCellValue(rd.getExelonStopDate());
					cell.setCellStyle(cellStyle);
				}
			}
			
			
			cell = row.createCell(map1.get(Fields.RAZADYNE));
			if(rd.getRazadyne())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			if(rd.getRazadyne())
			{
				if(rd.getRazadyneStartDate() != null)
				{
					cell = row.createCell(map1.get(Fields.RAZADYNE_START));
					cell.setCellValue(rd.getRazadyneStartDate());
					cell.setCellStyle(cellStyle);
				}
				
				if(rd.getRazadyneStopDate() != null)
				{
					cell = row.createCell(map1.get(Fields.RAZADYNE_STOP));
					cell.setCellValue(rd.getRazadyneStopDate());
					cell.setCellStyle(cellStyle);
				}
			}
			
			
			cell = row.createCell(map1.get(Fields.ARICEPT_NAMENDA));
			if(rd.getAriceptNamenda())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			if(rd.getAriceptNamenda())
			{
				if(rd.getAriceptNamendaStartDate() != null)
				{
					cell = row.createCell(map1.get(Fields.ARINAM_START));
					cell.setCellValue(rd.getAriceptNamendaStartDate());
					cell.setCellStyle(cellStyle);
				}
				
				if(rd.getAriceptNamendaStopDate() != null)
				{
					cell = row.createCell(map1.get(Fields.ARINAM_STOP));
					cell.setCellValue(rd.getAriceptNamendaStopDate());
					cell.setCellStyle(cellStyle);
				}
				
			}
			
			
			
			//sheet 2
            sheet = workbook.getSheetAt(2);
			
			rowCount = sheet.getLastRowNum();
			
			row = sheet.createRow(++rowCount);
			
			cell = row.createCell(map2.get(Fields.FIRST_NAME));
			cell.setCellValue(rd.getFirstName());
			
			cell = row.createCell(map2.get(Fields.LAST_NAME));
			cell.setCellValue(rd.getLastName());
			
			cell = row.createCell(map2.get(Fields.HPOA));
			if(rd.getPoa())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map2.get(Fields.POA_NAME));
			cell.setCellValue(rd.getPoaFirstName() + " " + rd.getPoaLastName());
			
			cell = row.createCell(map2.get(Fields.POA_PHONE));
			cell.setCellValue(rd.getPoaPhone());
			
			cell = row.createCell(map2.get(Fields.MARRIED));
			if(rd.getSpouse())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map2.get(Fields.SPOUSE_NAME));
			cell.setCellValue(rd.getSpouseFistName() + " " + rd.getSpouseLastName());
			
			cell = row.createCell(map2.get(Fields.SPOUSE_PHONE));
			cell.setCellValue(rd.getSpousePhone());
			
			cell = row.createCell(map2.get(Fields.CHILD));
			if(rd.getChild())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map2.get(Fields.CHILD_NAME));
			cell.setCellValue(rd.getChildFirstName() + " " + rd.getChildLastName());
			
			cell = row.createCell(map2.get(Fields.CHILD_PHONE));
			cell.setCellValue(rd.getChildPhone());
			
			
			//sheet 3
            sheet = workbook.getSheetAt(3);
			
			rowCount = sheet.getLastRowNum();
			
			row = sheet.createRow(++rowCount);
			
			cell = row.createCell(map3.get(Fields.FIRST_NAME));
			cell.setCellValue(rd.getFirstName());
			
			cell = row.createCell(map3.get(Fields.LAST_NAME));
			cell.setCellValue(rd.getLastName());
			
			cell = row.createCell(map3.get(Fields.MENTAL_ILLNESS));
			if(rd.getMentalIllness())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map3.get(Fields.SLEEP_DISORDER));
			if(rd.getSleedDisorder())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map3.get(Fields.CANCER));
			if(rd.getCancerHistory())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map3.get(Fields.CANCER_TYPE));
			cell.setCellValue(rd.getCancerType());
			
			cell = row.createCell(map3.get(Fields.PACEMAKER_MRI));
			if(rd.getPacemakerMRI())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map3.get(Fields.DRUG_ALCHOHOL));
			if(rd.getSubstanceAbuse())
			{
				cell.setCellValue("Yes");
			}
			else
			{
				cell.setCellValue("No");
			}
			
			cell = row.createCell(map3.get(Fields.ONGOING_ISSUES));
			cell.setCellValue(rd.getOngoingIssues());
			
			
			
			inputStream.close();
			
			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);
			workbook.close();
			outputStream.close();
			
			return true;
		
	}
}

	

