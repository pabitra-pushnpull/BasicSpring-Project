package com.crud.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.EmployeeModel;
import com.crud.service.EmployeeServices;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServices empSer;
	
	@GetMapping("/employees")
	public Collection<EmployeeModel> getempdata()
	{
		return empSer.getEmploye();
	}
	
	@PostMapping("/addemployee")
	public String addEmployee(@RequestBody @Valid EmployeeModel employeeModel )
	{
		return empSer.Addemp(employeeModel);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public EmployeeModel updEmpMod(@PathVariable int id, @RequestBody EmployeeModel empModel) {
		return empSer.updMap(id, empModel);
	}
	
	@PutMapping("/updEmployee/{id}/{age}")
	public String updEmpModAge(@PathVariable int id, @PathVariable int age, @RequestBody EmployeeModel empModel) {
		return empSer.updMap(id, age, empModel);
	}
	
	 @DeleteMapping("/empdel/{id}")
	public String deleteData(@PathVariable int id)
	{
		return empSer.deleteMap(id);
	}
	
}
