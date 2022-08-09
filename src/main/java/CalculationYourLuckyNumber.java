public class CalculationYourLuckyNumber {

    public String getYourLuckyNumber(int year) {
        String yearOfB = "If your year of birth is ";
        String luckyNumIs = ", your lucky number is ";
        String error = "The year is incorrect!";
        String out = "";
        int luckyNum = 0;

        if ((year >= 1000) && (year <= 2022)) {
            luckyNum =
                    ((year % 10) + ((year / 10) % 10)
                            + ((year / 100) % 10) + (year / 1000));

            if (luckyNum > 9) {
                out =
                        yearOfB.concat(String.valueOf(year)).concat(luckyNumIs)
                                .concat(String.valueOf((luckyNum % 10) + (luckyNum / 10)));
            }
            else {
                out =
                        yearOfB.concat(String.valueOf(year)).concat(luckyNumIs)
                                .concat(String.valueOf(luckyNum));
            }
        }
        else {
            out = error;
        }

        return out;
    }
}
