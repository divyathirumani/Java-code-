package com.example.Fullstackprojects.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Fullstackprojects.modle.Student;



public interface StudentInterface extends JpaRepository<Student,Integer> {
	
		

}

