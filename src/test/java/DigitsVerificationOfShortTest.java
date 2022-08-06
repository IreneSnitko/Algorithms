import org.junit.jupiter.api.*;

import static Utils.TestUtils.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class DigitsVerificationOfShortTest {

    DigitsVerificationOfShort dvs;

    @BeforeEach
    void setUp() {
        dvs = new DigitsVerificationOfShort();
    }

    @Order(1)
    @Test
    public void testDigitsVerificationOfShort_5digitNumber() {

        String expectedResult =
                createTextShortValue("10000")
                        .concat(createTextDigitValue("one", 1)).concat("\n")
                        .concat(createTextDigitValue("two", 0)).concat("\n")
                        .concat(createTextDigitValue("three", 0)).concat("\n")
                        .concat(createTextDigitValue("four", 0)).concat("\n")
                        .concat(createTextDigitValue("five", 0));

        short s = 10000;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testDigitsVerificationOfShort_4digitNumber() {

        String expectedResult =
                createTextShortValue("9999")
                        .concat(createTextDigitValue("one", 9)).concat("\n")
                        .concat(createTextDigitValue("two", 9)).concat("\n")
                        .concat(createTextDigitValue("three", 9)).concat("\n")
                        .concat(createTextDigitValue("four", 9));

        short s = 9999;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testDigitsVerificationOfShort_4digitNumber_2() {

        String expectedResult =
                createTextShortValue("1000")
                        .concat(createTextDigitValue("one", 1)).concat("\n")
                        .concat(createTextDigitValue("two", 0)).concat("\n")
                        .concat(createTextDigitValue("three", 0)).concat("\n")
                        .concat(createTextDigitValue("four", 0));

        short s = 1000;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testDigitsVerificationOfShort_5digitNumber_2() {

        String expectedResult =
                createTextShortValue("32766")
                        .concat(createTextDigitValue("one", 3)).concat("\n")
                        .concat(createTextDigitValue("two", 2)).concat("\n")
                        .concat(createTextDigitValue("three", 7)).concat("\n")
                        .concat(createTextDigitValue("four", 6)).concat("\n")
                        .concat(createTextDigitValue("five", 6));

        short s = 32766;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testDigitsVerificationOfShort_ShortMax() {

        String expectedResult =
                createTextShortValue("32767")
                        .concat(createTextDigitValue("one", 3)).concat("\n")
                        .concat(createTextDigitValue("two", 2)).concat("\n")
                        .concat(createTextDigitValue("three", 7)).concat("\n")
                        .concat(createTextDigitValue("four", 6)).concat("\n")
                        .concat(createTextDigitValue("five", 7));

        short s = Short.MAX_VALUE;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDigitsVerificationOfShort_ShortMin() {

        String expectedResult =
                "The value of the variable short = -32768\nThis is not a natural number";

        short s = Short.MIN_VALUE;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testDigitsVerificationOfShort_3digitNumber() {

        String expectedResult =
                createTextShortValue("999")
                        .concat(createTextDigitValue("one", 9)).concat("\n")
                        .concat(createTextDigitValue("two", 9)).concat("\n")
                        .concat(createTextDigitValue("three", 9));

        short s = 999;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testDigitsVerificationOfShort_3digitNumber_2() {

        String expectedResult =
                createTextShortValue("100")
                        .concat(createTextDigitValue("one", 1)).concat("\n")
                        .concat(createTextDigitValue("two", 0)).concat("\n")
                        .concat(createTextDigitValue("three", 0));

        short s = 100;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testDigitsVerificationOfShort_2digitNumber() {

        String expectedResult =
                createTextShortValue("99")
                        .concat(createTextDigitValue("one", 9)).concat("\n")
                        .concat(createTextDigitValue("two", 9));

        short s = 99;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testDigitsVerificationOfShort_2digitNumber_2() {

        String expectedResult =
                createTextShortValue("10")
                        .concat(createTextDigitValue("one", 1)).concat("\n")
                        .concat(createTextDigitValue("two", 0));

        short s = 10;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(10)
    @Test
    public void testDigitsVerificationOfShort_1digitNumber() {

        String expectedResult =
                createTextShortValue("9")
                        .concat(createTextDigitValue("one", 9));

        short s = 9;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(11)
    @Test
    public void testDigitsVerificationOfShort_1digitNumber_2() {

        String expectedResult =
                createTextShortValue("1")
                        .concat(createTextDigitValue("one", 1));

        short s = 1;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDigitsVerificationOfShort_Zero() {

        String expectedResult =
                "The value of the variable short = 0\nThis is not a natural number";

        short s = 0;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDigitsVerificationOfShort_NegativeNumber() {

        String expectedResult =
                "The value of the variable short = -1\nThis is not a natural number";

        short s = -1;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDigitsVerificationOfShort_NegativeNumber_2() {

        String expectedResult =
                "The value of the variable short = -32767\nThis is not a natural number";

        short s = -32767;
        String actualResult = dvs.verifyDigitsOfShort(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
