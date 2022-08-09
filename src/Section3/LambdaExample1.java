package Section3;

public class LambdaExample1 {
    public static void main(String[] args) {


        /*
         * 익명 클래스를 이용
         * */
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello Thread Run!");
//            }
//        });
//        t1.start();

        /*
         * Lambda 사용
         * */
        Thread t = new Thread(() -> System.out.println("Hello Thread Run!"));
        t.start();
    }
}
