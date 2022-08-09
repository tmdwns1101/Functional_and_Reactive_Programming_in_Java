package Section3;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {

        /* 1..100 에서 짝수 합 구하기 */

        //Imperative
        int sumOfEvens1 = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvens1 += i;
            }
        }
        System.out.println("Imperative : " + sumOfEvens1);

        //Declarative or Functional

        int sumOfEvens2 = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0)
                .sum();
        System.out.println("Functional : " + sumOfEvens2);
    }
}
