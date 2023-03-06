package creational.builder;

import java.util.Arrays;
import java.util.List;

public class MainBuilder {
    public static void main(String[] args) {
        //Building the object of Employee thru the build() method provided in EmployeeBuilder class.
        Employee employee =  new Employee.EmployeeBuilder("Ivan","TTT").setHasCar(true).setHasBike(true).build();
        Employee employee1 = new Employee.EmployeeBuilder("Vikram", "ABC").setMiddleName("Ivanovich").build();
        Employee.EmployeeBuilder employeeBuilder = new Employee.EmployeeBuilder("Bob","Johnson");
        employeeBuilder.setHasBike(true);
        employeeBuilder.setMiddleName("Simson");
        Employee build = employeeBuilder.build();

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println("build = " + build);

        String[] array = {"One", "Two", "Three"};
        List<String> strings = Arrays.asList(array);
        strings.set(0, "1");
        System.out.println(Arrays.toString(array));

    }
}
