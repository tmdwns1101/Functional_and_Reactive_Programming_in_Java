package Section4;

public class LambdaPractice {
    public static void main(String[] args) {
        MathOperation op = (a, b) -> a + b;  //single line lambda
        int sum = op.operation(10, 20);
        System.out.println(sum);
        op = (a, b) -> a - b;  //single line lambda
        int minus = op.operation(10, 20);
        System.out.println(minus);

        op = (a, b) -> {
            int c = 10;
            StringBuilder sb = new StringBuilder();
            sb.append("arg1(")
                    .append(a)
                    .append(") + ")
                    .append("arg2(")
                    .append(b)
                    .append(") + 10");

            System.out.println(sb.toString());
            return a + b + c;
        };  //multi line lambda


        int rs = op.operation(20,20);
        System.out.println(rs);

    }
}
