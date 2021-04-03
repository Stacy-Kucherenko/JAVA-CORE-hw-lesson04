package lviv.lgs.ua;

public class Animal {

	private String animalName;
	private String animalSpeed;
	private String animalAge; 
	
	Animal (String animalName, String animalSpeed, String animalAge){
		this.animalName = animalName;
		this.animalSpeed = animalSpeed;
		this.animalAge = animalAge;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalSpeed() {
		return animalSpeed;
	}

	public void setAnimalSpeed(String animalSpeed) {
		this.animalSpeed = animalSpeed;
	}

	public String getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(String animalAge) {
		this.animalAge = animalAge;
	}

	@Override
	public String toString() {
		return "Назва тварини = " + animalName + ", Швидкість тварини = "  + animalSpeed + ", Вік тварини = " + animalAge + "]";
	}
	
	
	
}
