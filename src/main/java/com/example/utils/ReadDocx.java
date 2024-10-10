package com.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import com.example.models.Data;

public class ReadDocx {
	
	public static ArrayList<Data> readDocxToObject(String path) {
		
		ArrayList<Data> salida = new ArrayList<>();
		
		
		
		try {
			
			XWPFDocument documento = new XWPFDocument(new FileInputStream(path));
			
			List<XWPFTable> listaTablas = documento.getTables();
			
			for (XWPFTable tabla : listaTablas) {
				
				for(XWPFTableRow fila : tabla.getRows()) {
					
				String nombre =	fila.getCell(1).getText();
				String apellido = fila.getCell(2).getText();
				String edad = fila.getCell(3).getText();
				
				salida.add(new Data(nombre, apellido, edad));
				
			}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		return salida;
		
		
		
		
	}
	
	

}
