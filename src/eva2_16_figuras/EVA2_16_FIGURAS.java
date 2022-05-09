/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_figuras;

/**
 *
 * @author invitado
 */
public class EVA2_16_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo triangulo = new Triangulo(20,30);
        Circulo circulo = new Circulo(25);
        Rectangulo rectangulo = new Rectangulo(50,20);
        
        // System.out.println("Area Triangulo = " + triangulo.calcularArea());
        
        imprimirArea(triangulo);
        imprimirArea(circulo);
        imprimirArea(rectangulo);
        
        classObject(triangulo);
    }

    public static void imprimirArea(Figura f) {
        System.out.println("Area = " +  f.calcularArea());
        /*if(f instanceof Triangulo ) {
            System.out.println("Triangulo");
        } else {
            System.out.println("Otras");}*/
        if (f instanceof Triangulo) {
        Triangulo trian = (Triangulo)f;
        System.out.println(f.getClass());
        }
    }
    
    public static void classObject(Object o) {
        System.out.println(o.getClass());
    }
}
