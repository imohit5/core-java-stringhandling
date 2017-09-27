
public class StringsCreation {

	public static void main(String[] args) {
		
		String a = "example1";
		String b = new String("example2");
		char c[] = {'e','x','a','m','p','l','e','3'};
		String d = new String(c);
		byte e[] = {68,69,70};
		String f = new String(e);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
