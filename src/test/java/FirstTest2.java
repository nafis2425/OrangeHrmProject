import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class FirstTest2 extends TestBase  {

    WebDriver driver;

    @Test
    public void test01() throws InterruptedException {
        startLoginPage().loginToPIMPage();
        Thread.sleep(5000);
    }


}
