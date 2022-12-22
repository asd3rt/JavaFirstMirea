package ru.mirea.task17;

public class MVC {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeName("Dmitriy");
        controller.setEmployeeId(1234);
        controller.setEmployeeSalary(100300);
        controller.updateView();
    }
    private static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee("Polyak Dmitriy", 12, 242424);
        return employee;
    }
}