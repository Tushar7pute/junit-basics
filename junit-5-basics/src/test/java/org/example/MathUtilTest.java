package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Junit by default creates a separate instance of the MathUtilTest for every Test/Method
 * */
public class MathUtilTest {

    /*
    * Testing is basically checking whether the achieved output is equal to the expected one.
    * Step 1: Create the instance of the class under test
    * Step 2: set up inputs
    * Step 3: Execute the code you want
    * Step 4: Verify the achieved results with expected results
    **/

    /*
    * If we have more than 1 test in the testing class then step1 code to create the object
    * of the class under test would be repeated.
    * To address this we can utilize @BeforeEach annotation.
    * @BeforeEach - The method annotated with this will be executed before each test.
    * */

    MathUtil mathUtil;
    @BeforeEach
    void init(){
        mathUtil = new MathUtil();
    }

    @AfterEach
    void cleanUp(){
        System.out.println("CLeaning Up.....");
    }

    @Test
    public void additionTest() {

        //* Step 1: create the instance of the class under test
        // MathUtil mathUtil = new MathUtil(); --> Eliminated as we are using @BeforeEach above

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
        //MathUtil mathUtil = new MathUtil();--> Eliminated as we are using @BeforeEach above
        // consider radius = 10
        double expectedArea = Math.PI * 10 * 10;
        assertEquals(expectedArea, mathUtil.computeCircleArea(10));
    }


    @Test
    @DisplayName("Testing Division Function")
    void divisionTest(){
        // MathUtil mathUtil = new MathUtil(); --> Eliminated as we are using @BeforeEach above
        assertThrows(ArithmeticException.class, () -> mathUtil.divide(1,0));
    }

    @Test
    @DisplayName("Demo for @Disabled annotation")
    @Disabled
    void disabledDemoTest(){
        fail("This test should be disabled since its failing.");
    }
}
