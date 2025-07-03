package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class CalculatorBasicPage extends BasePage
{

    WebDriverWait myWait = new WebDriverWait(driver, Duration.of(15, ChronoUnit.SECONDS));


    public CalculatorBasicPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//button[normalize-space()=\"0\"]")
    WebElement digit_0;

    @FindBy(xpath = "//button[normalize-space()=\"1\"]")
    WebElement digit_1;

    @FindBy(xpath = "//button[normalize-space()=\"2\"]")
    WebElement digit_2;

    @FindBy(xpath = "//button[normalize-space()=\"3\"]")
    WebElement digit_3;

    @FindBy(xpath = "//button[normalize-space()=\"4\"]")
    WebElement digit_4;

    @FindBy(xpath = "//button[normalize-space()=\"5\"]")
    WebElement digit_5;

    @FindBy(xpath = "//button[normalize-space()=\"6\"]")
    WebElement digit_6;

    @FindBy(xpath = "//button[normalize-space()=\"7\"]")
    WebElement digit_7;

    @FindBy(xpath = "//button[normalize-space()=\"8\"]")
    WebElement digit_8;

    @FindBy(xpath = "//button[normalize-space()=\"9\"]")
    WebElement digit_9;

    @FindBy(xpath = "//button[normalize-space()=\"+\"]")
    WebElement additionOperator;

    @FindBy(xpath = "//button[normalize-space()=\"-\"]")
    WebElement subtractOperator;

    @FindBy(xpath = "//button[normalize-space()=\"*\"]")
    WebElement multiplyOperator;

    @FindBy(xpath = "//button[normalize-space()=\"/\"]")
    WebElement divisionOperator;

    @FindBy(xpath = "//button[normalize-space()=\"=\"]")
    WebElement equalOperator;

    @FindBy(xpath = "//button[normalize-space()=\"(\"]")
    WebElement openingBracket;

    @FindBy(xpath = "//button[normalize-space()=\")\"]")
    WebElement closingBracket;

    @FindBy(xpath = "//button[normalize-space()=\".\"]")
    WebElement decimalPoint;


    @FindBy(xpath = "//button[normalize-space()=\"C\"]")
    WebElement clearButton;


    @FindBy(xpath = "//button[contains(text(),'⌫')]")
    WebElement editBackspaceButton;


    @FindBy(xpath = "//div[@class=\"p-4\"]/div/div[2]")
    WebElement resultBox;

    @FindBy(xpath = "//div[@class=\"p-4\"]/div/div[1]")
    WebElement inputResultBox;



    //Actions

    public void click_0(){
        digit_0.click();
    }

    public void click_1(){
        digit_1.click();
    }

    public void click_2(){
        digit_2.click();
    }

    public void click_3(){
        digit_3.click();
    }

    public void click_4(){
        digit_4.click();
    }

    public void click_5(){
        digit_5.click();
    }

    public void click_6(){
        digit_6.click();
    }

    public void click_7(){
        digit_7.click();
    }

    public void click_8(){
        digit_8.click();
    }

    public void click_9(){
        digit_9.click();
    }

    public void clickAdditionOperator(){
        additionOperator.click();
    }

    public void clickSubtractionOperator(){
        subtractOperator.click();
    }

    public void clickMultiplyOperator(){
        multiplyOperator.click();
    }

    public void clickDivisionOperator(){
        divisionOperator.click();
    }

    public void clickEqualOperator(){
        equalOperator.click();
    }

    public void clickOpeningBracket(){
        openingBracket.click();
    }

    public void clickClosingBracket(){
        closingBracket.click();
    }

    public void clickDecimalPoint(){
        decimalPoint.click();
    }

    public void clickClearButton(){
        clearButton.click();
    }

    public void clickEditBackspaceButton(){
        editBackspaceButton.click();
    }


    public String getResult(){
        return resultBox.getText();
    }



    public String getInputResult(){
        return inputResultBox.getText();
    }















}
