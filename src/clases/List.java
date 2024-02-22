

public interface List<E> {
    //interfaz para la opcion de trabajar con listas
    void addFirst(E item);
    void removeFirst();
    E removeLast();
    E getFirst();
    boolean isEmpty();
	void addLast(E item);
}