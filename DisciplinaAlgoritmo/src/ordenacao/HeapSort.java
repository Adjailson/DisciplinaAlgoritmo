
package ordenacao;

/**
 *
 * @author Adjailson
 */
public class HeapSort {
    
    private int[] vetor;
    
    public void construirHeap(int[] vetor){
        this.vetor = vetor;
        for(int i = 0; i < vetor.length-1; i++){
            
        }
    }
    
    public void ordenarHeap(int[] vetor){
        this.vetor = vetor;
    }
    
    private void trocar(int atual, int novo){
        
    }
    
    private int filhoEsquerda(int indice){
        return 2 * indice + 1;
    }
    private int filhoDireita(int indice){
        return 2 * indice + 2;
    }
}
