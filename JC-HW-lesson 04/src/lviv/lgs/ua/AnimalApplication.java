package lviv.lgs.ua;

public class AnimalApplication {
public static void main(String[] args) {
	
//	1)
	Animal a = new Animal ("Леопард", "20 км/год", "7 років");
	System.out.println(a);
	
//  2)
	a.setAnimalName(null);
	a.setAnimalSpeed(null);
	a.setAnimalAge(null);
	
	System.out.println(a);

//	3)
	a.setAnimalName("Бик");
	a.setAnimalSpeed("2 км/год");
	a.setAnimalAge(" 14 років");
	
	System.out.println(a);
}
}
