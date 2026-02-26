import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {

    @Test
    public void verifySortingByNameAZ() throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        if (System.getenv("CI") != null) {
            options.addArguments("--headless=new");
        }

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.get("https://practicesoftwaretesting.com/");

            try {
                WebElement cookieBtn = wait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.cssSelector("[data-test='consent-accept']")));
                cookieBtn.click();
            } catch (Exception ignored) {}

            WebElement sortDropdown = wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                            By.cssSelector("select[data-test='sort']")));

            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].scrollIntoView(true);", sortDropdown);
            Thread.sleep(500);


            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].value = 'name,asc'; " +
                            "arguments[0].dispatchEvent(new Event('change'));",
                    sortDropdown);

            Thread.sleep(3000);


            List<WebElement> productElements = wait.until(
                    ExpectedConditions.visibilityOfAllElementsLocatedBy(
                            By.cssSelector("[data-test='product-name']")));

            List<String> actualNames = new ArrayList<>();
            for (WebElement element : productElements) {
                actualNames.add(element.getText().trim());
            }

                System.out.println("Actual names from page: " + actualNames);

            List<String> expectedSortedNames = new ArrayList<>(actualNames);
            Collections.sort(expectedSortedNames);

            System.out.println("Expected sorted names: " + expectedSortedNames);

            assertEquals(expectedSortedNames, actualNames,
                    "Products are NOT sorted alphabetically A to Z!");

        } finally {
            driver.quit();
        }
    }
}