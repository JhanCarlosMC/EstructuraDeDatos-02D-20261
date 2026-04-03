package co.edu.uniquindio.listadoble;

public class ListaDoble<T> {
    private NodoDoble<T> inicial;
    private NodoDoble<T> ultimo;
    private int tam;

    public ListaDoble() {
        inicial = null;
        tam = 0;
    }

    public boolean insertarFinal(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor);

        if(inicial == null && tam == 0) {
            inicial = nuevo;
            tam++;
            return true;
        }
            NodoDoble<T> tempo = inicial;
            while(tempo.getSiguiente() != null) {
                tempo = tempo.getSiguiente();
            }
            tempo.setSiguiente(nuevo);
            tam++;
            return true;

    }

    public void insertarInicio(T valor) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(valor);

        nuevoNodo.setSiguiente(inicial);
        inicial = nuevoNodo;
        tam++;
    }

    public void eliminarFinal() {
        if(inicial != null && inicial.getSiguiente() == null && tam == 1) {
            inicial = null;
            tam--;
            return;
        }

        NodoDoble<T> tempo = inicial;
        while(tempo.getSiguiente().getSiguiente() != null) {
            tempo = tempo.getSiguiente();
        }
        tempo.setSiguiente(null);
        tam--;
    }

    public void eliminarInicio() {
        if(inicial != null && tam > 0){
            inicial = inicial.getSiguiente();
            tam--;
        }
    }

    public boolean esVacia(){
        return inicial == null && tam == 0;
    }

    public int localizar(T valor) {
        NodoDoble<T> tempo = inicial;
        int index = 0;

        do {
            if(tempo.getValor().equals(valor)) {
                return index;
            }
            tempo = tempo.getSiguiente();
            index++;
        }while(tempo != null);

        return -1;
    }

    @Override
    public String toString() {
        return "ListaSimplementeEnlazada{" +
                "inicial = " + inicial +
                '}';
    }

    public NodoDoble<T> getInicial() {
        return inicial;
    }

    public void setInicial(NodoDoble<T> inicial) {
        this.inicial = inicial;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
}
