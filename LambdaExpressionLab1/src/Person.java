import java.io.Serializable;
import java.time.LocalDate;
import java.util.Locale;

public class Person implements Serializable {
    public enum Gender {
        MALE, FEMALE
    }

    private String name;
    private LocalDate birthDate;
    private String email;
    private Gender gender;

    public Person() {
    }

    public Person(String name, LocalDate birthDate, String email, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.gender = gender;
    }
    public int getAge(){
        return  LocalDate.now().getYear() - birthDate.getYear();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode(){
        return email.hashCode();
    }

    @Override
    public boolean equals(Object o){
        Person person = (Person)o;
        return this.email.equals(person.email);
    }

    public  String toString(){
        return "Name: " + name + ", Birth Date: "
                + birthDate + ", Email: " + email + ", Gender: " + gender + ", Age: " + getAge();
    }



}
