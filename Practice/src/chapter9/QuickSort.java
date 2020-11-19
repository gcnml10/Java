package chapter9;

public class QuickSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("QucikSort ascending");
	}

	@Override
	public void decending(int[] arr) {
		System.out.println("QucikSort decending");
	}
	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QucikSort ¿‘¥œ¥Ÿ.");
	}

}
