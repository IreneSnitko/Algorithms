package Utils;

public final class TestUtils {

    final private static String YE = "Yes";
    final private static String NO = "No";
    final private static String SP = "\n";
    final private static String AGE = "Your age is ";
    final private static String LIMIT = " only from the age of ";

    final private static String Q = AGE.concat("18? ");
    final private static String YOU_CAN = "You can ";
    final private static String PERM_DRIVE = YOU_CAN.concat("get a driving license and drive a car");
    final private static String LIM_TO_DRIVE = LIMIT.concat("18");
    final private static String PREV_DRIVE = PERM_DRIVE.concat(LIM_TO_DRIVE);

    final private static String Q2 = AGE.concat("5? ");
    final private static String MORE = "more than ";
    final private static String PERM_TO_SCHOOL = YOU_CAN.concat("go to school");
    final private static String LIM_TO_SCHOOL =LIMIT.concat("5");
    final private static String PREV_TO_SCHOOL = PERM_TO_SCHOOL.concat(LIM_TO_SCHOOL);
    final private static String Q3 = AGE.concat(MORE).concat("5? ");
    final private static String NOW_IN_SCHOOL = "You are in school or have graduated now";

    final private static String SCORES = "Test scores: ";
    final private static String VALUE = "Assign a value: ";
    final private static String FIN = "Final assessment: ";

    final private static String It_S = "It’s a ";
    final private static String DIGIT_NUM = "-digit number: ";

    private static String countHowLongToWait(int age) {

        return "Wait another years: ".concat(String.valueOf(5 - age));
    }

    private static String getApprovalByAge(String y_or_n, int age) {

        return y_or_n.concat(SP).concat(AGE).concat(String.valueOf(age)).concat(SP);
    }

    public static String createTextNoForDriving(int age) {

        return new StringBuilder()
                .append(Q)
                .append(getApprovalByAge(NO, age))
                .append(PREV_DRIVE)
                .toString();
    }

    public static String createTextYesForDriving(int age) {

        return new StringBuilder()
                .append(Q)
                .append(getApprovalByAge(YE, age))
                .append(PERM_DRIVE)
                .toString();
    }

    public static String createTextNoForGoToSchool(int age) {

        return new StringBuilder()
                .append(Q2)
                .append(getApprovalByAge(NO, age))
                .append(PREV_TO_SCHOOL)
                .append(SP)
                .append(countHowLongToWait(age))
                .toString();
    }

    public static String createTextYesForGoToSchool(int age) {

        return new StringBuilder()
                .append(Q2)
                .append(getApprovalByAge(YE, age))
                .append(PERM_TO_SCHOOL)
                .toString();
    }

    public static String createTextForGoToSchoolMoreThan5(int age) {

        return new StringBuilder()
                .append(Q3)
                .append(getApprovalByAge(YE, age))
                .append(NOW_IN_SCHOOL)
                .toString();
    }

    public static String createTextFinalAssessment(int scores, String value, String f_a_) {

        return new StringBuilder()
                .append(SCORES).append(scores)
                .append(SP)
                .append(VALUE).append(value)
                .append(SP)
                .append(FIN).append(f_a_)
                .toString();
    }

    public static String createTextShortValue(String shortNumber){

        return "The value of the variable short = "
                .concat(String.valueOf(shortNumber))
                .concat(SP);
    }

    public static String createTextDigitValue(String numD, int num) {

        return It_S.concat(numD)
                .concat(DIGIT_NUM)
                .concat(String.valueOf(num));
    }

    public static String createReceiptText(String productName, String price, String weight, String total) {

        return new StringBuilder()
                .append("Product name: ").append(productName).append(SP)
                .append("Price per 1 kg of goods: ").append(price).append(SP)
                .append("Quantity: ").append(weight).append(SP)
                .append("Total: ").append(total)
                .toString();
    }
}
