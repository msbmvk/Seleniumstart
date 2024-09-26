import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class hashMapParc {

	public static void main(String[] args) {
		
		/*
		 * HashMap<Integer, String> Num = new HashMap<Integer, String>(); Num.put(1,
		 * "One"); Num.put(2, "Two"); Num.put(3, "Three"); Num.put(4, "Four");
		 * System.out.println(Num.size()); System.out.println(Num.get(3)); String line =
		 * "Xapth|\\span{@name='abc']"; String[] a = line.split("\\|");
		 * System.out.println(a[1]);
		 */
		String ss= "i surendra --    babu muppa-- "
				+ "        yuy++            uyu";
		
		//String[] split = ss.split("\\s+");
		String nyy = ss.replaceAll("\n", " ");
		String [] onlywords = nyy.split("[^a-zA-Z0-9']+");
		boolean st= true;
		if(!st) {
			System.out.println("it is false");
		}
		System.out.println(nyy);
		
		
		
		 String sentence = "This is a sample sentence to test the presence of certain words.";
	        List<String> words = List.of("sample", "test", "words", "banana");

	       

	}

}
