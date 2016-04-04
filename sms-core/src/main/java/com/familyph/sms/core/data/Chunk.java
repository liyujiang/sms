package com.familyph.sms.core.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.springframework.util.Assert;

abstract class Chunk<T> implements Slice<T> {
	
	private final List<T> content = new ArrayList<T>();
	private final Pageable pageable;


	public Chunk(List<T> content, Pageable pageable) {

		Assert.notNull(content, "Content must not be null!");

		this.content.addAll(content);
		this.pageable = pageable;
	}


	public int getNumber() {
		return pageable == null ? 0 : pageable.getPageNumber();
	}


	public int getSize() {
		return pageable == null ? 0 : pageable.getPageSize();
	}


	public int getNumberOfElements() {
		return content.size();
	}


	public boolean hasPrevious() {
		return getNumber() > 0;
	}


	public boolean hasContent() {
		return !content.isEmpty();
	}


	public List<T> getContent() {
		return Collections.unmodifiableList(content);
	}

	public Sort getSort() {
		return pageable == null ? null : pageable.getSort();
	}


	public Iterator<T> iterator() {
		return content.iterator();
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Chunk<?>)) {
			return false;
		}

		Chunk<?> that = (Chunk<?>) obj;

		boolean contentEqual = this.content.equals(that.content);
		boolean pageableEqual = this.pageable == null ? that.pageable == null : this.pageable.equals(that.pageable);

		return contentEqual && pageableEqual;
	}

}
