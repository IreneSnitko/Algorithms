package Utils;

public final class TestUtils {

    final private static String YE = "Yes";
    final private static String NO = "No";
    final private static String AGE = "Your age is ";
    final private static String MORE = "more than ";
    final private static String Q = AGE.concat("18? ");
    final private static String Q2 = AGE.concat("5? ");
    final private static String Q3 = AGE.concat(MORE).concat("5? ");
    final private static String LIMIT = " only from the age of ";
    final private static String LIM_TO_DRIVE = LIMIT.concat("18");
    final private static String LIM_TO_SCHOOL =LIMIT.concat("5");
    final private static String YOU_CAN = "You can ";
    final private static String PERM_DRIVE = YOU_CAN.concat("get a driving license and drive a car");
    final private static String PERM_TO_SCHOOL = YOU_CAN.concat("go to school");
    final private static String NOW_IN_SCHOOL = "You are in school or have graduated now";
    final private static String PREV_DRIVE = PERM_DRIVE.concat(LIM_TO_DRIVE);
    final private static String PREV_TO_SCHOOL = PERM_TO_SCHOOL.concat(LIM_TO_SCHOOL);
    final private static String SP = "\n";

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
}
