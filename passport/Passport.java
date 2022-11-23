package passport;

import java.util.Objects;

public class Passport {
    private final int numberOfPassport;

    private final String lastName;

    private final String name;

    private String thirdName;

    private final String birthDay;


    public Passport(int numberOfPassport, String lastName, String name, String thirdName, String birthDay) {
            this.numberOfPassport = numberOfPassport;
        if (lastName == null || lastName.isBlank() || lastName.isEmpty()) {
            throw new RuntimeException("Введите корректную фамилию!");
        } else {
            this.lastName = lastName;
        }
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new RuntimeException("Введите корректное имя!");
        } else {
            this.name = name;
        }
        if (thirdName == null) {
            throw new RuntimeException("Введите корректное отчество или оставьте поле пустым!");
        } else {
            this.thirdName = thirdName;
        }

        if (birthDay == null || birthDay.isBlank() || birthDay.isEmpty()) {
            throw new RuntimeException("Введите корректную дату рождения!");
        } else {
            this.birthDay = birthDay;
        }
    }


    public int getNumberOfPassport() {
        return numberOfPassport;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(numberOfPassport, passport.numberOfPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfPassport);
    }


    public void information () {
        System.out.println("Данные паспорта: номер - " + getNumberOfPassport() + ", фамилия - " + getLastName() + ", имя - "
        + getName() + ", отчество - " + getThirdName() + ", дата рождения - " + getBirthDay());
    }
}

