package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Cities;

public class Program {
	public static void main(String[] args) {
		List<Cities> list = new ArrayList<>();
		Cities c;
		
		try (BufferedReader br = new BufferedReader(new FileReader("/home/live/Documents/javaproject/projeto_gallao_busca/src/application/Gallao.txt"))) {
		      String line;
			  String[] name, vertices;
		      while ((line = br.readLine()) != null) {
			
				name = line.split(";");
				vertices = line.split(";");
				for (String s : vertices) {
					if () {
						
					}
				}


		      }
			  for(Cities l : list){
				System.out.println(l.getName());
			  }
		    } catch (IOException e) {
		      System.out.println("Error reading file.");
		    }
		  }
		

	}

