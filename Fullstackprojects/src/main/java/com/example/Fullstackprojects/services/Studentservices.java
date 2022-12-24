package com.example.Fullstackprojects.services;
import java.util.List;

import com.example.Fullstackprojects.modle.Student;




public interface Studentservices {
		Student saveStudent(Student stdobj);
		List<Student>readAllStudents();
		Student fetchById(int studentId) throws Exception ;
		Student updatestudent(int id, Student value);
		void deleteStudent(int id);
	}


