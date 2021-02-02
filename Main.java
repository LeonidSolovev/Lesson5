package Урок3.Lesson5;

public class Main {
    public class Employees{
        String name;
        String position;
        String email;
        String phone;
        int wage;
        int age;

        public Employees(String name, String position, String email, String phone, int wage, int age){
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.wage = wage;
            this.age = age;
        }
    public void fill(String[] args){
        Employees employee1;
        employee1 = new Employees(name, position, email, phone, wage, age);
        employee1.name  = "Thomas";
        employee1.position = "Teacher";
        employee1.email = "1234@amam.com";
        employee1.phone = "123456789";
        employee1.wage = 32000;
        employee1.age = 24;


        }
        public void info(){
            System.out.println(name +", "+  position +", "+ email +", "+ phone +", "+ wage +", "+ age);
        }
    }
    public class Person {
        public Person(String name, String position, String email, String phone, int wage, int age) {
        }
        public void main(String[] args) {
            Урок3.Lesson5.Person[] persArray = new Урок3.Lesson5.Person[5];
            persArray[0] = new Урок3.Lesson5.Person("Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
            persArray[1] = new Урок3.Lesson5.Person("Sergey Petrov", "Engineer", "peserg@mailbox.com", "8948765938", 25000, 36);
            persArray[2] = new Урок3.Lesson5.Person("Petr Vasin", "Engineer", "vaspetr@mailbox.com", "898746039", 39000, 54);
            persArray[3] = new Урок3.Lesson5.Person("Vasiliy Petrov", "Engineer", "petrvas@mailbox.com", "898597495", 54000, 44);
            persArray[4] = new Урок3.Lesson5.Person("Denis Ivanov", "Engineer", "ivden@mailbox.com", "8984570945", 43000, 49);

    for (int i = 0; i < 5; i++) {
        if (persArray[i].age >= 40){
            System.out.println(persArray[i].name);
        }

    }
}
}}
