public class Home_work_5 {
    public static void main(String[] args) {
         /*
    Создать массив из 5 сотрудников.
     */
        Employee[] employees = {
                new Employee("John",
                        "Director",
                        "fgdfgdfg@mail.com",
                        "546456456",
                        600000,
                        45),
                new Employee("Max",
                        "Manager",
                        "fgderg@mail.com",
                        "54576456",
                        700000,
                        43),
                new Employee("Kevin",
                "Developer",
                "fgsdsdfg@mail.com",
                "58856456",
                100000,
                34),
                new Employee("Matt",
                "Mentor",
                "fgdfgfg@mail.com",
                "336456456",
                400000,
                31),
                new Employee("Mark",
                "Head of department",
                "fgdfllfg@mail.com",
                "549956456",
                800000,
                49),
        };

    /*
    С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     */
        int minAge = 40;
        for (Employee employee : employees)
        {
            if (employee.age > minAge)
            {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}
