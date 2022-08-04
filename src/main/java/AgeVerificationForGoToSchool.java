public class AgeVerificationForGoToSchool {

    final private String YES = "Yes";
    final private String AGE = "Your age is ";
    final private String QUEST = AGE.concat("5? ");
    final private String QUEST_2 = AGE.concat("more than 5? ");
    final private String LIMIT = " only from the age of 5";
    final private String PERMISSION = "You can go to school";
    final private String PREVENTION = PERMISSION.concat(LIMIT);
    final private String ENTER = "\n";

    private String getResult(int a) {

        return ENTER.concat(AGE.concat(String.valueOf(a))).concat(ENTER);
    }

    private String countYears(int a) {
        String wait = "Wait another years: ";

        return wait.concat(String.valueOf(5 - a));
    }

    private String getPerm(int a) {

        return new StringBuilder()
                .append(QUEST)
                .append(YES)
                .append(getResult(a))
                .append(PERMISSION)
                .toString();
    }

    private String getWaitingPeriod(int a) {
        String no = "No";

        return new StringBuilder()
                .append(QUEST)
                .append(no)
                .append(getResult(a))
                .append(PREVENTION)
                .append(ENTER)
                .append(countYears(a))
                .toString();
    }

    private String getSituationNow(int a) {
        String more_than_5 = "You are in school or have graduated now";

        return new StringBuilder()
                .append(QUEST_2)
                .append(YES)
                .append(getResult(a))
                .append(more_than_5)
                .toString();
    }

    public String verifyAgeForGoToSchool(int a) {
        String out = "";
        String err = "The age is incorrect!";

        if (a == 5) {
            System.out.println(getPerm(a));
            out = getPerm(a);
        }
        else if (a < 5 && a > 0) {
            System.out.println(getWaitingPeriod(a));
            out = getWaitingPeriod(a);
        }
        else if (a > 5) {
            if (a >= 100) {
                System.out.println(err);
                out = err;
            } else {
                System.out.println(getSituationNow(a));
                out = getSituationNow(a);
            }
        }
        else {
            System.out.println(err);
            out = err;
        }

        return out;
    }
}
