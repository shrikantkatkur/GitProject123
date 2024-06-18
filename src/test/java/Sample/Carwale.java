package Sample;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Carwale {
	public static void main(String[] args) {
		RemoteWebDriver driver = new FirefoxDriver();
		// driver.get("https://www.cardekho.com/");
//		List<WebElement> ele = driver.findElements(By.cssSelector(
//				"section.ViewAllCard.featuresSection.cardViewAll.shadow24.marginBottom20.clearfix div.gsc_ta_scroll.gsc_ta_scroll_move>ul>li"));
//		for (WebElement name : ele) {
//			String s = name.getText();
//			System.out.println(s);
//		}

//		driver.get("https://www.amazon.in/");
//
//		Actions action = new Actions(driver);
//		WebElement ele = driver.findElement(By.cssSelector("div#nav-tools>a#icp-nav-flyout"));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		action.moveToElement(ele);
//		action.perform();
//		
//		List<WebElement> languages = driver.findElements(By.cssSelector("div#nav-flyout-icp>div a"));
//		for (WebElement lang : languages) {
//			String langtext = lang.getText();
//			if (langtext.contains("HI")) {
//				lang.click();
//				System.out.println(langtext);
//			}
//
//		}

		driver.get("https://www.lokmat.com/");
		List<WebElement> allData = driver.findElements(By.cssSelector("div aside.follow-us>p.follow-icons>a"));
		for (WebElement webElement : allData) {
			webElement.click();
		}
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String string : allWindow) {
			if (allWindow.contains(parentWindow)) {

			} else {

				driver.switchTo().window(string);
				String title = driver.getTitle();
				System.out.println(title);

			}
//			 allWindow.remove(parentWindow);
//			 for (String string : allWindow) {
//				driver.switchTo().window(string);
				
			}

		}
	}
