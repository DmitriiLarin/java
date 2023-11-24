package project11.task3;

import java.text.SimpleDateFormat;

public enum BirthdayDateFormat {
    SHORT(new SimpleDateFormat("dd.MM")),
    MEDIUM(new SimpleDateFormat("dd.MM.yyyy")),
    FULL(new SimpleDateFormat("dd.MM.yyyy HH:mm"));

    private SimpleDateFormat dateFormat;
    BirthdayDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }
}
