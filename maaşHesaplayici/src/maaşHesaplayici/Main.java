package maaşHesaplayici;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Selin", 12000, 42, 2003);
		Employee e2  =new Employee("Serhat", 10000, 39, 2002);
		
		e1.toStringS();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		e2.toStringS();
	}

}
