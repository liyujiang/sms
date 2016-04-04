package com.familyph.sms.core.data;

import java.util.List;

public interface Slice<T> {

	int getNumber();


	int getSize();


	int getNumberOfElements();


	List<T> getContent();	
	
	Sort getSort();
	
	
	boolean hasContent();
	
	
	boolean hasPrevious();
}
