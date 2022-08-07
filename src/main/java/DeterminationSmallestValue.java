public class DeterminationSmallestValue {

    public int determinateSmallestValue(int a, int b, int c) {
        int min = 0;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {

            return min;
        } else {

            return min = c;
        }
    }
}
