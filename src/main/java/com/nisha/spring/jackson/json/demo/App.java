package com.nisha.spring.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) {
		
		try {
			// create the object mapper
			ObjectMapper mapper = new ObjectMapper();

			// read JSON file and map/convert to JAVA POJO: data/sample-lite.json
			Student student = mapper.readValue(
					new File("data/sample-lite.json"), Student.class);

			// print the firstName and lastName
			System.out.println("First Name = " + student.getFirstName());
			System.out.println("Last Name = " + student.getLastName());
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}
