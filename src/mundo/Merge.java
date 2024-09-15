
package mundo;


public class Merge{
    
    private Comparable[] array;

    public Merge(Comparable[] a) {   
        array = a; 
    }

    public static void sort(Comparable[] a) {
        
        if (a.length > 1) {
            
            int med = a.length / 2;

            Comparable[] left = new Comparable[med];
            Comparable[] right = new Comparable[a.length - med];

            System.arraycopy(a, 0, left, 0, med);
            System.arraycopy(a, med, right, 0, a.length - med);

            sort(left);
            sort(right);

            exch(a, left, right);
        }
    }

    private static void exch(Comparable[] array, Comparable[] left, Comparable[] right) {
        int i = 0; 
        int j = 0; 
        int k = 0; 

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }       
    }
    
    private boolean less(Comparable v,Comparable w){        
        return w.compareTo(v) > 0;        
    }
    
    public void show(Comparable[] a){        
        System.out.print("|");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + "|");
        }
    }
     
    public boolean isSorted(Comparable[] a){
        for (int i = 1; i < array.length; i++) {
           if(less(array[i],array[i-1])){
               return false;
           } 
        }
        return true;       
    }
        
}
