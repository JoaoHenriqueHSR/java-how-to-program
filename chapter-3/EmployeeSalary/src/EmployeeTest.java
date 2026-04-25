public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Leticia", "Silva", -334);
        Employee employee2 = new Employee("Marcia", "Cordeiro", 4350);

        System.out.printf("Nome: %s %s | Salario Anual: %.2f", employee1.getName(), employee1.getSurname(), employee1.getMonthlySalary()*12);
        System.out.print("\n");
        System.out.printf("Nome: %s %s | Salario Anual: %.2f", employee2.getName(), employee2.getSurname(), employee2.getMonthlySalary()*12);
        System.out.print("\n");

        employee2.setMonthlySalary(employee2.getMonthlySalary()+employee2.getMonthlySalary()*0.1);
        System.out.printf("Nome: %s %s | Salario Anual: %.2f", employee2.getName(), employee2.getSurname(), employee2.getMonthlySalary()*12);
    }
}
