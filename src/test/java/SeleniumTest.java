

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	static WebDriver driver = null;
	private static String namePaginaPrincipal;
	
	public SeleniumTest() {
		
	}
	
	

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\anderson Petro\\eclipse-workspace\\Trabalho17\\src\\main\\java\\Agenda.html");
		namePaginaPrincipal = driver.getWindowHandle();
	}
	
	@Test
	public void testTituloDaPagina() {
		driver.get("C:\\Users\\anderson Petro\\eclipse-workspace\\Trabalho17\\src\\main\\java\\Agenda.html");
		String tituloEsperado = "Agenda";
		Assert.assertEquals(tituloEsperado, driver.getTitle());
	}
	
	
	
	 @AfterClass
	 public static void tearDown() {
	     driver.quit();
	 }
	 
}
