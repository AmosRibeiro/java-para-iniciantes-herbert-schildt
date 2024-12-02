package capitulo06.quicksort;

// Um exemplo simples de classificação rápida.
public class Quicksort {
   
    // Define uma chamada ao método real de classificação rápida. 
    static void qsort(char items[]){
        qs(items, 0 , items.length-1);
    }

    // Uma versão recursiva da classificação rápida para caracteres.
    private static void qs(char items[], int left, int right){
        int i, j;
        char x, y;

        i = left; j = right;
        x = items[(left + right)/2];

        do{
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j--;
            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while (i <= j);

        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i , right);
    }
}
