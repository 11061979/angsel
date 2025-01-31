package seleniumanguel.angelselenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		// by Css
		/*
		 * driver.findElement(By.cssSelector(
		 * "#buttons ytd-button-renderer yt-button-shape a yt-touch-feedback-shape div div:nth-child(2)\n"
		 * + ""));
		 */
		// by Xpath
		driver.findElement(By.xpath(
				"//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Thread.sleep(3000);

		


		
		//angelselenium

	



		driver.findElement(By
				.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"))
				.click();

	}

}
