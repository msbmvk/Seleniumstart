package seleniumstart.seleniumstart;

import java.util.ArrayList;
import java.util.List;

public class TestLine {

	public static void main(String[] args) {
		String str = "\nHi\nHello\nYhes\r\nNHo\n";
		 
        List<String> lines = new ArrayList<>();
        //str.lines().forEach(s -> lines.add(s));
        str.lines().filter(f -> lines.contains("Hello"));
        //str.lines().filter(s -> lines.toUpperCase().contains("H"));
 
        System.out.println(lines);

	}

}
