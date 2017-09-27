package immutable;

public class OrderDemo {

	public static void main(String[] args) {
		
//		mutable
		Order order = new Order(123, "laptop");
		System.out.println(order);
		
//		immutable
		String string = new String("laptop");
		System.out.println(string);
		
		Integer integer = new Integer(123);
		System.out.println(integer);
		
	}

}
