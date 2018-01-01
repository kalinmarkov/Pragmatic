package edu.pragmatic.genericsandcollections.examples.generics;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericCatalog<T extends CharSequence> {
	
	
	private List<? extends T> catalog = new ArrayList<>();
  
	public void add(T element) {
	//	catalog.add(element);
	}
	
	public T get(int index) {
		return catalog.get(index);
	}
		
	@SuppressWarnings("unchecked")
	public T[] toArray(Class<?> c) {
		T[] result = (T[]) Array.newInstance(c, catalog.size());
		result = catalog.toArray(result);
		return result;
	}
	
	
}
