package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.StudentDao;
import com.model.StudentModel;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao dao;
	
	
	public StudentServiceImpl() {
		System.out.println("student service created");
	}


	
	@Override
	public boolean createStudent(StudentModel stu) throws Exception {
		System.out.println("createstudent:service called");
		return dao.createStudent(stu);
	}

	
	@Override
	public List<StudentModel> listStudents() throws Exception {
		System.out.println("liststudent:service called");
		return dao.listStudents();
	}



	@Override
	public StudentModel getStudent(Integer id) throws Exception {
		System.out.println("getstudent:service called");
		return dao.getStudent(id);
	}



	@Override
	public boolean deleteStudent(Integer id) throws Exception {
		System.out.println("deletestudent:service called");
		return dao.deleteStudent(id);
	}



	@Override
	public boolean updateStudent(StudentModel student) throws Exception {
		System.out.println("updatestudent:service called");
		return dao.updateStudent(student);
	}

	
	
}
