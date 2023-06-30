import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Character> words = new ArrayList<>();
        words.add('a');
        words.add('e');
        words.add('i');
        words.add('o');
        words.add('y');
        words.add('u');
        Function<String,Integer> fun = (a)->{
            int amount = 0;
            for(int i =0;i<a.length();i++){
                for (char n : words){
                    if(a.charAt(i) == n){
                        amount++;
                    }
                }
            }
            return amount;
        };
        System.out.println(fun.apply("adyfy"));
    }
}
