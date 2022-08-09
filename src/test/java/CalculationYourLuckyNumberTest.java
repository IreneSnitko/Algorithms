import org.junit.jupiter.api.*;

import static Utils.TestUtils.createTextWithLuckyNumber;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CalculationYourLuckyNumberTest {

    CalculationYourLuckyNumber yln;

    @BeforeEach
    void setUp() {
        yln = new CalculationYourLuckyNumber();
    }

    @Order(1)
    @Test
    public void testCalculationYourLuckyNumber_positiveNumbers() {

        String expectedResult =
                createTextWithLuckyNumber(1979, 8);

        String actualResult = yln.getYourLuckyNumber(1979);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testCalculationYourLuckyNumber_boundaryValues_1000() {

        String expectedResult =
                createTextWithLuckyNumber(1000, 1);

        String actualResult = yln.getYourLuckyNumber(1000);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testCalculationYourLuckyNumber_boundaryValues_1001() {

        String expectedResult =
                createTextWithLuckyNumber(1001, 2);

        String actualResult = yln.getYourLuckyNumber(1001);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationYourLuckyNumber_boundaryValues_999() {

        String expectedResult = "The year is incorrect!";

        String actualResult = yln.getYourLuckyNumber(999);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testCalculationYourLuckyNumber_boundaryValues_2022() {

        String expectedResult =
                createTextWithLuckyNumber(2022, 6);

        String actualResult = yln.getYourLuckyNumber(2022);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testCalculationYourLuckyNumber_boundaryValues_2021() {

        String expectedResult =
                createTextWithLuckyNumber(2021, 5);

        String actualResult = yln.getYourLuckyNumber(2021);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationYourLuckyNumber_boundaryValues_2023() {

        String expectedResult = "The year is incorrect!";

        String actualResult = yln.getYourLuckyNumber(2023);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationYourLuckyNumber_zeroValues() {

        String expectedResult = "The year is incorrect!";

        String actualResult = yln.getYourLuckyNumber(0);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationYourLuckyNumber_negativeValues() {

        String expectedResult = "The year is incorrect!";

        String actualResult = yln.getYourLuckyNumber(-1);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

