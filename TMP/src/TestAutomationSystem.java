public class TestAutomationSystem{
    public static void main(String[] args) {
        TestScenario[] scenarios = {
             new LoginTest(), new PaymentTest(), new ProductSearchTest()};
        for (TestScenario scenario : scenarios){
            scenario.runTest();
        }
    }
}
