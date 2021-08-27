import java.util.*;

class IgnoreCaseComparator implements Comparator<String> {
    public int compare(String str1, String str2)
    {
      return str1.compareToIgnoreCase(str2);
    }
}

public class Question2{

    public static void main(String[] args) {
        
        SortedSet<String> ss = new TreeSet<String>(new IgnoreCaseComparator());
        for (String element : args) {
            ss.add(element);
        }
        System.out.println(" words: " + ss);
    }
}