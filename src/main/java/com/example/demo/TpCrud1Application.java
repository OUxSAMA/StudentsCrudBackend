package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entities.Student;

@SpringBootApplication
public class TpCrud1Application implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(TpCrud1Application.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		
		studentRepository.save(new Student(2,"akali","JUI771P",1120,"passable"));
		
		studentRepository.findAll().forEach(p->{
			System.out.println(p.getName());
		});
		
	}

}
