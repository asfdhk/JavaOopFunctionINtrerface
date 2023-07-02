import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

        BiFunction<String,String,String[]> fun = (a,b)->{
            HashSet aList = new HashSet<>(createList(a));
            HashSet bList = new HashSet<>(createList(b));
            Set<String> set = new HashSet<>(aList);
            set.retainAll(bList);
            String arr[] = set.toArray(new String[0]);
            if(set.isEmpty()){
                System.out.println("Однакоаих слів не має");
            }
            return arr;
        };

        System.out.println(Arrays.toString(fun.apply("Hello Java","Hello Word")));
    }

    static HashSet<String> createList(String a){
        HashSet<String> list = new HashSet<>();
        int num = 0;
        for (int i = 0;i<a.length();i++){
            if(a.charAt(i) ==' '){
                String m = a.substring(num,i);
                num=i;
                if(m.charAt(0) ==' '){
                    m = m.substring(1);
                }
                list.add(m);
            }
        }
        return list;
    }

}
