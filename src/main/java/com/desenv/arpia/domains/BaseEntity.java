package com.desenv.arpia.domains;

import java.io.Serializable;

public interface BaseEntity<T>  extends Serializable{
	
	public T getId();
	public void setId(T o);
}
