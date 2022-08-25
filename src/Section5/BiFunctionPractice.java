package Section5;

import java.util.function.BiFunction;

public class BiFunctionPractice {

    /*
    * BiFunction<T,U,R>
    * T 타입 매개변수1, U 타입 매개변수2, R 타입의 리턴 값
    * 2개의 인자와 반환 값이 필요한 경우 사용
    * */
    public static void main(String[] args) {
        BiFunction<String, Integer, String> biFunction = (a,b) -> {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<b; i++) {
                sb.append(a).append(" ");
            }
            return sb.toString();
        };

        System.out.println(biFunction.apply("Hello",4));
    }
}
