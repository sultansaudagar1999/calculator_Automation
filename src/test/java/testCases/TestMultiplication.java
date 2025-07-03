package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CalculatorBasicPage;
import testBase.BaseTest;

public class TestMultiplication extends BaseTest {


    @Test(groups = {"Master","Functional"})
    public void testMultiplication() {
        CalculatorBasicPage cp =  new CalculatorBasicPage(driver);
        cp.click_5();
        cp.clickMultiplyOperator();
        cp.click_2();

        cp.clickEqualOperator();


        String expResult = "10";
        String actResult = cp.getResult();

        Assert.assertEquals(actResult,expResult,"Not Matching Results..");


    }
}
