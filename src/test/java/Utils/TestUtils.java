package Utils;

public final class TestUtils {

    private static final String YE = "Yes";
    private static final String NO = "No";
    private static final String SP = "\n";
    private static final String AGE = "Your age is ";
    private static final String LIMIT = " only from the age of ";

    private static final String Q = AGE.concat("18? ");
    private static final String YOU_CAN = "You can ";
    private static final String PERM_DRIVE = YOU_CAN.concat("get a driving license and drive a car");
    private static final String LIM_TO_DRIVE = LIMIT.concat("18");
    private static final String PREV_DRIVE = PERM_DRIVE.concat(LIM_TO_DRIVE);

    private static final String Q2 = AGE.concat("5? ");
    private static final String MORE = "more than ";
    private static final String PERM_TO_SCHOOL = YOU_CAN.concat("go to school");
    private static final String LIM_TO_SCHOOL =LIMIT.concat("5");
    private static final String PREV_TO_SCHOOL = PERM_TO_SCHOOL.concat(LIM_TO_SCHOOL);
    private static final String Q3 = AGE.concat(MORE).concat("5? ");
    private static final String NOW_IN_SCHOOL = "You are in school or have graduated now";

    private static final String SCORES = "Test scores: ";
    private static final String VALUE = "Assign a value: ";
    private static final String FIN = "Final assessment: ";

    private static final String It_S = "It’s a ";
    private static final String DIGIT_NUM = "-digit number: ";

    private static final String YEAR = "If your year of birth is ";
    private static final String LUCKY_NUM = ", your lucky number is ";

    private static final String THE_YEAR = "The year ";
    private static final String IS = " is ";

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

    public static String createTextWithLuckyNumber(int year, int luckyNum) {

        return new StringBuilder()
                .append(YEAR)
                .append(year)
                .append(LUCKY_NUM)
                .append(luckyNum)
                .toString();
    }

    public static String createTextLeapYear(int year, String yes_or_not) {

        return new StringBuilder()
                .append(THE_YEAR)
                .append(year)
                .append(IS)
                .append(yes_or_not)
                .toString();
    }
}
