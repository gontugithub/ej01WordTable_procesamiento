package com.example.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.example.models.Data;

public class WriteDocx {
	
	
	public static void writeDataToTxt(ArrayList<Data> lista, String path) {
		
		try {
			
			FileWriter file = new FileWriter(path);
			BufferedWriter salida = new BufferedWriter(file);
			
			for(Data x : lista) {
				
				salida.write(x.toString());
				salida.newLine();
				
			}
			
			salida.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	

}
