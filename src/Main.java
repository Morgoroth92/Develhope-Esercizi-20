

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> daysHashSet = new HashSet<>();
        daysHashSet.add("Monday");
        daysHashSet.add("Tuesday");
        daysHashSet.add("Wednesday");
        daysHashSet.add("Thursday");
        daysHashSet.add("Friday");
        daysHashSet.add("Saturday");
        daysHashSet.add("Sunday");
        System.out.println(daysHashSet);


        Set<String> daysLinkedHashSet = new LinkedHashSet<>();
        daysLinkedHashSet.add("Monday");
        daysLinkedHashSet.add("Tuesday");
        daysLinkedHashSet.add("Wednesday");
        daysLinkedHashSet.add("Thursday");
        daysLinkedHashSet.add("Friday");
        daysLinkedHashSet.add("Saturday");
        daysLinkedHashSet.add("Sunday");
        System.out.println(daysLinkedHashSet);

        System.out.println("The new Set is: " + daysLinkedHashSet);


        boolean setsAreEqual = daysHashSet.equals(daysLinkedHashSet);
        System.out.println("Is the first Set equal to the second Set? " + setsAreEqual);
    }
}
