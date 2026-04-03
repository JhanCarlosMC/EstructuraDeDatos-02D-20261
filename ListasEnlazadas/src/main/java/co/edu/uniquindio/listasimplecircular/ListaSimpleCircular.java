package co.edu.uniquindio.listasimplecircular;

public class ListaSimpleCircular<T> {
    private Nodo<T> inicial;
    private int tam;

    public ListaSimpleCircular() {
        inicial = null;
        tam = 0;
    }

    public boolean insertarFinal(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);

        if(inicial == null && tam == 0) {
            inicial = nuevo;
            inicial.setProximo(inicial);
            tam++;
            return true;
        }
            Nodo<T> tempo = inicial;
            while(tempo.getProximo() != inicial) {
                tempo = tempo.getProximo();
            }
            tempo.setProximo(nuevo);
            nuevo.setProximo(inicial);
            tam++;
            return true;

    }

    public void insertarInicio(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);

        if (tam == 0) {
            inicial = nuevoNodo;
            inicial.setProximo(inicial);
        } else {
            Nodo<T> tempo = inicial;
            while (tempo.getProximo() != inicial) {
                tempo = tempo.getProximo();
            }
            tempo.setProximo(nuevoNodo);
            nuevoNodo.setProximo(inicial);
            inicial = nuevoNodo;
        }
        tam++;
    }

    public void eliminarFinal() {
        if(inicial != null && inicial.getProximo() == inicial && tam == 1) {
            inicial = null;
            tam--;
            return;
        }

        Nodo<T> tempo = inicial;
        while(tempo.getProximo().getProximo() != inicial) {
            tempo = tempo.getProximo();
        }
        tempo.setProximo(inicial);
        tam--;
    }

    public void eliminarInicio() {
        if (tam == 0) return;
        if (tam == 1) {
            inicial = null;
        } else {
            Nodo<T> tempo = inicial;
            while (tempo.getProximo() != inicial) {
                tempo = tempo.getProximo();
            }
            tempo.setProximo(inicial.getProximo());
            inicial = inicial.getProximo();
        }
        tam--;
    }

    public boolean esVacia(){
        return inicial == null && tam == 0;
    }

    public int localizar(T valor) {
        Nodo<T> tempo = inicial;
        int index = 0;

        do {
            if(tempo.getValor().equals(valor)) {
                return index;
            }
            tempo = tempo.getProximo();
            index++;
        }while(tempo != null);

        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ListaSimpleCircular: ");
        if (tam == 0) {
            sb.append("vacia");
        } else {
            Nodo<T> temp = inicial;
            for (int i = 0; i < tam; i++) {
                sb.append(temp.getValor()).append("[").append(temp.getProximo().getValor()).append("]");
                if (i < tam - 1) sb.append(" -> ");
                temp = temp.getProximo();
            }
            sb.append(" (circular)");
        }
        return sb.toString();
    }

    public Nodo<T> getInicial() {
        return inicial;
    }

    public void setInicial(Nodo<T> inicial) {
        this.inicial = inicial;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
}
