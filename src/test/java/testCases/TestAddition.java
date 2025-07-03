package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.CalculatorBasicPage;
import testBase.BaseTest;

public class TestAddition extends BaseTest {


    @Test(groups = {"Master","Functional"})
    public void testAddition() {
        CalculatorBasicPage cp =  new CalculatorBasicPage(driver);
        cp.click_2();
        cp.clickAdditionOperator();
        cp.click_5();

        cp.clickEqualOperator();


        String expResult = "7";
        String actResult = cp.getResult();

        Assert.assertEquals(actResult,expResult,"Not Matching Results..");


    }
}
