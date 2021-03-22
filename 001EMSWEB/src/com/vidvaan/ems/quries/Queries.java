package com.vidvaan.ems.quries;

public interface Queries {
	String EMP_INSERT = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
	String EMP_UPDATE_BY_ID = "UPDATE EMPLOYEE SET ENAME = ?,ESAL = ? WHERE EID = ?";
	String EMP_DELETE_BY_ID = "DELETE EMPLOYEE WHERE EID = ?";
	String EMP_FIND_ALL = "SELECT * FROM EMPLOYEE";
	String EMP_FIND_BY_ID = "SELECT * FROM EMPLOYEE WHERE EID = ?";
    String EMP_NAME_LIKE = "SELECT * FROM EMPLOYEE WHERE ENAME LIKE ?";
}
