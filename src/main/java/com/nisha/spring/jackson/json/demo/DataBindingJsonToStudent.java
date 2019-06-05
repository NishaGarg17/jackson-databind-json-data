package com.nisha.spring.jackson.json.demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class DataBindingJsonToStudent {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println(student);
		} catch (JsonParseException e) {		
			e.printStackTrace();
		} catch (JsonMappingException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
