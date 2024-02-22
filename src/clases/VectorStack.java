
import java.util.Vector;


public class VectorStack <E> implements Stack<E>{

    Vector<E> data = null;
	public VectorStack() {
		data = new Vector<E>();
	}

    @Override
    public void push(E item) {
        // TODO Auto-generated method stub
        data.add(item);
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        if(!isEmpty()){
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
    	return(data.size() <= 0);
    }
    
    
}
    
