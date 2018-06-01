/**
 * Interface for access to the database through the DAO
 * 
 * @author Kevin Franks
 */

package edu.tridentech.rsfh.alzintake.dao;



public interface DbObject 
{
	boolean saveRecord(PartRecord pr);
	boolean updateRecord(PartRecord pr);
}
