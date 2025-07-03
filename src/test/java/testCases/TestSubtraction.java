package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CalculatorBasicPage;
import testBase.BaseTest;

public class TestSubtraction extends BaseTest {

    @Test(groups = {"Master","Functional"})
    public void testSubtraction() {
        CalculatorBasicPage cp =  new CalculatorBasicPage(driver);
        cp.click_5();
        cp.clickSubtractionOperator();
        cp.click_2();

        cp.clickEqualOperator();


        String expResult = "3";
        String actResult = cp.getResult();

        Assert.assertEquals(actResult,expResult,"Not Matching Results..");


    }

}
