import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Appiumtest extends base {

    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver = capabilities();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Erisa\"));");

        driver.findElementByClassName("android.widget.EditText").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("ros");
        // Tekan tombol "Enter" pada keyboard virtual
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.view.ViewGroup")));
        driver.findElementsByClassName("android.view.ViewGroup").get(1).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.LinearLayout")));
        driver.findElementsByClassName("android.widget.LinearLayout").get(1).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.ImageButton")));
        driver.findElementsByClassName("android.widget.ImageButton").get(1).click();

        driver.findElementsByClassName("android.widget.ImageButton").get(0).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.Button")));
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.example.githubapis:id/fav_list\")").click();

        driver.findElementsByClassName("android.widget.ImageButton").get(0).click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.ImageView")));
        driver.findElementByAndroidUIAutomator("new UiSelector().description(\"More options\")").click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.LinearLayout")));
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.example.githubapis:id/content\")").click();
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.Switch")));
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.example.githubapis:id/switch_theme\")").click();
        
        driver.findElementsByClassName("android.widget.ImageButton").get(0).click();

    }
}
