 package com.nagarro.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
