package com.java.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.spring.dto.Emp;
import com.java.spring.service.EmpService;

/**
 * Handles requests for the Employee service.
 */
@Controller
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
@Autowired
private EmpService empService;

	
	@RequestMapping(value = URIConstants.DUMMY_EMP, method = RequestMethod.GET)
	public @ResponseBody Emp getDummyEmployee() {
		logger.info("Start getDummyEmployee");
		Emp emp = new Emp();
//		emp.setId(9999l);
//		emp.setName("Dummy");
		return emp;
	}
	
	@RequestMapping(value = URIConstants.GET_EMP, method = RequestMethod.GET)
	public @ResponseBody Emp getEmployee(@PathVariable("id") int empId) {
		logger.info("Start getEmployee. ID="+empId);
		return empService.getUser(new Long(empId));
	}
	
//	@RequestMapping(value = URIConstants.GET_ALL_EMP, method = RequestMethod.GET)
//	public @ResponseBody List<Emp> getAllEmployees() {
//		logger.info("Start getAllEmployees.");
//		List<Emp> emps = new ArrayList<Emp>();
////		Set<Integer> empIdKeys = empData.keySet();
////		for(Integer i : empIdKeys){
////			emps.add(empData.get(i));
////		}
//		return emps;
//	}
	
	@RequestMapping(value = URIConstants.CREATE_EMP, method = RequestMethod.POST)
	public @ResponseBody Emp createEmployee(@RequestBody Emp emp) {
		logger.info("Start createEmployee.");
//		emp.setCreatedDate(new Date());
//		empData.put(emp.getId(), emp);
		empService.addNewUser(emp);
		System.out.println(emp.toString());
		return emp;
	}
	
	@RequestMapping(value = URIConstants.DELETE_EMP, method = RequestMethod.PUT)
	public @ResponseBody Emp deleteEmployee(@PathVariable("id") int empId) {
		logger.info("Start deleteEmployee.");
		Emp emp = new Emp();
		return emp;
	}
	
}
