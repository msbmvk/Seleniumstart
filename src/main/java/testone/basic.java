package testone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basic {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}

}
