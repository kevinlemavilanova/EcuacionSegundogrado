/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Ecuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = Integer.parseInt(JOptionPane.showInputDialog("Valor de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Valor de B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Valor de C"));
        
        double res1 = (-b + (Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        double res2 = (-b - (Math.sqrt(Math.pow(b, 2)-4*a*c)))/(2*a);
        
        System.out.println(res1);
        System.out.println(res2);

    }
    
}
