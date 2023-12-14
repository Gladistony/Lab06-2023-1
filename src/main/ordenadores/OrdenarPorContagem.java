package ordenadores;
public class OrdenarPorContagem implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int[] arrayOrdenado = new int[array.length];
        int[] arrayContagem = new int[maiorValor(array) + 1];
        for (int i = 0; i < array.length; i++) {
            arrayContagem[array[i]] += 1;
        }
        for (int i = 1; i < arrayContagem.length; i++) {
            arrayContagem[i] += arrayContagem[i - 1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            arrayContagem[array[i]] -= 1;
            arrayOrdenado[arrayContagem[array[i]]] = array[i];
        }
        return arrayOrdenado;
    }
    public int maiorValor(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

}
