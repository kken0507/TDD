/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import main.GradeChecker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class GradeTest {
    @Test
    public void test() {
        GradeChecker gc = new GradeChecker();
        assertEquals(1, gc.checkPassed(10));
        assertEquals(1, gc.checkPassed(5));
        assertEquals(2, gc.checkPassed(11));
    }
}
