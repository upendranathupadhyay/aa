package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.model.Status;
import com.model.StudentModel;
import com.service.StudentServiceImpl;

@EnableWebMvc
@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImpl service;
	
	public StudentController() {
		System.out.println("country controller created");
	}
	
	
	@RequestMapping(value = "/students", headers="Accept=application/json",method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<StudentModel> listStudents()
	{
		System.out.println("liststudent:controller called");
		try
		{
			return service.listStudents();
		}
		catch (Exception e)
		{
			
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value="/student/{id}" ,headers="Accept=application/json",method=RequestMethod.GET)
	public StudentModel getStudent(@PathVariable("id")Integer id)
	{
		System.out.println("getstudent:controller called");
		try 
		{
			return service.getStudent(id);
		}
		catch (Exception e) 
		{
			
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value="/delete/{id}" ,headers="Accept=application/json",method=RequestMethod.DELETE)
	public Status deleteStudent(@PathVariable("id")Integer id)
	{
		System.out.println("deletestudent:controller called");
		Status status = new Status();
		try 
		{
			service.deleteStudent(id);
			status.setCode(200);
			status.setMessage("student deleted succesfully");
			
		} 
		catch (Exception e) 
		{
			status.setCode(400);
			status.setMessage("student not deleted");
			e.printStackTrace();
			
		}
		return status;
	}
	
	@RequestMapping(value="/create",method=RequestMethod.PUT,headers="Accept=application/json")
	public Status createStudent(@RequestBody StudentModel student)
	{
		System.out.println("createstudent:controller called");
		Status status= new Status();
		
		try 
		{
			service.createStudent(student);
			status.setCode(200);
			status.setMessage("student created succesfully");
		}
		catch (Exception e)
		{
			status.setCode(400);
			status.setMessage("student not created");
			e.printStackTrace();
		}
		return status;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST,headers="Accept=application/json")
	public Status updateStudent(@RequestBody StudentModel student)
	{
		System.out.println("updatestudent:controller called");
		Status status= new Status();
		
		try 
		{
			service.updateStudent(student);
			status.setCode(200);
			status.setMessage("student updated succesfully");
		} 
		catch (Exception e)
		{
			status.setCode(400);
			status.setMessage("student not updated");
			e.printStackTrace();
		}
		return status;
	}
}
