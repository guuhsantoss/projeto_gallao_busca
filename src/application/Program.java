package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("filename.txt"))) {
		      String line;
		      while ((line = br.readLine()) != null) {
		        System.out.println(line);
		      }
		    } catch (IOException e) {
		      System.out.println("Error reading file.");
		    }
		  }
		

	}

	public static void  showMenu() {
		System.out.println("Escolha o Cidade Origen: ");
		
		System.out.println("Escolha a Cidade Destino: ");
	}
}
