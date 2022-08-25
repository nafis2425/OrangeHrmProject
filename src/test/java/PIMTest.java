import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PIMTest extends TestBase  {

    WebDriver driver;

    @Test
    public void test01() throws InterruptedException {
        startLoginPage()
                .loginToPIMPage()
                .searchEmployeeID("0083")
                .validateFirstandLastName("Joe","Root");
        Thread.sleep(5000);
    }
}
