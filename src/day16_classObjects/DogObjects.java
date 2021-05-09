package day16_classObjects;

public class DogObjects {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog1.age=10;
		dog1.color="Red";
		dog1.breed="Maltese";
		dog1.name="Rover";
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		dog2.breed="Beagle";
		dog2.color="white";
		dog2.name="Sozy";
		dog2.age=3;
		
		System.out.println(dog2.age);
		System.out.println(dog2.name);
		System.out.println(dog2.color);
		System.out.println(dog2.breed);
		
		dog2.barking();
		dog2.hungry();
		dog2.sleeping();
		
		dog3.age=2;
		dog3.breed="Mastiff";
		dog3.name="Kiki";
		dog3.color="white";
		
		System.out.println(dog3.age);
		System.out.println(dog3.breed);
		System.out.println(dog3.color);
		System.out.println(dog3.name);
		
		dog3.hungry();
		dog3.sleeping();
		dog3.barking();
	}

}




