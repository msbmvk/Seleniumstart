package seleniumstart.seleniumstart;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abc";
		if(a.equals("abc")) {
			String test="Surendra";
			a=test;
			System.out.println(test);
			System.out.println(a);
		}
		String s= "abajhgjg";
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf("a"));
		String r = "";
		StringBuilder sb= new StringBuilder(s);
		String res= sb.reverse().toString();
		System.out.println(res);
		for(int i=s.length()-1; i>=0; i--)
		{
			
			r=r+s.charAt(i);
		}
			System.out.println(r);
			if (r.equals(s)) {
				System.out.println("Palindrome");
			}else{
				System.out.println("Not a Palindrome");
			}
	}
	

	}

