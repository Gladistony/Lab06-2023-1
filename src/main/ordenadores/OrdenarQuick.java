package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public void quickSort(int[] array, int inicio, int fim){
        if (inicio < fim) {
            int i = quickParticio(array, inicio, fim);
            quickSort(array, inicio, i - 1);
            quickSort(array, i + 1, fim);
        }
    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivo = array[inicio];
        int i = inicio;
        int temp = 0;
        for (int j = inicio + 1; j <= fim; j++) {
            if (array[j] <= pivo) {
                i+=1;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        temp = array[i];
        array[i] = array[inicio];
        array[inicio] = temp;
        return i; 
    }
    
}
