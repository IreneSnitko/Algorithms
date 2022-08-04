public class CalculationOfFinalAssessment {

    final private String ASSIGN = "Assign a ";
    final private String VAL = ASSIGN.concat("value: ");
    final private String EXC = VAL.concat("excellent");
    final private String COM = VAL.concat("completed");
    final private String NOT_F = VAL.concat("not fully completed");
    final private String INIT = VAL.concat("initial");
    final private String BAD = VAL.concat("bad");
    final private String ERR = "The scores is incorrect!";

    private int getScores(int scores) {

        return scores;
    }

    private String getData(int scores, String value, String fin) {
        String FA = "Final assessment: ";
        String TS = "Test scores: ";
        String ln = "\n";

        return new StringBuilder()
                .append(TS)
                .append(getScores(scores))
                .append(ln)
                .append(value)
                .append(ln)
                .append(FA)
                .append(fin)
                .toString();
    }

    public String getFinalAssessment(int scores) {
        String out = "";

        if (scores >= 0 && scores <= 100) {

            if (scores >= 90) {
                out = getData(getScores(scores), EXC, "4.0");
                System.out.println(out);
            }
            else if (scores >= 80) {
                out = getData(getScores(scores), COM, "3.0");
                System.out.println(out);
            }
            else if (scores >= 70) {
                out = getData(getScores(scores), NOT_F, "2.0");
                System.out.println(out);
            }
            else if (scores >= 60) {
                out = getData(getScores(scores), INIT, "1.0");
                System.out.println(out);
            }
            else {
                out = getData(getScores(scores), BAD, "0.0");
                System.out.println(out);
            }
        } else {
            out = ERR;
            System.out.println(ERR);
        }

        return out;
    }
}
