package com.familyph.sms.core.data;

public interface Pageable {

	int getPageNumber();

	int getPageSize();

	int getOffset();
	
	Sort getSort();

	
}
