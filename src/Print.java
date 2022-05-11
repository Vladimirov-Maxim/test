public class Print {

    public void print(int number) {
        System.out.println(number);
    }
    public void print(String str) {
        System.out.println(str);
    }
    public void print(int[] array) {
        for (int i : array) {
            print(i);
        }
    }

    public void print(String[] array) {
        for (String s : array) {
            print(s);
        }
    }

}
