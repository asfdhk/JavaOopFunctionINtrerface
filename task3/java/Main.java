import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String,Integer> fun =(a)->{
            int sum = 0;
            for (int i = 0;i<a.length();i++){
                sum+=a.charAt(i);
            }
            return sum;
        };
        System.out.println(fun.apply("hello"));
    }
}
