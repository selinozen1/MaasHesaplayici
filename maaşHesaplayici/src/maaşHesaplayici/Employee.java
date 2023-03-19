package maaşHesaplayici;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	public double tax() {
		if(this.salary >= 1000) {
			return salary * 0.03;
		}else {
			return 0.0;
		}
	}
	public int bonus() {
		if(this.workHours > 40) {
			return (this.workHours - 40) * 30;
		}else {
			return 0;
			
		}
	}
	public double raiseSalary() {
		if((2021 - this.hireYear) < 10) {
			return (this.salary * 0.05);
		}else if((2021 - this.hireYear )> 9 && (2021 - this.hireYear) < 20) {
			return (this.salary * 0.1);
		}else if((2021 - this.hireYear) > 19);
		return (this.salary * 0.15);
	}
	
	public void toStringS() {
		System.out.println("Adi : " + this.name);
		System.out.println("Maasi : " + this.salary);
		System.out.println("Calisma saati : " + this.workHours);
		System.out.println("Baslangic yili : " + this.hireYear);
		System.out.println("Vergi : " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Maas artisi : " + raiseSalary());
		System.out.println("Vergi ve bonuslar ile birlikte maas : " + (this.salary + bonus() - tax()));
		System.out.println("Toplam maas : " + (this.salary +  + bonus() + raiseSalary() - tax()));
		
	}

}
