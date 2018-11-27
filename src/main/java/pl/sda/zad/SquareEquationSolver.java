package pl.sda.zad;

public class SquareEquationSolver {

    private double a;
    private double b;
    private double c;
    private double delta;
    private double X1;
    private double X2;

    public SquareEquationSolver() {
    }

    public SquareEquationSolver(double a, double b, double c, double delta, double x1, double x2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = delta;
        X1 = x1;
        X2 = x2;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        return delta;
    }

    public double getX1() {
        return X1;
    }

    public double getX2() {
        return X2;
    }

    public SquareEquationSolver squareEquationCalc(double a, double b, double c) {
        double x1=0;
        double x2=0;
        double delta;

        delta = b*b-(4*a*c);

        if (delta == 0){
            x1 = x2 = -b/(2*a);
        } else if (delta>0){
            x1= (-b+Math.sqrt(delta))/(2*a);
            x2= (-b-Math.sqrt(delta))/(2*a);
        }


        return new SquareEquationSolver(a,b,c,delta,x1,x2);
    }


}
