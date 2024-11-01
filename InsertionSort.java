public class InsertionSort {
public static void main(string[] args){
    int[] vetor = {9, 8, 53, 42, 1, 0};
        for(int a : vetor){
            system.out.println(a + " ");
        }
        for(int i=0; i< vetor.length-1; i++){
            int menorValor = vetor[i];
            int indMenorValor = i;
            for(int j = i + 1; j<vetor.length); j ++){
                if (menorValor > vetor[j]){
                    menorValor = vetor{j};
                    indMenorValor = j;
                }
            }
            vetor[indMenorValor] = vetor[1];
            vetor[i] = menorValor;
        }
    }
}
