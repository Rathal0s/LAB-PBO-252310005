
public class Praktikum_1 {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.barking();
		myDog.hungry();
		myDog.sleeping();
		myDog.puppyName("Buddy");
	}

	public class Dog {
		String breed;
		int age;
			String color;

			

			void barking() {
				System.out.println("Woof");
			}

			void hungry() {
				System.out.println("I'm hungry");
			}

			void sleeping() {
				System.out.println("Zzz");
			}

			void puppyName(String name) {
				System.out.println("My puppy's name is " +name);
			}
			

			Dog mydog = new Dog();
		mydog.hungry();
		String name = "Tomi";
		mydog.puppyName(name);
		
		}
		
	}


		
	


