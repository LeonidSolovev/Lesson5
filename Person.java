package Урок3.Lesson5;

public class Person {
    public String name;
    public int age;

    public Person(String name, String position, String email, String phone, int wage, int age) {
    }
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivan Ivanov", "Engineer", "ivan.ivanov@mail.ru", "892312312", 4000, 29);
        persArray[1] = new Person("Sergey Ivanov", "Physician", "sergey.ivanov@mail.ru", "892311234", 5000, 45);
        persArray[2] = new Person("Nick Ivanov", "Baker", "nick.ivanov@mail.ru", "892314321", 3000, 19);
        persArray[3] = new Person("John Ivanov", "Bricklayer", "john.ivanov@mail.ru", "892314567", 2000, 31);
        persArray[4] = new Person("Patrick Ivanov", "Carpenter", "patrick.ivanov@mail.ru", "892317685", 1000, 43);
    }}


