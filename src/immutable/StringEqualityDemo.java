package immutable;

public class StringEqualityDemo {

	public static void main(String[] args) {
				
		String string1 = "tim";
		String string2 = "tom";
		String string3 = "tim";
		String string4 = new String("tim");
		
		System.out.println(string1 == string3);
		System.out.println(string1.equals(string3));
		
		System.out.println(string2 == string3);
		System.out.println(string2.equals(string3));
		
		System.out.println(string1 == string4);
		System.out.println(string1.equals(string4));
		
		Employee employee1 = new Employee(123, "tim");
		System.out.println(employee1);
		
		Employee employee2 = new Employee(123, "tim");
		System.out.println(employee2);
		
		System.out.println(employee1 == employee2);
		System.out.println(employee1.equals(employee2));
		
	}

}
