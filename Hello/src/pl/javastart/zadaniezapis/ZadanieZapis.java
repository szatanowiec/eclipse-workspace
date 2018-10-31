package pl.javastart.zadaniezapis;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

@SuppressWarnings("unused")
public class ZadanieZapis {

	public static void main(String[] args) throws FileNotFoundException {
		String file_path = "\\arch\\eclipse-workspace\\ala.txt";  
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj swoje imiê");
		String imie = input.nextLine();

		PrintWriter zapis = new PrintWriter(file_path);
		zapis.print(imie);
		zapis.close();
		Scanner odczyt = new Scanner(new File(file_path));
		System.out.println(odczyt.nextLine());
	  }
	}
