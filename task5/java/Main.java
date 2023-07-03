import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Function<Calendar,Integer> fun = (a) ->{
            return a.getWeekYear();
        };
        System.out.println(fun.apply(calendar));

    }
}
