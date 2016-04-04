package com.familyph.sms.core.data;

public interface Page<T> extends Slice<T> {

	int getTotalPages();

	long getTotalElements();
}