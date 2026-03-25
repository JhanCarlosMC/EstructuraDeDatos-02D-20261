package co.edu.uniquindio.cola;

public class BiCola <T> extends Cola<T> {
    
    //Agregar el inicio
    public void agregarInicio(T valor) {
        Nodo<T> newNodo = new Nodo<>(valor);
        
        newNodo.setProximo(inicio);
        inicio = newNodo;
        tam ++;
    }
    
    //Eliminar al final
    public void eliminarFinal(){
        if(tam == 0){
            return;
        }
        if(tam == 1 && inicio == fin){
            inicio = null;
            fin = null;
            tam = 0;
        }else{
            Nodo<T> temp = inicio;
            for(int i = 0; i < tam-2; i++){
                temp = temp.getProximo();
            }
            temp.setProximo(null);
            fin = temp;
            tam--;
        }
    }
}
