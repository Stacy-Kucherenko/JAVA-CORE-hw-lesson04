package lviv.lgs.ua;

public class AnimalApplication {
public static void main(String[] args) {
	
//	1)
	Animal a = new Animal ("�������", "20 ��/���", "7 ����");
	System.out.println(a);
	
//  2)
	a.setAnimalName(null);
	a.setAnimalSpeed(null);
	a.setAnimalAge(null);
	
	System.out.println(a);

//	3)
	a.setAnimalName("���");
	a.setAnimalSpeed("2 ��/���");
	a.setAnimalAge(" 14 ����");
	
	System.out.println(a);
}
}
