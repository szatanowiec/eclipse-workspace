package pl.start.test;

public class Test {

	public static void main(String[] args) {
		String hello = "Witaj ";
		String world = "�wiecie!";
		String powitanie = hello + world; //�aczenie string�w
		System.out.println(powitanie);

		String czesc = powitanie.substring(0,6)+"uczniu";
		System.out.println(czesc);
	}

}
