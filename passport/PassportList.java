package passport;

import java.util.HashSet;
import java.util.Set;


public class PassportList {
    private final Set<Passport> passports = new HashSet<>();

    public void addUpdatePassport(Passport passport) {
        this.passports.add(passport);
    }

    public Passport findPassport(int number) {
        for (Passport passport : passports) {
            if (passport.getNumberOfPassport() == number) {
                return passport;
            }
        }
        return null;
    }
}
