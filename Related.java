class Animal {

	Animal() {
		System.out.println("Hello Animal");
	}

}
class Dog extends Animal {

	Dog() {
		System.out.println("Hello Dog");
	}


}
class Cat {

		Animal m1() {
		System.out.println("Hello");
		return new Animal();
		}
  	
}
class Food extends Cat {

	Dog m1() {
		System.out.println("World");
		return new Dog();
	}
}

public class Related {

	static public void main(String... Goku) {

		Food f = new Food();
		f.m1();
	}
}