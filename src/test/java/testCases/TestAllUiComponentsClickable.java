package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CalculatorBasicPage;
import testBase.BaseTest;

public class TestAllUiComponentsClickable extends BaseTest {

    @Test(groups = {"Master","Regression"})
    public void testAllComponentsClickable()
    {
        CalculatorBasicPage cp = new CalculatorBasicPage(driver);

        //Digits
        cp.click_0();
        Assert.assertEquals(cp.getInputResult(),"0","Not Clickable Element 0");
        cp.clickClearButton();

        cp.click_1();
        Assert.assertEquals(cp.getInputResult(),"1","Not Clickable Element 1");
        cp.clickClearButton();

        cp.click_2();
        Assert.assertEquals(cp.getInputResult(),"2","Not Clickable Element 2");
        cp.clickClearButton();

        cp.click_3();
        Assert.assertEquals(cp.getInputResult(),"3","Not Clickable Element 3");
        cp.clickClearButton();


        cp.click_4();
        Assert.assertEquals(cp.getInputResult(),"4","Not Clickable Element 4");
        cp.clickClearButton();

        cp.click_5();
        Assert.assertEquals(cp.getInputResult(),"5","Not Clickable Element 5");
        cp.clickClearButton();

        cp.click_6();
        Assert.assertEquals(cp.getInputResult(),"6","Not Clickable Element 6");
        cp.clickClearButton();

        cp.click_7();
        Assert.assertEquals(cp.getInputResult(),"7","Not Clickable Element 7");
        cp.clickClearButton();

        cp.click_8();
        Assert.assertEquals(cp.getInputResult(),"8","Not Clickable Element 8");
        cp.clickClearButton();

        cp.click_9();
        Assert.assertEquals(cp.getInputResult(),"9","Not Clickable Element 9");
        cp.clickClearButton();


        // Operators
        cp.clickAdditionOperator();
        Assert.assertEquals(cp.getInputResult(),"+","Not Clickable Element +");
        cp.clickClearButton();

        cp.clickSubtractionOperator();
        Assert.assertEquals(cp.getInputResult(),"-","Not Clickable Element -");
        cp.clickClearButton();


        cp.clickDivisionOperator();
        Assert.assertEquals(cp.getInputResult(),"/","Not Clickable Element /");
        cp.clickClearButton();


        cp.clickMultiplyOperator();
        Assert.assertEquals(cp.getInputResult(),"*","Not Clickable Element *");
        cp.clickClearButton();

        cp.click_1();
        cp.clickEqualOperator();
        Assert.assertEquals(cp.getInputResult(),"1","Not Clickable Element =");
        cp.clickClearButton();

        //DecimalPoint
        cp.clickDecimalPoint();
        Assert.assertEquals(cp.getInputResult(),".","Not Clickable Element .");
        cp.clickClearButton();


        //Brackets
        cp.clickOpeningBracket();
        Assert.assertEquals(cp.getInputResult(),"(","Not Clickable Element (");
        cp.clickClearButton();

        cp.clickClosingBracket();
        Assert.assertEquals(cp.getInputResult(),")","Not Clickable Element )");
        cp.clickClearButton();


        //EditBackButton
        cp.click_5();
        cp.clickEditBackspaceButton();
        Assert.assertEquals(cp.getInputResult(),"0","Not Working Edit Back Button");
        cp.clickClearButton();

        //ClearButton
        cp.click_8();
        cp.clickClearButton();
        Assert.assertEquals(cp.getInputResult(),"0","Not Working Clear Button");
        cp.clickClearButton();















    }
}
