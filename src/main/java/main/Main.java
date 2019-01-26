package main;

import employee.Employee;
import employee.EmployeeFactory;
import employee.EmployeeType;
import location.LocationRepository;
import location.model.Location;
import task.model.Priority;
import task.model.Skill;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        LocationRepository locationRepository = LocationRepository.getInstance();

        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee technician1 = employeeFactory.create(EmployeeType.TECHNICIAN, 1, "Jan Kowalski", "JK31");
        Employee technician2 = employeeFactory.create(EmployeeType.TECHNICIAN, 2, "Wojtek Nowak", "WN25");
        Employee despather1 = employeeFactory.create(EmployeeType.DESPATHER, 3, "Izabella Sowa", "IS29");

        Task task2 = new Task.TaskBuilder(2, "Naprawa Usterki")
                .withDueDate(LocalDate.now().plusDays(5))
                .withPriority(Priority.MEDIUM)
                .withSummary(":)")
                .withLocation(locationRepository.findById(1))
                .withStatus(Status.OPEN)
                .withCreateUserExternalId(despather1.getExternalId())
                .build();

        task2.setAssignedUserExternalId(technician1.getExternalId());

        Task task3 = new Task.TaskBuilder(2, "Naprawa Usterki")
                .withDueDate(LocalDate.now().plusDays(5))
                .withPriority(Priority.MEDIUM)
                .withSummary(":)")
                .withLocation(locationRepository.findById(2))
                .withStatus(Status.OPEN)
                .withCreateUserExternalId(despather1.getExternalId())
                .build();


    }
}
