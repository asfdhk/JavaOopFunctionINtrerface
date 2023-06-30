import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[]arr ={2,3,5,6,8,4,10,7};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);
        Predicate<Integer> pr = a-> {
            if(a<= 1){
                return true;
            }
            for (int i = 2;i<=Math.sqrt(a);i++){
                if (a % i ==0){
                    return true;
                }
            }
            return false;
        };
        Function<Integer[],Integer> fun =(c)->{
            int b = 0;
            for (int i :c){
                if (i<=1){
                    b++;
                    continue;
                }
                for (int a =2;a<=Math.sqrt(i);a++){
                    if (i%a ==0){
                        b++;
                    }
                }
            }
            return c.length - b;
        };
        System.out.println(fun.apply(arr));
        list.removeIf(pr);
        System.out.println(list);
    }

}
