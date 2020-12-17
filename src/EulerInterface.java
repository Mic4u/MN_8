public interface EulerInterface {

    void calculate(double h, double target, double start);

    double x(double t,double g);
    double f(double t,double g);
}
