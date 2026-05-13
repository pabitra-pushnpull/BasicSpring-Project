package com.crud.service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.crud.model.EmployeeModel;

@Service
public class EmployeeServices {

	public Map<Integer, EmployeeModel> Mymap = new LinkedHashMap<>();
//	private  AtomicInteger id = new AtomicInteger();
	
	public Collection<EmployeeModel> getEmploye(){
		return Mymap.values();
	}
	
//	public boolean getEmployeeById(int id){
//		 Mymap.containsKey(id);
//		return 
//	}
	
	
	
	public String Addemp(EmployeeModel empModel ) {
//		empModel.setId(id.incrementAndGet());
		Mymap.put(empModel.getId(), empModel);
		 return "Successfully Added ";
	}
	
	
	
	public EmployeeModel updMap(int id , EmployeeModel empModel ) {
		empModel.setId(id);
		Mymap.put(empModel.getId(), empModel);
		return Mymap.get(id);
	}
	
	public String updMap(int id, int age, EmployeeModel emp) {
		emp.setId(id);
//		emp.setAge(age);
		Mymap.put(emp.getId() , emp );
		return "Successfully Updated of Age : " + age ;
	}
	
	
	public String deleteMap(int id)
	{
		if(Mymap.containsKey(id))
		{
			 Mymap.remove(id);	
			 return "Data Deleted";
		}
		else
		{
			return "Data Not Deleted";
		}
		
	}
	
	
	
	
	
}
