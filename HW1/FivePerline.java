public class Main {

    public static void main(String[] args) {

        // print integers from 1000 to 2000, 5 per line
        int START = 1000;
        int END   = 2000;
        int PER_LINE = 5;
        for (int i = START; i <= END; i++) {
            System.out.print(i + " ");
            if ((i + 1) % PER_LINE == 0) System.out.println();
        }
        System.out.println();
    }
}