package com.familyph.sms.core.data;

public abstract class AbstractPageRequest implements Pageable{

	private final int page;
	private final int size;
	
	public AbstractPageRequest(int page, int size) {

		if (page < 0) {
			throw new IllegalArgumentException("Page index must not be less than zero!");
		}

		if (size < 1) {
			throw new IllegalArgumentException("Page size must not be less than one!");
		}

		this.page = page;
		this.size = size;
	}
	

	public int getPageSize() {
		return size;
	}


	public int getPageNumber() {
		return page;
	}

	public int getOffset() {
		return page * size;
	}
}                           