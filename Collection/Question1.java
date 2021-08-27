import java.util.*;

public class Question1{

    public static void main(String[] args) {

        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList);

        argList.stream().forEach(element->System.out.println(element));
	System.out.println("-------------------------------------------");
        for (String element: argList) {
            System.out.println(element);
        }

    }
}