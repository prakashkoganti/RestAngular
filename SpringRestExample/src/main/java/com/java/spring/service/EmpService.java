package com.java.spring.service;

import com.java.spring.dto.Emp;

public interface EmpService {

	Emp addNewUser(Emp emp);

	Emp getUser(Long id);
}
