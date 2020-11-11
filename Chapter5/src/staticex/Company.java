package staticex;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if (instance == null) {               //혹시나 해서
			instance = new Company();
		}
		return instance;
	}
	
	

}
