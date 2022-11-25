import java.util.HashSet;
import java.util.Set;

import passport.Passport;
import passport.PassportList;

public class Main {
    public static void main(String[] args) {
        Passport passport1 = new Passport(12345678, " Сафуанов", "Артем", "Римович", "08.01.1993");
        Passport passport2 = new Passport(12345678, " Сафуанов", "Артем", " ", "08.01.1993");
        Passport passport3 = new Passport(123456789, " Сафуанова", "Екатерина", " ", "15.11.1990");

        PassportList passports = new PassportList();

        passports.addUpdatePassport(passport1);
        passports.addUpdatePassport(passport2);
        passports.addUpdatePassport(passport3);

        passports.findPassport(1234);

        passport1.information();
        System.out.println();
    }
}
