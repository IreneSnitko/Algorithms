import org.junit.jupiter.api.*;

import static Utils.TestUtils.createTextLeapYear;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class DefinitionOfLeapYearTest {

    DefinitionOfLeapYear dly;

    @BeforeEach
    void setUp() {
        dly = new DefinitionOfLeapYear();
    }

    @Test
    public void testDefinitionOfLeapYear_positiveNumbers_9999() {

        String expectedResult =
                createTextLeapYear(9999, "not a leap");

        String actualResult = dly.isYearLeap(9999);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDefinitionOfLeapYear_positiveNumbers_9998() {

        String expectedResult =
                createTextLeapYear(9998, "not a leap");

        String actualResult = dly.isYearLeap(9998);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDefinitionOfLeapYear_positiveNumbers_10000() {

        String expectedResult = "The year is incorrect!";

        String actualResult = dly.isYearLeap(10000);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(1)
    @Test
    public void testDefinitionOfLeapYear_positiveNumbers_1979() {

        String expectedResult =
                createTextLeapYear(1979, "not a leap");

        String actualResult = dly.isYearLeap(1979);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testDefinitionOfLeapYear_positiveNumbers_1996() {

        String expectedResult =
                createTextLeapYear(1996, "leap");

        String actualResult = dly.isYearLeap(1996);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testDefinitionOfLeapYear_positiveNumbers_122() {

        String expectedResult =
                createTextLeapYear(122, "not a leap");

        String actualResult = dly.isYearLeap(122);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testDefinitionOfLeapYear_positiveNumbers_1024() {

        String expectedResult =
                createTextLeapYear(1024, "leap");

        String actualResult = dly.isYearLeap(1024);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDefinitionOfLeapYear_Zero() {

        String expectedResult = "The year is incorrect!";

        String actualResult = dly.isYearLeap(0);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDefinitionOfLeapYear_One() {

        String expectedResult =
                createTextLeapYear(1, "not a leap");

        String actualResult = dly.isYearLeap(1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDefinitionOfLeapYear_minusOne() {

        String expectedResult = "The year is incorrect!";

        String actualResult = dly.isYearLeap(-1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDefinitionOfLeapYear_IntMax() {

        String expectedResult = "The year is incorrect!";

        String actualResult = dly.isYearLeap(Integer.MAX_VALUE);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDefinitionOfLeapYear_IntMin() {

        String expectedResult = "The year is incorrect!";

        String actualResult = dly.isYearLeap(Integer.MIN_VALUE);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
