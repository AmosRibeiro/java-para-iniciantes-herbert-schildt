package capitulo6.testedocap6;

public class Stack {
    
    private char pilha[];
    int pushIndex, popIndex;

    Stack(int pilhaTamanho){
        pilha = new char[pilhaTamanho];
        pushIndex = popIndex = 0;
    }

    Stack(char a[]){
        pushIndex = 0;
        popIndex = 0;

        pilha = new char[a.length];

        for(int i = 0; i < a.length; i++) push (a[i]);
    }

    public void push(char ch){
        if(pushIndex==pilha.length){
            System.out.println(" - Queue is full.");
            return;
        }

        pilha[pushIndex++] = ch;
    }
    

    char pop(){
        if(popIndex == pushIndex) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return pilha[popIndex++];     
    }
}
