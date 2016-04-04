package com.familyph.sms.core.data;

import com.familyph.sms.core.data.Sort.Direction;

public class PageRequest extends AbstractPageRequest{

	private final Sort sort;
	
	public PageRequest(int page, int size) {
		this(page, size, null);
	}
	
	public PageRequest(int page, int size, Direction direction, String properties) {
		this(page, size, new Sort(direction, properties));
	}
	
	public PageRequest(int page, int size, Sort sort) {
		super(page, size);
		this.sort = sort;
	}	
	
	public Sort getSort() {
		return sort;
	}
	
	@Override
	public String toString() {
		return String.format("Page request [number: %d, size %d, sort: %s]", getPageNumber(), getPageSize(),
				sort == null ? null : sort.toString());
	}

}
