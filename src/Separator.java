public class Separator {

    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {

        int[] evenArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[i] = array[i];
            }
        }

        return evenArray;

    }

    public int[] odd() {

        int[] oddArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray[i] = array[i];
            }
        }

        return oddArray;

    }

}
