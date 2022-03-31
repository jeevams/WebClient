package com.example.webclient2.jparespo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webclient2.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
