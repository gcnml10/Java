package chapter9;

public class HeapSort implements Sort{
	
	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void decending(int[] arr) {
		System.out.println("HeapSort decending");
	}
	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort ¿‘¥œ¥Ÿ.");
	}
}
