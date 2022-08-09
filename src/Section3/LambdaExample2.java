package Section3;

public class LambdaExample2 {
    public static void main(String[] args) {
        MyFunInterface fun1 = (a, b) -> a + b + 3; // 람다식 선언
        onTheFly(fun1, 2, 3);

        onTheFly((a,b) -> a - b + 3, 3,3);
    }

    public static void onTheFly(MyFunInterface fun, int arg1, int arg2) {
        System.out.println(fun.myMethod(arg1, arg2));
    }
}
