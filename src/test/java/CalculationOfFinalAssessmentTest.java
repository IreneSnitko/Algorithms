import org.junit.jupiter.api.*;

import static Utils.TestUtils.createTextFinalAssessment;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CalculationOfFinalAssessmentTest {

    CalculationOfFinalAssessment cfa;

    @BeforeEach
    void setUp() {
        cfa = new CalculationOfFinalAssessment();
    }

    @Order(1)
    @Test
    public void testCalculationOfFinalAssessment_0_scores() {

        String expectedResult =
                createTextFinalAssessment(0, "bad", "0.0");

        int scores = 0;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testCalculationOfFinalAssessment_1_scores() {

        String expectedResult =
                createTextFinalAssessment(1, "bad", "0.0");

        int scores = 1;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testCalculationOfFinalAssessment_59_scores() {

        String expectedResult =
                createTextFinalAssessment(59, "bad", "0.0");

        int scores = 59;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testCalculationOfFinalAssessment_60_scores() {

        String expectedResult =
                createTextFinalAssessment(60, "initial", "1.0");

        int scores = 60;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationOfFinalAssessment_61_scores() {

        String expectedResult =
                createTextFinalAssessment(61, "initial", "1.0");

        int scores = 61;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testCalculationOfFinalAssessment_69_scores() {

        String expectedResult =
                createTextFinalAssessment(69, "initial", "1.0");

        int scores = 69;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testCalculationOfFinalAssessment_70_scores() {

        String expectedResult =
                createTextFinalAssessment(70, "not fully completed", "2.0");

        int scores = 70;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationOfFinalAssessment_71_scores() {

        String expectedResult =
                createTextFinalAssessment(71, "not fully completed", "2.0");

        int scores = 71;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testCalculationOfFinalAssessment_79_scores() {

        String expectedResult =
                createTextFinalAssessment(79, "not fully completed", "2.0");

        int scores = 79;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testCalculationOfFinalAssessment_80_scores() {

        String expectedResult =
                createTextFinalAssessment(80, "completed", "3.0");

        int scores = 80;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationOfFinalAssessment_81_scores() {

        String expectedResult =
                createTextFinalAssessment(81, "completed", "3.0");

        int scores = 81;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testCalculationOfFinalAssessment_89_scores() {

        String expectedResult =
                createTextFinalAssessment(89, "completed", "3.0");

        int scores = 89;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(10)
    @Test
    public void testCalculationOfFinalAssessment_90_scores() {

        String expectedResult =
                createTextFinalAssessment(90, "excellent", "4.0");

        int scores = 90;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationOfFinalAssessment_91_scores() {

        String expectedResult =
                createTextFinalAssessment(91, "excellent", "4.0");

        int scores = 91;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(11)
    @Test
    public void testCalculationOfFinalAssessment_100_scores() {

        String expectedResult =
                createTextFinalAssessment(100, "excellent", "4.0");

        int scores = 100;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationOfFinalAssessment_negative_scores() {

        String expectedResult = "The scores is incorrect!";

        int scores = -1;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationOfFinalAssessment_Int_Max() {

        String expectedResult = "The scores is incorrect!";

        int scores = Integer.MAX_VALUE;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalculationOfFinalAssessment_Int_Min() {

        String expectedResult = "The scores is incorrect!";

        int scores = Integer.MIN_VALUE;
        String actualResult = cfa.getFinalAssessment(scores);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
