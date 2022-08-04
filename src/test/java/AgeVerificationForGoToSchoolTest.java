import org.junit.jupiter.api.*;

import static Utils.TestUtils.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AgeVerificationForGoToSchoolTest {

    AgeVerificationForGoToSchool avs;

    @BeforeEach
    void setUp() {
        avs = new AgeVerificationForGoToSchool();
    }

    @Order(2)
    @Test
    public void testAgeVerificationForGoToSchoolLessThan5() {

        String expectedResult = createTextNoForGoToSchool(1);

        String actualResult = avs.verifyAgeForGoToSchool(1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAgeVerificationForGoToSchoolLessThan5_2() {

        String expectedResult = createTextNoForGoToSchool(4);

        String actualResult = avs.verifyAgeForGoToSchool(4);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForGoToSchoolZero() {

        String expectedResult = "The age is incorrect!";

        String actualResult = avs.verifyAgeForGoToSchool(0);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForGoToSchoolNegativeNumber() {

        String expectedResult = "The age is incorrect!";

        String actualResult = avs.verifyAgeForGoToSchool(-1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForGoToSchoolLessThan100() {

        String expectedResult = createTextForGoToSchoolMoreThan5(99);

        String actualResult = avs.verifyAgeForGoToSchool(99);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForGoToSchoolAt100() {

        String expectedResult = "The age is incorrect!";

        String actualResult = avs.verifyAgeForGoToSchool(100);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForGoToSchoolMoreThan100() {

        String expectedResult = "The age is incorrect!";

        String actualResult = avs.verifyAgeForGoToSchool(101);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(1)
    @Test
    public void testAgeVerificationForGoToSchoolAt5() {

        String expectedResult = createTextYesForGoToSchool(5);

        String actualResult = avs.verifyAgeForGoToSchool(5);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAgeVerificationForGoToSchoolMoreThan5() {

        String expectedResult = createTextForGoToSchoolMoreThan5(6);

        String actualResult = avs.verifyAgeForGoToSchool(6);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testAgeVerificationForGoToSchoolMoreThan5_2() {

        String expectedResult = createTextForGoToSchoolMoreThan5(20);

        String actualResult = avs.verifyAgeForGoToSchool(20);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForGoToSchoolIntMax() {

        String expectedResult = "The age is incorrect!";

        String actualResult = avs.verifyAgeForGoToSchool(Integer.MAX_VALUE);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForGoToSchoolIntMin() {

        String expectedResult = "The age is incorrect!";

        String actualResult = avs.verifyAgeForGoToSchool(Integer.MIN_VALUE);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
