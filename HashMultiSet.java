package pobj.tme4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMultiSet<T> implements MultiSet<T>{
	private HashMap<T,Integer> map;
	private int size=0;
	
	
	public HashMultiSet(){
	}
	
	public HashMultiSet(Collection<T> collec){ //    /!_!\ don't forget
		map=new HashMap<>();
		
		for(T v:collec){
			add(v);
		}
	}
	
	@Override
	public boolean add(T e, int count) {
		this.map.put(e,(count+this.count(e)));
		size=size+count;// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public boolean add(T e) {
		return add(e,1);
		// TODO Auto-generated method stub
	}
	
	@Override
	public boolean remove(Object e) {
		return remove(e,1);
	}
	
	
	@Override
	public boolean remove(Object e, int count) {
		
		
		
		if (count>this.count((T)e)){
			map.remove((T)e);		
			return true;
		}
		this.map.put((T)e,this.count((T)e)-count);
		return true;
	}
	
	@Override
	public int count(T o) {
		Integer i=map.get(o);
		if(i==null){
			return 0;
		}
		return i;
	
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
