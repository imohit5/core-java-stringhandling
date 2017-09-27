package stringsmethods;

public class StringMethods1 {

	public static void main(String[] args) {
		String s = "Tommy";
		
		System.out.println("length"+s.length());
		System.out.println("indexOf"+s.indexOf('m'));
		System.out.println("length"+s.charAt(3));
		System.out.println("length"+s.substring(2));
		System.out.println("length"+s.substring(1, 3));
		
		String r = "Tim Tom";
		
		System.out.println("upper"+r.toUpperCase());
		System.out.println("lower"+r.toLowerCase());
		System.out.println("replace"+r.replace('T', 'P'));
		
		String[] split = r.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println("split[i]"+split[i]);
		}
		
	}

}
