package edu.tridentech.rsfh.alzintake.model;

import java.util.Date;

import edu.tridentech.rsfh.alzintake.dao.PartRecord;

public class Participant implements PartRecord {

	String screener;
	
	@Override
	public String getScreener() {
		return screener;
	}

	@Override
	public void setScreener(String screen) {
		screener = screen;
	}

	String middleI;
	
	@Override
	public String getMiddleI() {
		return middleI;
	}

	@Override
	public void setMiddleI(String mi) {
		middleI = mi;
		
	}
	
	String firstName;

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String name) {
		firstName = name;
		
	}
	
	String lastName;

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String name) {
		lastName = name;
		
	}
	
	Date DOB;

	@Override
	public Date getDOB() {
		return DOB;
	}

	@Override
	public void setDOB(Date dob) {
		DOB = dob;
		
	}
	
// RACE NOT SET IN PART RECORD

	String Race;
	
	@Override
	public String getRace() {
		return Race;
	}

	@Override
	public void setRace(String race) {
		Race = race;
	}

	String Gender;
	
	@Override
	public String getGender() {
		return Gender;
	}

	@Override
	public void setGender(String gender) {
		Gender = gender;
		
	}

	String Email;
	
	@Override
	public String getEmail() {
		return Email;
	}

	@Override
	public void setEmail(String email) {
		Email = email;
		
	}
	
	String referral;

	@Override
	public String getReferral() {
		return referral;
	}

	@Override
	public void setReferral(String ref) {
		referral = ref;
		
	}
	
	String Address;
	
	@Override
	public String getAddress() {
		return Address;
	}

	@Override
	public void setAddress(String address) {
		Address = address;
		
	}
	
	String City;

	@Override
	public String getCity() {
		return City;
	}

	@Override
	public void setCity(String city) {
		City = city;
		
	}

	String st;
	
	@Override
	public String getState() {
		return st;
	}

	@Override
	public void setState(String state) {
		st = state;
		
	}
	
	String zipCode;

	@Override
	public String getZip() {
		return zipCode;
	}

	@Override
	public void setZip(String zip) {
		zipCode = zip;
		
	}

	String phoneNum;
	
	@Override
	public String getPhone() {
		return phoneNum;
	}

	@Override
	public void setPhone(String phone) {
		phoneNum = phone;
		
	}

	String cellNum;
	
	@Override
	public String getCell() {
		return cellNum;
	}

	@Override
	public void setCell(String cell) {
		cellNum = cell;
				
	}

	String PCP;
	
	@Override
	public String getPcp() {
		return PCP;
	}

	@Override
	public void setPcp(String pcp) {
		PCP = pcp;
		
	}

	String specialist;
	
	@Override
	public String getSpec() {
		return specialist;
	}

	@Override
	public void setSpec(String spec) {
		specialist = spec;
		
	}

	Boolean partner;
	
	@Override
	public boolean getPartner() {
		return partner;
	}

	@Override
	public void setPartner(boolean prt) {
		partner = prt;
		
	}

	String partFirstName;
	
	@Override
	public String getPartFirstName() {
		return partFirstName;
	}

	@Override
	public void setPartFirstname(String name) {
		partFirstName = name;
		
	}

	String partLastName;
	
	@Override
	public String getPartLastName() {
		return partLastName;
	}

	@Override
	public void setPartLastName(String name) {
		partLastName = name;
		
	}
	
	String partPhone;

	@Override
	public String getPartPhone() {
		return partPhone;
	}

	@Override
	public void setPartPhone(String phone) {
		partPhone = phone;
		
	}

	String partEmail;
	
	@Override
	public String getPartEmail() {
		return partEmail;
	}

	@Override
	public void setPartEmail(String email) {
		partEmail = email;
		
	}
	
	String partRel;

	@Override
	public String getPartRel() {
		return partRel;
	}

	@Override
	public void setPartRel(String relation) {
		partRel = relation;
		
	}

	Boolean spouse;
	
	@Override
	public boolean getSpouse() {
		return spouse;
	}

	@Override
	public void setSpouse(boolean spo) {
		spouse = spo;
		
	}
	
	String spouseFirstName;

	@Override
	public String getSpouseFistName() {
		return spouseFirstName;
	}

	@Override
	public void setSpouseFirstName(String name) {
		spouseFirstName = name;
		
	}

	String spouseLastName;
	
	@Override
	public String getSpouseLastName() {
		return spouseLastName;
	}

	@Override
	public void setSpouseLastName(String name) {
		spouseLastName = name;
		
	}
	
	String spousePhone;

	@Override
	public String getSpousePhone() {
		return spousePhone;
	}

	@Override
	public void setSpousePhone(String phone) {
		spousePhone = phone;
		
	}
	
	Boolean haveChild;

	@Override
	public boolean getChild() {
		return haveChild;
	}

	@Override
	public void setChild(boolean child) {
		haveChild = child;
		
	}
	
	String childFirstName;

	@Override
	public String getChildFirstName() {
		return childFirstName;
	}

	@Override
	public void setChildFirstName(String name) {
		childFirstName = name;
		
	}

	String childLastName;
	
	@Override
	public String getChildLastName() {
		return childLastName;
	}

	@Override
	public void setChildLastName(String name) {
		childLastName = name;
		
	}
	
	String childPhone;

	@Override
	public String getChildPhone() {
		return childPhone;
	}

	@Override
	public void setChildPhone(String phone) {
		childPhone = phone;
		
	}
	

}
