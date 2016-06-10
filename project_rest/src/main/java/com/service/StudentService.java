package com.service;

import java.util.List;

import com.model.StudentModel;

public interface StudentService {

	public boolean createStudent(StudentModel stu) throws Exception;
	public List<StudentModel> listStudents()throws Exception;
	public StudentModel getStudent(Integer id)throws Exception;
	public boolean deleteStudent(Integer id)throws Exception;
	public boolean updateStudent(StudentModel student)throws Exception;
}
