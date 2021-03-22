package com.vidvaan.queries;

public interface Queries {
	String STD_INSERT = "INSERT INTO STUDENT VALUES(?,?,?)";
	String STD_UPDATE_BY_ID = "UPDATE STUDENT SET SNAME = ?, SFEE = ? WHERE SID=?";
	String STD_DELETE_BY_ID = "DELETE STUDENT WHERE SID = ?";
	String STD_FIND_BY_ID = "SELECT * FROM STUDENT WHERE SID = ?";
	String STD_FINDALL = "SELECT * FROM STUDENT";
	String STD_NAME_LIKE = "SELECT * FROM STUDENT WHERE SNAME LIKE ?";

}
