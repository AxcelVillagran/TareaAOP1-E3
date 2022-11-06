package com.singleton;

import java.util.Hashtable;

public abstract aspect SingletonAOP {

	private Hashtable singletonsTarea=new Hashtable();
	public interface SingletonAnonima {}
	
	pointcut success(): call( (SingletonAnonima+).new(..) );
	Object around(): success(){
		Class singletonEjemplo = thisJoinPoint.getSignature( ).getDeclaringType( );
		if(singletonsTarea.get(singletonEjemplo)==null) {
			singletonsTarea.put(singletonEjemplo, proceed( ));
		}
		
		return (Object)singletonsTarea.get(singletonEjemplo);
	}
	
}
