package com.aka.app.member;

import java.sql.Date;

import com.aka.app.department.DepartmentVO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MemberVO {
	
	   private Long member_id;
	   private Long department_id;
	   private String email;
	   private Date hire_date;
	   private Date retire_date;
	   private String phone;
	   private String address;
	   private String user_id;
	   private String password;
	   private String username;
	   private Long role_id;
	   private String customer_key;
	   private String profil;
	   private String profil_ori;
	   private Long position_id;	
	  
	  
	  
	
}
