package pl.javastart.witaj;
import java.util.Scanner;

public class Witaj {

	public static void main(String[] args) {
		String powitanie = "Podaj swoje imie";
		System.out.println(powitanie);
		String imie; //tutaj zapiszemy imi�
		@SuppressWarnings("resource")
		Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika

		imie = odczyt.nextLine();
		switch(imie) {
		case"Micha�":
			System.out.println("Witaj "+imie);
			break;
		case"�ukasz":
			System.out.println("Witaj "+imie);
			break;
		case"Marcin":
			System.out.println("Witaj "+imie);
			break;
		default:
			System.out.println("Chyba si� nie znamy :)");
		}		
		
	}

}
