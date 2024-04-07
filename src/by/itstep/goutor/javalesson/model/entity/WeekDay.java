package by.itstep.goutor.javalesson.model.entity;

public class WeekDay {
    private String name;
    private int number;

    public WeekDay() {
        name = "Monday";
        number = 1;
    }

    public WeekDay(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name + "-Week day" + "\n" + number + "-Week day number";
    }
}
