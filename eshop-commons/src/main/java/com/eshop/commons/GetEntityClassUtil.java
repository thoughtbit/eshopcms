package com.eshop.commons;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GetEntityClassUtil {
	public static Class getEntityClass(Class c) {
		Type type = c.getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			Type[] ptype = ((ParameterizedType) type).getActualTypeArguments();
			return (Class) ptype[0];
		} else {
			return Object.class;
		}
	}
}
