package lviv.lgs.ua;

public class Robot {
	

	
	private String name;
	private String work;

	Robot (String name) {
		this.name = name;
	}
	
	public void work(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "ß "+ name + work;
	}



	


	

	
	
	
}
