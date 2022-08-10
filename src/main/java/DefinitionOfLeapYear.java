public class DefinitionOfLeapYear {

    private final String Y = "The year ";

    private String getYearIsLeap(Integer year) {
        final String L = " is leap";

        return new StringBuilder()
                .append(Y)
                .append(year)
                .append(L)
                .toString();
    }

    private String getYearIsNotLeap(Integer year) {
        final String NL = " is not a leap";

        return new StringBuilder()
                .append(Y)
                .append(year)
                .append(NL)
                .toString();
    }

    public String isYearLeap(Integer year) {
        String out = "";
        String error = "The year is incorrect!";

        if (year > 0 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                out = getYearIsLeap(year);
            }
            else {
                out = getYearIsNotLeap(year);
            }
        } else {
            out = error;
        }

        return out;
    }
}
