import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void filterByGender(List<Person> personList, Person.Gender gender){
        for (int i = 0; i < personList.size(); i++){
            Person person = personList.get(i);
            if(person.getGender().equals(gender)){
                System.out.println(person);
            }
        }
    }

    public static void filterByAge(List<Person> personList, int age){
        for (int i = 0; i < personList.size(); i++){
            Person person = personList.get(i);
            if(person.getAge() >= age){
                System.out.println(person);
            }
        }
    }

    public static void filterByAgeRange(List<Person> personList, int min, int max){
        for (int i = 0; i < personList.size(); i++){
            Person person = personList.get(i);
            if(person.getAge() >= min && person.getAge() <= max){
                System.out.println(person);
            }
        }
    }

    public static void personFilter(List<Person> personList, PersonFilter personFilter){
        for (int i = 0; i < personList.size(); i++){
            Person person = personList.get(i);
            if(personFilter.filtering(person)){
                System.out.println(person);
            }
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Hayrettin DAL", LocalDate.parse("2000-04-02"), "hayretindal@gmail.com", Person.Gender.MALE);
        Person person2 = new Person("Muhammed DAL", LocalDate.parse("2018-12-25"), "muhammedDAL@gmail.com", Person.Gender.MALE);
        Person person3 = new Person("Zeynep GÖRKAN", LocalDate.parse("2001-11-19"), "zeynepgorkan@gmail.com", Person.Gender.FEMALE);
/*
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
*/
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        //filterByGender(personList, Person.Gender.MALE);
        //filterByAge(personList, 10);
        //filterByAgeRange(personList, 10, 23);

        /*personFilter(personList, new PersonFilter() {
            @Override
            public boolean filtering(Person person) {
                return person.getAge() > 15 && person.getGender().equals(Person.Gender.MALE);
            }
        });*/

        personFilter(personList, (k)->k.getAge() >= 10);
    }
}
