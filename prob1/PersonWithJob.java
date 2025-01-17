package lab3.prob1;

public class PersonWithJob extends Person {
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}
	


	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		
		// the answer is false because p1 is an instance of
		// PersonWithJob and p2 is an instance of Person. Hence they are using
		// different equals methods.This affects polymorphism.
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
