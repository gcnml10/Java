package staticex;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if (instance == null) {               //Ȥ�ó� �ؼ�
			instance = new Company();
		}
		return instance;
	}
	
	

}
