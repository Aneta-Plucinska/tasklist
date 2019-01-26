package employee;

public class EmployeeFactory {
    public Employee create(EmployeeType employeeType, int id, String fullName, String externalId){
        if(EmployeeType.TECHNICIAN.equals(employeeType)){

            return new Technician(id, fullName, externalId, employeeType);

        } else if(EmployeeType.DESPATHER.equals(employeeType)) {
            return new Despather(id, fullName, externalId, employeeType);
        }
        return null;
    }
}
