
public class Euler implements EulerInterface{




    Euler (){



    }

    public void calculate(double h, double target, double start){

        double xEuler=19.53;

        double xipol=19.53;

        double multi = 1000;

        for (int te = (int) ((start+h) * multi); te <= target * multi; te += h * multi) {

            double t = te / multi *1.0;


            xEuler += f(t - h, xipol) * h;



        }

        System.out.println( (h+" \t "+ xEuler));
    }

    public double x(double t, double g) {





        double wynik=-1;

        return wynik;
    }

    public double f(double t, double g) {



        double wynik=-(30/(1-Math.pow(t,2)))+((30*t)/(1-Math.pow(t,2)))*g-Math.pow(g,2);

        return wynik;
    }

}


