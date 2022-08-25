package pages;

import browser.Browser;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class PIMPage {
    WebDriver driver = Browser.driver;
    @FindBy(linkText = "Recruitment") private WebElement recruitment;
@FindBy(css = "button[type='submit']") private WebElement submitBTN;

@FindBy(xpath = "//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]/div[3]/div")
private WebElement firstNameElement;

    @FindBy(xpath = "//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]/div[4]/div")
    private WebElement lastNameElement;

    public RecruitmentPage navigateToRecruitmentPage(){

recruitment.click();
return PageFactory.initElements(Browser.driver, RecruitmentPage.class);


    }
public PIMPage searchEmployeeID(String id){
List<WebElement>element= driver.findElements(By.cssSelector(".oxd-input.oxd-input--active"));
element.get(1).sendKeys(id);
submitBTN.click();
return PageFactory.initElements(Browser.driver, PIMPage.class);
//return this;
}
public PIMPage validateFirstandLastName(String firstName,String lastname ){

    Assert.assertEquals(firstNameElement.getText(), firstName);
    Assert.assertEquals(lastNameElement.getText(), lastname);
    return this;
}



}
