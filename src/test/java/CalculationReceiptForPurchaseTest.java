import org.junit.jupiter.api.*;

import static Utils.TestUtils.createReceiptText;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CalculationReceiptForPurchaseTest {

    CalculationReceiptForPurchase crp;

    @BeforeEach
    void setUp() {
        crp = new CalculationReceiptForPurchase();
    }

    @Order(1)
    @Test
    public void testCalculationReceiptForPurchasePositiveNumbers() {

        String expectedResult =
                createReceiptText(
                        "Apples",
                        "2$ 11c.",
                        "1kg 977g",
                        "4$ 17c.");

        String actualResult = crp.getReceipt("Apples", 2.11, 1.977);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testCalculationReceiptForPurchasePositiveSmallNumbers() {

        String expectedResult =
                createReceiptText(
                        "Raisin",
                        "0$ 99c.",
                        "0kg 50g",
                        "0$ 4c.");

        String actualResult = crp.getReceipt("Raisin", 0.99, 0.05);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testCalculationReceiptForPurchasePositiveBigWeight() {

        String expectedResult =
                createReceiptText(
                        "Watermelon",
                        "0$ 87c.",
                        "99999kg 990g",
                        "86999$ 99c.");

        String actualResult = crp.getReceipt("Watermelon", 0.87, 99999.99);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testCalculationReceiptForPurchasePositiveBigPrice() {

        String expectedResult =
                createReceiptText(
                        "Saffron",
                        "99999$ 99c.",
                        "0kg 1g",
                        "99$ 99c.");

        String actualResult = crp.getReceipt("Saffron", 99999.99, 0.001);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationReceiptForPurchaseWithZeroPrice() {

        String expectedResult = "The product name is empty or values are incorrect!";

        String actualResult = crp.getReceipt("Chocolate candies", 0, 2.321);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationReceiptForPurchaseWithZeroWight() {

        String expectedResult = "The product name is empty or values are incorrect!";

        String actualResult = crp.getReceipt("Chocolate candies", 5.59, 0);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationReceiptForPurchaseWithEmptyProductName() {

        String expectedResult = "The product name is empty or values are incorrect!";

        String actualResult = crp.getReceipt("", 0.99, 1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationReceiptForPurchaseWithZeroWeightAndPrice() {

        String expectedResult = "The product name is empty or values are incorrect!";

        String actualResult = crp.getReceipt("Bananas", 0, 0);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationReceiptForPurchaseWithAllIsZero() {

        String expectedResult = "The product name is empty or values are incorrect!";

        String actualResult = crp.getReceipt("", 0, 0);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationReceiptForPurchaseNegativeNumbers() {

        String expectedResult = "The product name is empty or values are incorrect!";

        String actualResult = crp.getReceipt("Cherry", -1, -1);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
