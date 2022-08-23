package Section5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");

        Predicate<String> predicate = s -> !s.isEmpty(); //Predicate Function Interface

        List<String> newList =  filterList(list, predicate);

        System.out.println(newList);

        list.add("BasicsGood!");

        Predicate<String> filter = s -> s.contains("Basics");
        newList = filterList(list, filter);
        System.out.println(newList);

        Predicate<Integer> oddFilter = i -> i % 2 != 0;

        List<Integer> numberList = Arrays.asList(1,2,3,4,5);

        List<Integer> newNumList = filterList(numberList,oddFilter);
        System.out.println(newNumList);


    }

    /*
    * 메서드 제너릭 활용
    * <T>
    * args:  List<T> , Predicate<T>
    * description :  어떤한 제너릭 타입의 List, 와 Predicate 타입으로 매개변수로 주어진 list 를  필터링 할 수 있는 메서드 구현
    * */
    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList= new ArrayList<>();
        for(T item: list) {
            if(predicate.test(item)){
               newList.add(item);
            }
        }
        return newList;
    }
}
