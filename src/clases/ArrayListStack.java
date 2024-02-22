import java.util.ArrayList;

public class ArrayListStack <E> implements Stack<E>{

	private ArrayList<E> data;
	
    @Override
    public void push(E item) {
        // TODO Auto-generated method stub
        this.data = new ArrayList<>();
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
       if(!isEmpty()) {
    	   return data.remove(data.size()-1);
       }
       return null;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        if(!isEmpty()) {
        	return data.get(data.size()-1);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
       return data.isEmpty();
    }
    
}