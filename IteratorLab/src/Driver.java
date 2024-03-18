import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Hayrettin DAL");
        int[] grades = new int[5];
        grades[0] = 80;
        grades[1] = 60;
        grades[2] = 70;
        grades[3] = 90;
        grades[4] = 100;
        student.setGrades(grades);
        Iterator<Integer> iterator = student.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
