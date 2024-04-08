package by.itstep.goutor.javalesson.model.entity;

public enum WeekDayType {
    MONDAY, TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3), THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5), SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String name;
    private final int number;

   WeekDayType() {
        name = "Monday";
        number = 1;
    }

    WeekDayType(String name, int number) {
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
