import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee sam = new Employee(123, "sam", "manager", 34);
        Employee mj = new Employee(119, "mj", "boss", 21);
        Employee badi = new Employee(111, "bad", "manager", 50);
        List<Employee> employees = new ArrayList<>();
        employees.add(sam);
        employees.add(mj);
        employees.add(badi);
//        employees.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee, Employee t1) {
//                return (int) employee.getWorkedHours() - (int) t1.getWorkedHours();
//            }
//        });
        sort(employees);
        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getWorkedHours());
        }



    }
    private static void sort(List<Employee> employees) {
        for(int i = 0; i < employees.size() - 1; i++){
            for(int j = i + 1; j < employees.size(); j++) {
                if(employees.get(i).getWorkedHours() > employees.get(j).getWorkedHours())
                    Collections.swap(employees, i, j);
            }
        }
    }
}
class Employee {
    // fields
    private int id;
    private String name;
    private String occupation;
    private float workedHours;
    //salaries for employees
    private final float SALARY_BOSS = 30;
    private final float SALARY_MANAGER = 17;
    private final float SALARY_EMPLOYEE = 10;
    Employee(int id, String name, String occupation, float workedHours) {
        this.id = id;
        this.name = name;
        this.occupation = occupation;
        this.workedHours = workedHours;
    }



    public void inputInfo() {

        System.out.print("Enter id: ");
        this.id = (new Scanner(System.in)).nextInt();

        System.out.print("\nEnter name: ");
        this.name = (new Scanner(System.in)).next();

        System.out.print("\nEnter occupation: ");
        this.occupation = (new Scanner(System.in)).next();

        System.out.print("\nEnter workedHours: ");
        this.workedHours = (new Scanner(System.in)).nextFloat();
    }

    public void showInfo() {
        System.out.println("id:" + this.id);
        System.out.println("name: " + this.name);
        System.out.println("occupation:" + this.occupation);
        System.out.println("worked hours: " + this.workedHours);
    }

    public float calculateSalary() {
        float salary = 0;
        switch(this.occupation.toLowerCase()) {
            case "boss":
                salary = bossSalaryCalculate();
                break;

            case "manager":
                salary = this.workedHours * SALARY_MANAGER;
                break;

            case "employee":
                salary =  this.workedHours * SALARY_EMPLOYEE;
                break;
        }


        return salary;
    }

    private float bossSalaryCalculate() {
        if(this.occupation.toLowerCase().equals("boss"))
            return this.workedHours * SALARY_BOSS;
        else
            return 0;
    }

    public boolean addWorkHours(float hours) {
        if (hours >= 24)
            return false;

        if(this.occupation.toLowerCase().equals("employee")
            || this.occupation.toLowerCase().equals("boss")
            || this.occupation.toLowerCase().equals("manager")) {

            this.workedHours += hours;

            return true;
        } else
            return false;


    }

    public float getWorkedHours() {
        return workedHours;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public void setWorkedHours(float workedHours) {
        this.workedHours = workedHours;
    }

}
