package org.monicaraje;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




class TextUtilsTest {

    //Null input value
    @Test
    void getLongestWord() {
        //fail("Test not implemented yet");
        final String input = "Hello welcome to Junit Test method";
        final String expected = "welcome";
        final String observed = TextUtils.getLongestWord(input);
        assertEquals(expected,observed);
    }

    @Test
    void isIlegalInput(String text){

        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> TextUtils.getLongestWord(null));

        assertEquals(exception.getMessage(),"Text is empty or null");

        /*assertTrue(TextUtils.isIllegalInput(text));
        assertFalse(false);
        assertNull(new Object());
        assertNotNull(new Object());
        assertThrows(null,null);
        assertArrayEquals(new int[],new int[]);
        //assertAll();
        assertSame(new TextUtils(),new Object());
        assertNotSame(new Object(),new Object());
        fail("Fail");package*/

    }

    @DisplayName("Testing the name elements of Person")
    @Test
    void groupedAssertions() {
        class Person {
            String firstName;
            String LastName;
            public Person(String firstName, String lastName) {
                this.firstName = firstName;
                LastName = lastName;
            }
            public String getFirstName() {
                return firstName;
            }
            public String getLastName() {
                return LastName;
            }
        }

        Person person = new Person("Jane", "Goodall");
        // In a grouped assertion all assertions are executed, and all
        // failures will be reported together.
        assertAll("person",
                () -> assertEquals("Jane", person.getFirstName()),
                () -> assertEquals("Goodall", person.getLastName())
        );
    }


    @Test
    void dependentAssertions() {
        class Person {
            String firstName;
            String LastName;
            public Person(String firstName, String lastName) {
                this.firstName = firstName;
                LastName = lastName;
            }
            public String getFirstName() {
                return firstName;
            }
            public String getLastName() {
                return LastName;
            }
        }

        Person person = new Person("Jane", "Goodall");

        // Within a code block, if an assertion fails the
        // subsequent code in the same block will be skipped.
        assertAll("properties",
                () -> {
                    String firstName = person.getFirstName();
                    assertNotNull(firstName);

                    // Executed only if the previous assertion is valid.
                    assertAll("first name",
                            () -> assertTrue(firstName.startsWith("J")),
                            () -> assertTrue(firstName.endsWith("e"))
                    );
                },
                () -> {
                    // Grouped assertion, so processed independently
                    // of results of first name assertions.
                    String lastName = person.getLastName();
                    assertNotNull(lastName);

                    // Executed only if the previous assertion is valid.
                    assertAll("last name",
                            () -> assertTrue(lastName.startsWith("G")),
                            () -> assertTrue(lastName.endsWith("p"))
                    );
                }
        );
    }
}