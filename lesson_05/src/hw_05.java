public class hw_05 {
    public static void main(String[] args){
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иванов И.И.", "старший инженер", "iva@mail.ru", 1234567, 123990, 45);
        employee[1] = new Employee("Петров П.П.", "начальник отдела", "pet@mail.ru", 1234568, 153990, 39);
        employee[2] = new Employee("Сидоров С.С.", "инженер", "sid@mail.ru", 1234569, 99990, 27);
        employee[3] = new Employee("Семенов С.С.", "техник", "sem@mail.ru", 1234570, 110990, 43);
        employee[4] = new Employee("Иванова Е.И.", "бухгалтер", "Ive@mail.ru", 1234571, 150990, 40);

        employee[4].printEmployee(true);

        System.out.println("\nСписок сотрудников старше 40 лет:");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].age > 40) {
                employee[i].printEmployee();
            }
        }
    }
}
