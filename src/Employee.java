public class Employee {
    /*
    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
     */
    private String name;
    private String position;
    private String email;
    private String telephone;
    private int cash;
    int age;

    /*
    Конструктор класса должен заполнять эти поля при создании объекта.
     */

    public Employee(String name,
                    String position,
                    String email,
                    String telephone,
                    int cash,
                    int age)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.cash = cash;
        this.age = age;
    }
    /*
    Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     */
    void printInfo()
    {
        System.out.println("ФИО: " + name);
        System.out.println("должность: " + position);
        System.out.println("почта: " + email);
        System.out.println("телефон: " + telephone);
        System.out.println("зарплата: " + cash);
        System.out.println("возраст: " + age);

    }

}
