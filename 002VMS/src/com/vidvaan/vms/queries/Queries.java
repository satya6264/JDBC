package com.vidvaan.vms.queries;

public interface Queries {

	String STD_INSERT = "INSERT INTO STUDENT VALUES(?,?,?)";
	String STD_UPDATE_BY_ID = "UPDATE STUDENT SET SNAME=?, SFEE=? WHERE SID=?";
	String STD_DELETE_BY_ID = "DELETE STUDENT WHERE SID=?";

}
