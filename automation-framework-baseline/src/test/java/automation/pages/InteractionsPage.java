package automation.pages;

import automation.util.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import static automation.util.GlobalConstant.BASE_URL;
import static java.lang.Thread.sleep;

public class InteractionsPage extends BasePage {
    public static final String INTERACTIONS_PAGE_TITLE = "Interactions – ToolsQA – Demo Website to Practice Automation";
    public static final String INTERACTIONS_PAGE_URL = BASE_URL + "/interaction";
    public static final String DATE_PICKER_PAGE_URL = BASE_URL + "/date-picker";

    @FindBy(id = "datePickerMonthYearInput")
    public WebElement datePicker;

    public void pickDateOfCurrentMonth(int date) throws InterruptedException {
        datePicker.click();
        String xpath = String.format("//div[@class='react-datepicker__month']/div[@class='react-datepicker__week']/div[text()= '%s']", date);
        By xpathDate = By.xpath(xpath);
        WebElement datetoPick = DriverManager.getDriverManagerInstance().getDriver().findElement(xpathDate);
        datetoPick.click();
        sleep(15000);

    }

}
