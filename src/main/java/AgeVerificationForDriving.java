
public class AgeVerificationForDriving {

    final private String AGE = "Your age is ";
    final private String QUEST = AGE.concat("18? ");
    final private String LIMIT = " only from the age of 18";
    final private String PERMISSION = "You can get a driving license and drive a car";
    final private String PREVENTION = PERMISSION.concat(LIMIT);

    private String getResult(int a) {
        String ln = "\n";

        return ln.concat(AGE.concat(String.valueOf(a))).concat(ln);
    }

    private String getPermission(int a) {
        String yes = "Yes";

        return new StringBuilder()
                .append(QUEST)
                .append(yes)
                .append(getResult(a))
                .append(PERMISSION)
                .toString();
    }

    private String getPrevention(int a) {
        String no = "No";

        return new StringBuilder()
                .append(QUEST)
                .append(no)
                .append(getResult(a))
                .append(PREVENTION)
                .toString();
    }

    public String verifyAgeForDriving(int a) {
        String out = "";
        String err = "The age is incorrect!";

        if (a >= 18) {
            if (a >= 100) {
                System.out.println(err);
                out = err;
            }
            else {
                System.out.println(getPermission(a));
                out = getPermission(a);
            }
        }
        else if (a > 0 && a < 18) {
            System.out.println(getPrevention(a));
            out = getPrevention(a);
        }
        else {
            System.out.println(err);
            out = err;
        }

        return out;
    }
}
