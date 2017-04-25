
package ordenacao;

/**
 *
 * @author Adjailson
 */
public class HeapSort {
    
    private int[] vetor;
    
    public void construirHeap(int[] vetor){
        this.vetor = vetor;
    }
    
    private int filhoEsquerda(int indice){
        return 2 * indice + 1;
    }
    private int filhoDireita(int indice){
        return 2 * indice + 2;
    }
}
