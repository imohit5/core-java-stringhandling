package immutable;

public class StringPoolingDemo {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(123, "tim");
		System.out.println(employee1);
		
		Employee employee2 = new Employee(123, "tim");
		System.out.println(employee2);
		
		String string1 = "tim";
		String string2 = "tim";//tom //tim
		String string3 = "tim";
		
		System.out.println(string1);
		System.out.println(string1.hashCode());
		System.out.println(string2);
		System.out.println(string2.hashCode());
		System.out.println(string3);
		System.out.println(string3.hashCode());
		
	}

}
