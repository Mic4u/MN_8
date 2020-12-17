public class Main {

    public static void main(String[] args) {

        double[] h_ar=new double[] {0.05,0.01,0.25,0.001,0.005};

        Euler eu = new Euler();


        for(int i=0;i< h_ar.length;i++)
        eu.calculate(h_ar[i], 0.5,0.05);

        System.out.println("============");

        EulerMod eumod = new EulerMod();


        for(int i=0;i< h_ar.length;i++)
        eumod.calculate(h_ar[i],0.5,0.05);


    }

}