package staticex;

public class Student {
	
	public static int serialNum = 1000;
	private int studentID;
	public String studentName;  
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;
	} 
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNum() {
		int i = 0;
//		studentName = "Lee"; static에서 인스턴스 변수를 쓸 수 없음
		
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	

}