package edu.pragmatic.lecture8.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionGenerics {
	
	private Collection nongeneric ; 
	
	private Collection<String> generic ;

	public CollectionGenerics() {
		this.nongeneric = new ArrayList<>();
		this.generic = new ArrayList<>();
		
	}
	
	public static void main(String[] args) {
		CollectionGenerics _this = new CollectionGenerics();
		_this.nongeneric.add(3D);
		_this.nongeneric.add("String");
		_this.nongeneric.add( new int[] {4, 6, 8});
		
		
		_this.generic.add("first");
		_this.generic.add("second");
		_this.generic.add("third");
		
		Iterator<?> nonGenericIterator = _this.nongeneric.iterator();
		
		while(nonGenericIterator.hasNext()){
			Object o = nonGenericIterator.next();
			if (o instanceof String) {
				System.out.println(((String)o).length());
			}
			if (o instanceof int[]){
				System.out.println(((int[])o).length);
			}
		}
		
		for(String str : _this.generic){
			System.out.println(str.length());
		}
		
		
	}
	
}
