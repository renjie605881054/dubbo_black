package com.core.base;

import java.util.List;

public interface BaseMapper<T> {

	List <T> getList(T entity);
}
