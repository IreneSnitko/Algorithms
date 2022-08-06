public class DigitsVerificationOfShort {

    private final String LN = "\n";

    private String getHeader(String numOfDigit) {

        return "It’s a ".concat(numOfDigit).concat("-digit number: ");
    }

    private char getNeedIndex(String shortNum, int index) {
        return shortNum.charAt(index);
    }

    private String getDigit(String numOfDigit, String shortNum, int index) {

        return getHeader(numOfDigit)
                .concat(String.valueOf(getNeedIndex(shortNum, index)));
    }

    private String getValuesOfFiveDigits(String shortNum) {

        return new StringBuilder()
                .append(getDigit("one", shortNum, 0)).append(LN)
                .append(getDigit("two", shortNum, 1)).append(LN)
                .append(getDigit("three", shortNum, 2)).append(LN)
                .append(getDigit("four", shortNum, 3)).append(LN)
                .append(getDigit("five", shortNum, 4))
                .toString();
    }

    private String getValuesOfFourDigits(String shortNum) {

        return new StringBuilder()
                .append(getDigit("one", shortNum, 0)).append(LN)
                .append(getDigit("two", shortNum, 1)).append(LN)
                .append(getDigit("three", shortNum, 2)).append(LN)
                .append(getDigit("four", shortNum, 3))
                .toString();
    }

    private String getValuesOfThreeDigits(String shortNum) {

        return new StringBuilder()
                .append(getDigit("one", shortNum, 0)).append(LN)
                .append(getDigit("two", shortNum,1)).append(LN)
                .append(getDigit("three", shortNum, 2))
                .toString();
    }

    private String getValuesOfTwoDigits(String shortNum) {

        return new StringBuilder()
                .append(getDigit("one", shortNum, 0)).append(LN)
                .append(getDigit("two", shortNum, 1))
                .toString();
    }

    private String getValuesOfOneDigits(String shortNum) {

        return new StringBuilder()
                .append(getDigit("one", shortNum, 0))
                .toString();
    }

    private String getShortNum(String shortNum) {

        return "The value of the variable short = ".concat(shortNum)
                .concat(LN);
    }

    private void printNumAndDigits(String shortNum, String out) {
        System.out.println(getShortNum(shortNum).concat(out));
    }

    public String verifyDigitsOfShort(short s) {
        String out = "";
        String shortNum = Short.toString(s);

        if (s > 0) {
            if (s >= 10000) {
                out = getValuesOfFiveDigits(shortNum);
                printNumAndDigits(shortNum, out);
            }
            else if (s >= 1000) {
                out = getValuesOfFourDigits(shortNum);
                printNumAndDigits(shortNum, out);
            }
            else if (s >= 100) {
                out = getValuesOfThreeDigits(shortNum);
                printNumAndDigits(shortNum, out);
            }
            else if (s >= 10) {
                out = getValuesOfTwoDigits(shortNum);
                printNumAndDigits(shortNum, out);
            }
            else {
                out = getValuesOfOneDigits(shortNum);
                printNumAndDigits(shortNum, out);
            }
        }
        else {
            out = "This is not a natural number";
            printNumAndDigits(shortNum, out);
        }

        return getShortNum(shortNum).concat(out);
    }
}
