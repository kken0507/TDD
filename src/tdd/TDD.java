/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import main.GradeChecker;

/**
 *
 * @author User
 */
public class TDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GradeChecker gc = new GradeChecker();
        System.out.println("10: " + gc.checkPassed(10));
        System.out.println("5: " + gc.checkPassed(5));
        System.out.println("4.999: " + gc.checkPassed(4.999));
        System.out.println("11: " + gc.checkPassed(11));
    }
    
}
