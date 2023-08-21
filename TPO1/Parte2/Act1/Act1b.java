package Parte2.Act1;

public class Act1b {

    public static void main(String[] args) {

        char[] A = { 'a', 'C', 'c','D', 'b', 'A','B'};
        char[] ALowerCase = new char[A.length];
        int[] contador = new int[A.length];
        char[] S = new char[A.length];
 
        for (int i = 0; i < A.length; i++) {
            contador[i] = 0;
            ALowerCase[i] = Character.toLowerCase(A[i]);
        }

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i+1; j < A.length; j++) {
                System.out.println(A[i]+""+A[j]);
                if(ALowerCase[i]<ALowerCase[j]){
                    contador[j] = contador[j]+1;
                }else{
                    contador[i] = contador[i]+1;
                }
            }
        }

        for(int i=0;i<A.length;i++){
            S[contador[i]] = A[i];
        }

        for(int i=0;i<A.length;i++){
            System.out.println("Pos "+i+": "+S[i]);
        }
    }
}