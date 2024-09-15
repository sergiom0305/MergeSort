
package interfaz;

import mundo.Merge;


public class InterfazApp {


    public static void main(String[] args) {

        Comparable[] a = new Comparable[5];
        for (int i = 0; i < 5; i++) {
            a[i] = (int)(Math.random()*25+1);
        }
        System.out.print("|");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + "|");
        }
        Merge m = new Merge(a);
        System.out.println(" is sorted?: " + m.isSorted(a));
        m.sort(a);
        System.out.println("");
        System.out.println("Array ordenado:");
        m.show(a);
        System.out.println(" is sorted?: " + m.isSorted(a));
        
        
    }
    
}
