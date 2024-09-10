import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("John", "Doe", "JD001", "Mr.", 1990);
    }

    @Test
    void testConstructorAndGetters() {
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals("JD001", person.getID());
        assertEquals("Mr.", person.getTitle());
        assertEquals(1990, person.getYOB());
    }

    @Test
    void testSetters() {
        person.setFirstName("Jane");
        person.setLastName("Smith");
        person.setTitle("Ms.");
        person.setYOB(1995);

        assertEquals("Jane", person.getFirstName());
        assertEquals("Smith", person.getLastName());
        assertEquals("Ms.", person.getTitle());
        assertEquals(1995, person.getYOB());
    }

    @Test
    void testFullName() {
        assertEquals("John Doe", person.fullName());
    }

    @Test
    void testFormalName() {
        assertEquals("Mr. John Doe", person.formalName());
    }

    @Test
    void testGetAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int expectedAge = currentYear - 1990;
        assertEquals(String.valueOf(expectedAge), person.getAge());
    }

    @Test
    void testGetAgeWithYear() {
        assertEquals("30", person.getAge(2020));
    }

    @Test
    void testToCSV() {
        assertEquals("JD001,John,Doe,Mr.,1990", person.toCSV());
    }

    @Test
    void testToJSON() {
        assertEquals("{\"ID\":\"JD001\",\"firstName\":\"John\",\"lastName\":\"Doe\",\"title\":\"Mr.\",\"YOB\":1990}", person.toJSON());
    }

    @Test
    void testToXML() {
        assertEquals("<person><ID>JD001</ID><firstName>John</firstName><lastName>Doe</lastName><title>Mr.</title><YOB>1990</YOB></person>", person.toXML());
    }

    @Test
    void testToString() {
        assertEquals("Person{ID='JD001', firstName='John', lastName='Doe', title='Mr.', YOB=1990}", person.toString());
    }

    @Test
    void testEquals() {
        Person samePerson = new Person("John", "Doe", "JD001", "Mr.", 1990);
        Person differentPerson = new Person("Jane", "Smith", "JS001", "Ms.", 1995);

        assertTrue(person.equals(samePerson));
        assertFalse(person.equals(differentPerson));
    }
}