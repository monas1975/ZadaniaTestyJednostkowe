package pl.sda.zad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareEquationSolverTest {

    private SquareEquationSolver squareEquationSolver;

    @Before
     public void setUp(){
         squareEquationSolver = new SquareEquationSolver();
    }

    @Test

    public void shouldReturnDeltaEq0If4xsq2plus4xplus1(){
        //given
        final double a = 4;
        final double b = 4;
        final double c = 1;
        final double expectedDelta = 0;

        //when
        double deltaResult = squareEquationSolver.squareEquationCalc(4,4,1).getDelta();

        //then
        Assert.assertEquals(expectedDelta,deltaResult,0.001);

    }
     @Test
    public void shouldReturnX1EqX2EqMinus05Iff4xsq2plus4xplus1(){
        //given
        final double a = 4;
        final double b = 4;
        final double c = 1;
        final double expectedX1 = -0.5;
        final double expectedX2 = -0.5;

        //when
        double X1 = squareEquationSolver.squareEquationCalc(4,4,1).getX1();
        double X2 = squareEquationSolver.squareEquationCalc(4,4,1).getX2();

        //then
        Assert.assertEquals(expectedX1,X1,0.00005);
        Assert.assertEquals(expectedX2,X2,0.00005);


    }

    @Test

    public void shouldReturnDeltaEq1IfMinus2xsq2plus3xMinus1(){
        //given
        final double a = -2;
        final double b = 3;
        final double c = -1;
        final double expectedDelta = 1;

        //when
        double deltaResult = squareEquationSolver.squareEquationCalc(a,b,c).getDelta();

        //then
        Assert.assertEquals(expectedDelta,deltaResult,0.001);

    }

    @Test
    public void shouldReturnX1Eq05AndX2Eq1IfMinus2xsq2plus3xMinus1(){
        //given
        final double a = -2;
        final double b = 3;
        final double c = -1;
        final double expectedX1 = 0.5;
        final double expectedX2 = 1;

        //when
        double X1 = squareEquationSolver.squareEquationCalc(a,b,c).getX1();
        double X2 = squareEquationSolver.squareEquationCalc(a,b,c).getX2();

        //then
        Assert.assertEquals(expectedX1,X1,0.00005);
        Assert.assertEquals(expectedX2,X2,0.00005);


    }


}
