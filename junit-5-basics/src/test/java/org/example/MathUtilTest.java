package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {

    /*
    Testing is basically checking whether the achieved output is equal to the expected one.
    Step 1: Create the instance of the class under test
    Step 2: set up inputs
    Step 3: Execute the code you want
    Step 4: Verify the achieved results with expected results
     */

    @Test
    public void additionTest() {

        //* Step 1: create the instance of the class under test
        MathUtil mathUtil = new MathUtil();

        //* Step 2: set up inputs
        int firstNumber = 1, secondNumber = 1;
        int expectedOutput = 2;

        //* Step 3: Execute the code you want
        int achievedOutput = mathUtil.add(firstNumber, secondNumber);

        //* Step 4: Verify the achieved results with expected results
        assertEquals(expectedOutput, achievedOutput);


        /*
            The method also have an addition string parameter which is used to display message
            in case of test failures.

            e.g.
            assertEquals(expectedOutput, achievedOutput,"The method should add given input." );
        */
    }



    @Test
    public void computeCircleAreaTest(){
        MathUtil mathUtil = new MathUtil();
        // consider radius = 10
        double expectedArea = Math.PI * 10 * 10;
        assertEquals(expectedArea, mathUtil.computeCircleArea(10));
    }
}
