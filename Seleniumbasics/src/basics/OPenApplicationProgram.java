package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPenApplicationProgram {
	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.navigate().to("https://www.selenium.dev/");
	}

}
