package stringsmethods;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println("capacity: "+sb.capacity());
		
		sb.append("Hello, keep coding");
		sb.append(" Happy Coding");
		
		System.out.println("sb: "+sb);
		System.out.println("capacity: "+sb.capacity());
		
		System.out.println("charAt: "+sb.charAt(10));
		
		System.out.println("reverse: "+sb.reverse());
		
		System.out.println("insert: "+sb.insert(10,"hello"));
		System.out.println("delete: "+sb.delete(1,3));
		
	}

}
