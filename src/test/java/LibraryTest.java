import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'dbutakov' at '10/15/16 12:10 AM' with Gradle 3.1
 *
 * @author dbutakov, @date 10/15/16 12:10 AM
 */
public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testWithAnError() {
        Library classUnderTest = new Library();
        assertThat(classUnderTest.someLibraryMethod(), is(false));
    }
}