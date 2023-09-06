package Parte1.Act4;

public class Restar {
    
    public static void restar(int[] nro) {
       
            int i=0;
            while(i < nro.length && nro[i] == 0) {
              nro[i] = 1;
              i++;
            }
            if(i < nro.length){
              nro[i] = 0;
            }
      }
}

/*Explicacion de la eficiencia del algoritmo 
Cuando el arreglo tiene al menos un 1 una corrida de restar va a tener el orden O(k), entonces si realizamos n restas desde el 
comienzo del arreglo en el peor de los casos el algoritmo tiene una eficiencia de O(nk)
 */

    
    

