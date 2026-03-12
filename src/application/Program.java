package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:/projetos-eclipse/projeto_gallao_busca/bin/application/Gallao.txt"))) {
		      String line;
		      while ((line = br.readLine()) != null) {
				
		        System.out.println(line);
		      }
		    } catch (IOException e) {
		      System.out.println("Error reading file.");
		    }
		  }
		

	}

