package Section5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionPractice {

    /*
    * Function<T,R> - R apply(T t)
    * T 타입의 매개변수와 R 타입의 값을 반환한다.
    * */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kit","Kat","Shake");
        Function<String, Integer> function = e -> e.length();

        List<Integer> newList = map(list, function);
        System.out.println(newList);
    }

    private static <T,R> List<R> map(List<T> list, Function<T,R> function) {
        List<R> newList = new ArrayList<>();
        //newList = list.stream().map(function).collect(Collectors.toList());

        for(T elem : list) {
            newList.add(function.apply(elem));
        }
        return newList;
    }
}
