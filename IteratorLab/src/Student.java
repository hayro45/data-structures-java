import java.util.Iterator;

public class Student implements Iterable<Integer>{
    private int index=0;
    private String name;
    private int[] grades;
    public Student(String name, int[] grades){
        this.name = name;
        this.grades = grades;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>(){

            @Override
            public boolean hasNext() {
                return index < grades.length;
            }

            @Override
            public Integer next() {
                return grades[index++];
            }
        };
    }
}
