
public class SLList <E> implements List<E>{

    private class Node<T>{
        public E data;
        public Node<E> next = null;
        public Node(E cData){
            data = cData;

        }
    }

    public Node <E> head = null;

    @Override
    public void addFirst(E item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addFirst'");
    }

    @Override
    public void addLast(E item) {
        // TODO Auto-generated method stub
        Node<E> newNode = new Node<E>(item);
        if(head == null){
            head = newNode;
        }
        else{
            Node<E> curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    @Override
    public void removeFirst() {
        // TODO Auto-generated method stub
        if(head != null){
            head = head.next;
        }
    
    }

    @Override
    public E removeLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    @Override
    public E getFirst() {
        // TODO Auto-generated method stub
        if(head == null){
            return null;
        }
        return head.data;
    
    }
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return(head == null);
    }
    
}