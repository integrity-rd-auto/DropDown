import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\firefoxdriver.exe");

		driver.get("https://www.facebook.com/");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		String dob = "21-Jan-1978";

		String dobarr[] = dob.split("-");

		System.out.println(dobarr[0]);
		System.out.println(dobarr[1]);
		System.out.println(dobarr[2]);

		day.click();
		selectDropDown(day, dobarr[0]);
		month.click();
		selectDropDown(month, dobarr[1]);
		year.click();
		selectDropDown(year, dobarr[2]);

	}

	public static void selectDropDown(WebElement element, String date) {

		Select select = new Select(element);
		select.selectByVisibleText(date);
		
		System.out.println(select.isMultiple());
		System.out.println(select.getOptions().size());

	}

}
