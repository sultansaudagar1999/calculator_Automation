package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CalculatorBasicPage;
import testBase.BaseTest;

public class TestMultistepAddMultiply extends BaseTest {

    @Test(groups = {"Master","Functional","Regression"})
    public void testMultistepAddMultiply(){

        CalculatorBasicPage cp =  new CalculatorBasicPage(driver);
        cp.click_2();
        cp.clickAdditionOperator();
        cp.click_5();
        cp.clickEqualOperator();
        Assert.assertEquals(cp.getResult(),"7","Not Matching Results Addition Failed");

        cp.clickClearButton();

        cp.click_2();
        cp.clickMultiplyOperator();
        cp.click_5();
        cp.clickEqualOperator();
        Assert.assertEquals(cp.getResult(),"10","Not Matching Results Multiplication Failed");




    }
}
