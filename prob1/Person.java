package lab3.prob1;


public class Person {

	private String name;
	
	Person(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null|| !(aPerson instanceof Person)) return false;
		Person p = (Person) aPerson;
		if(p.name.equals(name))return true;
		return false;
	}
	
	public static void main(String[] args) {
		
	}

}
