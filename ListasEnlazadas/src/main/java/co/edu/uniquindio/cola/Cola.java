package co.edu.uniquindio.cola;

public class Cola <T>{

    protected Nodo<T> inicio;
    protected Nodo<T> fin;
    protected int tam;

    public Cola(){
        inicio = null;
        fin = null;
        tam = 0;
    }
    //Agregar Final
    public void agregar(T valor){
        Nodo<T> newElement = new Nodo<>(valor);
        if(inicio == null && fin == null && tam == 0){
            inicio = newElement;
            fin = newElement;
        }else{
            fin.setProximo(newElement);
            fin = newElement;
        }
        tam++;
    }
    //Quitar Inicio
    public void eliminar(){
        if(!(inicio == null && fin == null && tam == 0)){
            inicio = inicio.getProximo();
            tam--;
        }
    }
    //Is Vacia
    public boolean isVacia(){
        boolean flag = false;
        if(inicio == null && fin == null && tam == 0){
            flag = true;
        }
        return flag;
    }
    //Ver Inicio
    public T obtenerInicio(){
        return inicio.getValor();
    }



}
