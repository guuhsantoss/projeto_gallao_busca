package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Cities;
import entities.Vertices;

public class Program {
	public static void main(String[] args) {
		List<Cities> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/guuhs/ProjetosJava/projeto_gallao_busca/bin/application/Gallao.txt"))) {
		      String line;
			  String[] name, num;
		      while ((line = br.readLine()) != null) {
			
				name = line.split(";");
				Cities c = new Cities(name[0]);
				num = line.split(";");

				for (int i = 1; i < num.length; i++) {
					if(Integer.parseInt(num[i]) > -1){
						Vertices vertices = new Vertices(takeCitie(i), Integer.parseInt(num[i]));
						c.addList(vertices);
					}
				}
				list.add(c);

		      }
			  for(Cities l : list){
				System.out.println(l.getName());
				System.out.println(l.getList().toString());
			  }
		    } catch (IOException e) {
		      System.out.println("Error reading file.");
		    }
		  }
		  
		public static String takeCitie(Integer id){
			switch (id) {
				case 1:
					return "Piracicaba";
				case 2:
					return "Americana";
				case 3:
					return "Paulinia";
				case 4:
					return "Sumare";
				case 5:
					return "Campinas";
				case 6:
					return "MonteMor";
				case 7:
					return "Capivari";
				case 8:
					return "Tiete";
				case 9:
					return "Indaiatuba";
				case 10:
					return "Salto";
				case 11:
					return "PortoFeliz";
				case 12:
					return "Itu";
				case 13:
					return "Tatui";
				case 14:
					return "Boituva";
				case 15:
					return "Sorocaba";
			
				default:
					return "DeuRUim";
			}
		}

	}

