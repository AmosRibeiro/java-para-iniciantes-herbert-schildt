package capitulo13.genericos;

class Gen<T> {
    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void ShowType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
    
}
