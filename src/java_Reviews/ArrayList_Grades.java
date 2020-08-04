package java_Reviews;
import java.util.*;
public class ArrayList_Grades {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

    /*
        how many students made:
                A?
                B?
                C?
                D?
        how many failed?
        DO NOT use loop
         */


        ArrayList <Integer>gradeOfA = new ArrayList<>(grades); // 90 ~ 100
        gradeOfA.removeIf(p-> p <90);
        System.out.println(gradeOfA+"\nThe total A students is: "+gradeOfA.size());
        ArrayList<Integer> gradeOfB = new ArrayList<>(grades); // 80 ~ 89
        gradeOfB.removeIf(p-> p <80|| p>=90);
        System.out.println(gradeOfB+"\nThe total B students is: "+gradeOfB.size());
        ArrayList <Integer>gradeOfC = new ArrayList<>(grades); // 70 ~ 79
        gradeOfC.removeIf(p-> p <70||p>=80);
        System.out.println(gradeOfC+"\nThe total C students is: "+gradeOfC.size());
        ArrayList <Integer>gradeOfD = new ArrayList<>(grades); // 60 ~ 69
        gradeOfD.removeIf(p-> p <60||p>=70);
        System.out.println(gradeOfD+"\nThe total D students is: "+gradeOfD.size());
        ArrayList<Integer> gradeOfF = new ArrayList<>(grades); // 0 ~ 59
        gradeOfF.removeIf(p-> p>60);
        System.out.println(gradeOfF+"\nThe total F students is: "+gradeOfF.size());










    }
}
