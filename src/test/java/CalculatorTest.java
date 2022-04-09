import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    @DisplayName("Different size")
    void differentSize() {
        Person [] arrX = new Person[2];
        Person [] arrY = new Person[1];
        assertFalse(Calculator.isEquels(arrX, arrY));
    }

    @Test
    @DisplayName("Same values")
    void sameValues() {
        Person person = new Person();
        person.firstName = "Yair";
        person.lastName = "Asraf";
        person.address = "Tel-Aviv";

        Person [] arrX = new Person[1];
        Person [] arrY = new Person[1];
        arrX[0] = person;
        arrY[0] = person;

        assertFalse(Calculator.isEquels(arrX, arrY));
    }

    @Test
    @DisplayName("Same values")
    void differentAddressName() {

        // arr x
        Person personX = new Person();
        personX.firstName = "Yair";
        personX.lastName = "Asraf";
        personX.address = "Tel-Aviv";
        Person [] arrX = new Person[1];
        arrX[0] = personX;

        // arr y
        Person personY = new Person();
        personY.firstName = "Yair";
        personY.lastName = "Asraf";
        personY.address = "Haifa";
        Person [] arrY = new Person[1];
        arrY[0] = personY;

        // assert
        assertTrue(Calculator.isEquels(arrX, arrY));
    }

    @Test
    @DisplayName("different first name")
    void differentFirstName(){}

    @Test
    @DisplayName("different first name")
    void differentLastName(){}

    @Test
    @DisplayName("empty arrays")
    void emptyArrays(){}
}