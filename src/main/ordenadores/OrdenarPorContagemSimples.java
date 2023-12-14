package ordenadores;
public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        boolean[] arrayContagem = new boolean[maiorValor(array) + 1];
        for (int i = 0; i < array.length; i++) {
            arrayContagem[array[i]] = true;
        }
        int j = 0;
        for (int i = 0; i < arrayContagem.length; i++) {
            if(arrayContagem[i]) {
                array[j] = i;
                j++;
            }
        }
        return array;
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
