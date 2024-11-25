package capitulo6.testedocap6;

public class Stack {
    
    private char pilha[];
    private int tos;

    Stack(int size){
        pilha = new char[size];
        tos = 0;
    }

    Stack(Stack ob){
        tos = ob.tos;
        pilha = new char[ob.pilha.length];

        for(int i = 0; i < tos; i++) 
            pilha[i] = ob.pilha[i];
    }

    Stack(char a[]){
        pilha = new char[a.length];

        for(int i = 0; i < a.length; i++){
            push(a[i]);
        }
    }

    void push(char ch){
        if(tos==pilha.length){
            System.out.println(" -- Pilha está cheia.");
            return;
        }

        pilha[tos] = ch;
        tos++;
    }
    
    char pop(){
        if(tos == 0){
            System.out.println(" -- Pilha está vazia.");
            return (char) 0;
        }

        tos--;
        return pilha[tos];
    }
}
