package immutable;

public class ImmutableDemo {

	public static void main(String[] args) {
		
		
		String string1 = "tim";
		String string2 = "tom";
		
		System.out.println("Before Concat\n "+string1+"\n "+string2);
		string1 = string1.concat(string2);
		System.out.println("After Concat\n "+string1+"\n "+string2);
		
	}

}
