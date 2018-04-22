/**
 * Used for testing RSFH DAO
 * 
 * @author Kevin Franks
 */

package edu.tridentech.rsfh.alzintake.dao;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataBaseTest implements DbObject
{

	@Override
	public boolean saveRecord(PartRecord pr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateRecord(PartRecord pr) {
		// TODO Auto-generated method stub
		return false;
	}

	
	



public static void main(String[] args) throws Exception
{
	FileOutputStream out = new FileOutputStream("workbook.xlsx");
	Workbook wb = new XSSFWorkbook();
	
	Sheet s = wb.createSheet();
	
}

}
