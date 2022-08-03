import org.junit.jupiter.api.*;

import static Utils.TestUtils.createNoForDriving;
import static Utils.TestUtils.createYesForDriving;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AgeVerificationForDrivingTest {

    AgeVerificationForDriving avd;

    @BeforeEach
    void setUp() {
        avd = new AgeVerificationForDriving();
    }

    @Order(1)
    @Test
    public void testAgeVerificationForDrivingMoreThan18() {

        String expectedResult = createYesForDriving(19);

        String actualResult = avd.verifyAgeForDriving(19);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAgeVerificationForDrivingLessThan18() {

        String expectedResult = createNoForDriving(17);

        String actualResult = avd.verifyAgeForDriving(17);

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Order(3)
    @Test
    public void testAgeVerificationForDriving18() {

        String expectedResult = createYesForDriving(18);

        String actualResult = avd.verifyAgeForDriving(18);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForDrivingZero() {

        String expectedResult = "The age is incorrect!";

        String actualResult = avd.verifyAgeForDriving(0);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForDrivingNegativeNumber() {

        String expectedResult = "The age is incorrect!";

        String actualResult = avd.verifyAgeForDriving(-1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAgeVerificationForDrivingLessThan100() {

        String expectedResult = createYesForDriving(99);

        String actualResult = avd.verifyAgeForDriving(99);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForDriving100() {

        String expectedResult = "The age is incorrect!";

        String actualResult = avd.verifyAgeForDriving(100);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAgeVerificationForDrivingMoreThan100() {

        String expectedResult = "The age is incorrect!";

        String actualResult = avd.verifyAgeForDriving(101);

        Assertions.assertEquals(expectedResult, actualResult);
    }







}
