/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khoirul-06990
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] x = {2, 3, 5, 6, 7, 8};
    int[] y = {1, 3, 3, 4, 6, 7};
    int Ey = 0;
    int E2x = 0;
    int Ex = 0;
    int Exy = 0;
    int Ex2;
    int n = 6;
    double xdata = 9, ydata;
    double c1, c2, c3, m1, m2, m3 ;
        for (int i=0; i<6; i++)
        {
            Ey+=y[i];
            E2x+=(x[i]*x[i]);
            Ex+=x[i];
            Exy+=(x[i]*y[i]);
        }
        Ex2 = Ex*Ex;
        c1 = ((Ey*E2x)-(Ex*Exy));
        c2 = ((n*E2x)-Ex2);
        c3 = c1/c2;
        m1 = (n*Exy)-(Ex*Ey);
        m2 = (n*E2x)-Ex2;
        m3 = m1/m2;
        ydata = (m3*xdata)+c3;
        System.out.println(Ey);
        System.out.println(E2x);
        System.out.println(Ex);
        System.out.println(Exy);
        System.out.println(Ex2);
        System.out.println(n);
        System.out.println(c3);
        System.out.println(m3);
        System.out.println(ydata);
    }
    
}
