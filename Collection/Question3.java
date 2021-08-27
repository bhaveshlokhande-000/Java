import java.util.*;
import java.util.stream.Collectors;

public class Question3{
    
    public static List<String> trim(List<String> list)
    {
    List<String> result= list.stream().map(s->s.trim()).collect(Collectors.toList());;
    return result; 
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{" abc ","  def","xyz  "});
        for (String element : trim(list)) {
            System.out.println("("+element+")");
        }
    }
}