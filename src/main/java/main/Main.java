package main;

import location.model.Location;
import task.model.Priority;
import task.model.Skill;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Location location = new Location(1, "Lodz", "90-404",
                "Pomorska", "5");

        Task task = new Task(1, "Instalacja", "instalacja sprzetu klienta",
                null, Status.OPEN, false, LocalDate.now(), null,
                null, Priority.LOW, location, null, null);

        Task task2 = new Task.TaskBuilder(2, "Naprawa Usterki")
                .withDueDate(LocalDate.now().plusDays(5))
                .withPriority(Priority.MEDIUM)
                .withSummary(":)")
                .withLocation(new Location(1,"Łódź","90-500","Mickiewicza","9"))
                .withStatus(Status.OPEN)
                .build();
    }
}
