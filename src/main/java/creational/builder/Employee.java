package creational.builder;

public class Employee {

    private String name;
    private String company;
    private boolean hasCar;//optional
    private boolean hasBike;//optional
    private String middleName;

    private Employee(EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        company = employeeBuilder.company;
        hasCar = employeeBuilder.hasCar;
        hasBike = employeeBuilder.hasBike;
        middleName = employeeBuilder.middleName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", hasCar=" + hasCar +
                ", hasBike=" + hasBike +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public static class EmployeeBuilder {
        private String middleName;
        private String name;
        private String company;
        private boolean hasCar;//optional
        private boolean hasBike;//optional

        //constructor for required fields
        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        //setter methods for optional fields
        public EmployeeBuilder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }


        public EmployeeBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }


        public EmployeeBuilder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        //Build the Employee object
        public Employee build() {
            return new Employee(this);
        }
    }
}

