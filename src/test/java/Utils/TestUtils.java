package Utils;

public final class TestUtils {

    final private static String YE = "Yes";
    final private static String NO = "No";
    final private static String AGE = "Your age is ";
    final private static String Q = AGE.concat("18? ");
    final private static String LIM = " only from the age of 18";
    final private static String PERM_DRIVE = "You can get a driving license and drive a car";
    final private static String PREV_DRIVE = PERM_DRIVE.concat(LIM);
    final private static String SP = "\n";

    public static String createNoForDriving(int age) {

        return new StringBuilder()
                .append(Q)
                .append(NO)
                .append(SP)
                .append(AGE)
                .append(age)
                .append(SP)
                .append(PREV_DRIVE)
                .toString();
    }

    public static String createYesForDriving(int age) {

        return new StringBuilder()
                .append(Q)
                .append(YE)
                .append(SP)
                .append(AGE)
                .append(age)
                .append(SP)
                .append(PERM_DRIVE)
                .toString();
    }



}
