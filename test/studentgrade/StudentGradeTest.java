package studentgrade;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentGradeTest {

    @Test
    public void testGetGrade95() {
        assertEquals("A", StudentGrade.getGrade(95));
    }

    @Test
    public void testGetGrade85() {
        assertEquals("B", StudentGrade.getGrade(85));
    }

    @Test
    public void testGetGrade75() {
        assertEquals("F", StudentGrade.getGrade(75));
    }
}
