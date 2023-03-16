import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {

    public static Set<Passport> passports = new HashSet<>();

    private final int passportNumber;
    private final String lastName;
    private final String name;
    private final String middleName;
    private final String dateOfBirth;

    public Passport(int passportNumber, String lastName, String name, String middleName, String dateOfBirth) {
        this.passportNumber = passportNumber;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
    }

    public void addToSet() {
        passports.remove(this);
        passports.add(this);
    }

    public static Passport getByNumber(int n) {

        for (Passport passport : passports) {
            if (passport.passportNumber == n) {
                return passport;
            }
        }

        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber == passport.passportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }

    @Override
    public String toString() {
        return lastName;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
