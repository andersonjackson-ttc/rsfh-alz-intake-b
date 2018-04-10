/**
 * Used for testing RSFH DAO
 * 
 * @author Kevin Franks
 */

package edu.tridentech.rsfh.alzintake.dao;

import java.util.Date;

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

	@Override
	public PartRecord findRecord(int idNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PartRecord findRecord(String lastName, int phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PartRecord findRecord(String lastName, Date dob) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
