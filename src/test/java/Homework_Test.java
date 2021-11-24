import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class Homework_Test extends TestBase {

    @ParameterizedTest
    @ValueSource(strings = {"Logowanie na koncie"})
    @Tag("regresja")
    @Tag("SiiPortal")
    @DisplayName("SiiPortal.pl site test")
    void pageOneTest(String expectedValue) {
        driver.get("https://siiportal.sii.pl/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedValue));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    @Tag("regresja")
    @Tag("Onet")
    @DisplayName("Onet.pl site test")
    void pageTwoTest(String expectedValue) {
        driver.get("https://www.onet.pl/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedValue));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    @Tag("regresja")
    @Tag("Kotuszkowo")
    @DisplayName("Kotuszkowo.pl site test")
    void pageThreeTest(String expectedValue) {
        driver.get("http://kotuszkowo.pl/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedValue));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    @Tag("regresja")
    @Tag("Filmweb")
    @DisplayName("Filmweb.pl site test")
    void pageFourTest(String expectedValue) {
        driver.get("https://www.filmweb.pl/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedValue));
    }

    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    @Tag("regresja")
    @Tag("webDriver")
    @DisplayName("WebDriver site test")
    void pageFiveTest(String expectedValue) {
        driver.get("https://www.selenium.dev/documentation/en/webdriver/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedValue));
    }
}
