import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class DeterminationSmallestValueTest {

    DeterminationSmallestValue dsv;

    @BeforeEach
    void setUp() {
        dsv = new DeterminationSmallestValue();
    }

    @Order(1)
    @Test
    public void testDeterminationSmallestValue_AllPositiveNumbers() {

        int expectedResult = 1;

        int actualResult = dsv.determinateSmallestValue(2, 5, 1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeterminationSmallestValue_OneNegativeNumber() {

        int expectedResult = -1;

        int actualResult = dsv.determinateSmallestValue(0, 1, -1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeterminationSmallestValue_TwoNegativeNumbers() {

        int expectedResult = -2;

        int actualResult = dsv.determinateSmallestValue(0, -2, -1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeterminationSmallestValue_AllNegativeNumbers() {

        int expectedResult = -5;

        int actualResult = dsv.determinateSmallestValue(-2, -5, -1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeterminationSmallestValue_WithZero() {

        int expectedResult = 0;

        int actualResult = dsv.determinateSmallestValue(1, 1, 0);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeterminationSmallestValue_AllIsZero() {

        int expectedResult = 0;

        int actualResult = dsv.determinateSmallestValue(0, 0, 0);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeterminationSmallestValue_WithIntMax() {

        int expectedResult = 567894;

        int actualResult = dsv.determinateSmallestValue(Integer.MAX_VALUE, 4562377, 567894);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeterminationSmallestValue_WithIntMin() {

        int expectedResult = -2147483648;

        int actualResult = dsv.determinateSmallestValue(Integer.MIN_VALUE, 4562377, 567894);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeterminationSmallestValue_AllIsEqual() {

        int expectedResult = 555;

        int actualResult = dsv.determinateSmallestValue(555, 555, 555);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
