package pl.javastart.zapis;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapis{
  public static void main(String[] args) throws FileNotFoundException{
	  PrintWriter zapis = new PrintWriter("\\arch\\eclipse-workspace\\ala.txt");
	  zapis.println("Ala ma kota, a kot ma Al�");
	  zapis.close();
  }
}

