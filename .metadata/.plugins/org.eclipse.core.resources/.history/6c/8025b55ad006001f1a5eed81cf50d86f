package test;

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends Dog { 
	HouseDog(String name) {
		this.setName(name);
	}
	
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}

	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + "hours");
	}
}

public class Test000 {
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog("happy");
		System.out.println(houseDog.name);
		houseDog.sleep();
		houseDog.sleep(3);
	}
}
