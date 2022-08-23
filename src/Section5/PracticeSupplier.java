package Section5;

import java.util.function.Supplier;

public class PracticeSupplier {

    /*
    * Supplier 함수 인터페이스
    * description : () -> return 값 , 주어진 인자는 없지만 리턴 값이 있는 함수
    *               get() 메서드로 해당 함수 결과를 얻어 올 수 있다.
    * */
    public static void main(String[] args) {
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}
