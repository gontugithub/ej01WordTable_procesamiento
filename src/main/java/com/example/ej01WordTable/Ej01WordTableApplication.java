package com.example.ej01WordTable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.utils.ReadDocx;
import com.example.utils.WriteDocx;

@SpringBootApplication
public class Ej01WordTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ej01WordTableApplication.class, args);
		
		String path = "src/main/resources/static/Document.docx";
		String pathtxt = "src/main/resources/static/salida.txt";
		
		WriteDocx.writeDataToTxt(ReadDocx.readDocxToObject(path), pathtxt);
		
	}

}
