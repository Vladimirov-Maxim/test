import com.sun.jdi.event.StepEvent;

public class Squirrel {

    public int nuts[];

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int getNuts(int index) {

        return nuts[index];

    }

    public int maxNuts() {

        if (nuts.length == 1) {
            return Math.max(nuts[0], 0);
        }

        int i;
        int countMaxNuts = 0;

        if (getNuts(0) < 0 && getNuts(0) < getNuts(1)) {
            i = 1;
        } else {
            i = 0;
        }

        countMaxNuts += nuts[i];

       while (i < nuts.length){

            int twoStep = i + 2;
            int oneStep = i + 1;

            boolean isTwoStep = twoStep < nuts.length;
            boolean isOneStep = oneStep < nuts.length;

            if (isTwoStep && getNuts(oneStep) < 0 && getNuts(twoStep) > getNuts(oneStep)) {
                countMaxNuts += getNuts(twoStep);
                i = twoStep;
            } else if (isOneStep && (isTwoStep || getNuts(oneStep) > 0)) {
                countMaxNuts += getNuts(oneStep);
                i = oneStep;
            } else {
                break;
            }

        }

        return Math.max(countMaxNuts, 0);

    }
}
