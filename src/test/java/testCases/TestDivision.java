package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CalculatorBasicPage;
import testBase.BaseTest;

public class TestDivision extends BaseTest {


    @Test(groups = {"Master","Functional"})
    public void testDivision() {
        CalculatorBasicPage cp =  new CalculatorBasicPage(driver);
        cp.click_4();
        cp.clickDivisionOperator();
        cp.click_2();

        cp.clickEqualOperator();


        String expResult = "2";
        String actResult = cp.getResult();

        Assert.assertEquals(actResult,expResult,"Not Matching Results..");


    }
}
