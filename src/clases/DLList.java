

//import clases.SLList.Node;

public class DLList <E> implements List<E>{

	private class Node<T>{
		
		public E data;
		public Node<E> next = null;
		//public Node<E> prev = null;
		public Node(E cData) {
			data = cData;
		}
	}
    public Node <E> head = null;
    public Node<E> tail = null;
    @Override
    public void addFirst(E item) {
        // TODO Auto-generated method stub
    	 Node<E> newNode = new Node<E>(item);
         
         if(tail == null) {
      	   head = newNode;
      	   tail = newNode;
         }else {
      	   head.next = newNode;
      	   head = newNode;
         }
    }

    @Override
    public void addLast(E item) {
        // TODO Auto-generated method stub
       Node<E> newNode = new Node<E>(item);
       
       if(head == null) {
    	   head = newNode;
    	   tail = newNode;
       }else {
    	   tail.next = newNode;
    	   tail = newNode;
       }
    }

    @Override
    public void removeFirst() {
        // TODO Auto-generated method stub
    	if(head != null) {
    		if (head == tail){
                head = null;
                tail = null;
            } else {
                head = head.next;
            	}
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
       if(head == null) {
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