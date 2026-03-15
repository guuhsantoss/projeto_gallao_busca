package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cities;
import entities.Vertices;

public class Program {
	public static void main(String[] args) {
		List<Cities> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		try {
			list = readArchive(); // metodo para ler o arquivo e retornar uma lista
			for (Cities cities : list) {
				System.out.println(cities.getName());
			}
			System.out.println();
			System.out.println("Escreva a cidade de PARTIDA: ");
			String partida = sc.next();
			System.out.println("Escreva a cidade de DESTINO: ");
			String destino = sc.next();



		} catch (Exception e) {
			System.out.println("Deu ruim na leitura");
		}
		
		
	}

	public static String takeCity(Integer id) {
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

	public static List<Cities> readArchive() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("src/application/Gallao.txt")); 
			List<Cities> list = new ArrayList<>();
			String line;
			String[] name, distance;
			while ((line = br.readLine()) != null) {

				name = line.split(";");
				Cities c = new Cities(name[0]);
				distance = line.split(";");

				for (int i = 1; i < distance.length; i++) {
					if (Integer.parseInt(distance[i]) > -1) {
						Vertices vertices = new Vertices(takeCity(i), Integer.parseInt(distance[i]));
						c.addList(vertices);
					}
				}
				list.add(c);
			}
			return list;
	}
}
