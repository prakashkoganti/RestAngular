package com.java.spring.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpUtils {

	public static String convertDateToString(Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/YYYY");
		return sdf.format(date);
		
	}
}
