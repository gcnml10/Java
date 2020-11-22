package chapter10;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate mydate = (MyDate)obj;
			if (this.day == mydate.day && this.month == mydate.month && this.year == mydate.year) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return day*11 + month*101 + year*1001;
	}
}


public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(22, 11, 2020);
		MyDate date2 = new MyDate(22, 11, 2020);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		
		System.out.println(System.identityHashCode(date1));
		System.out.println(System.identityHashCode(date2));
	}

}
