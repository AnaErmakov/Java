public class Employee {
    String name;
    String vacancy;
    String email;
    int phone;
    int salary;
    int age;

    public Employee(String name, String vacancy, String email, int phone, int salary, int age){
        this.name = name;
        this.vacancy = vacancy;
        this.email = email;
        this.phone = phone;
        this. salary = salary;
        this.age = age;
    }

    public void printEmployee(){
        System.out.println(this.name);
    }

    public void printEmployee(boolean allInfo){
        System.out.println(this.name);
        System.out.println("Должность: " + this.vacancy);
        System.out.println("Зарплата: " + this.salary);
        System.out.println("Почта: " + this.email);
        System.out.println("Телефон: " + this.phone);
        System.out.println("Возраст: " + this.age);
    }
}
