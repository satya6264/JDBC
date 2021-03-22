package com.vidvaan.ems.quries;

public interface Queries {

	String EMP_INSERT = "INSERT INTO EMPLOYEE2 VALUES(?,?,?)";
	String EMP_UPDATE_BY_ID = "UPDATE EMPLOYEE SET ENAME = ?, ESAL = ? WHERE EID=?";
    String EMP_DELETE_BBY_ID= "DELETE EMPLOYEE2 WHERE EID = ?";
    String EMP_FIND_ALL = "SELECT * FROM EMPLOYEE2";
    String EMP_FIND_BY_ID = "SELECT * FROM EMPLOYEE2 WHERE EID = ?";	
    String EMP_NAME_LIKE = "SELECT * FROM EMPLOYEE2 WHERE ENAME LIKE ?"; 
}
