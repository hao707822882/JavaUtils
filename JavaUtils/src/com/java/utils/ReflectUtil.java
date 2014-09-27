package com.java.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射工具
 * 
 * @author Mr.Zheng
 * @date 2014年9月27日 下午11:33:47
 */
public class ReflectUtil
{
	/**
	 * 测试(调用)私有方法
	 * 
	 * @param classInstance
	 * @param methodName
	 * @param paramTypes
	 * @param args
	 */
	public static Object invoke(Class<?> clz, String methodName, Class<?>[] paramTypes, Object[] args)
	{
		try
		{
			Method method = clz.getDeclaredMethod(methodName, paramTypes);
			method.setAccessible(true);
			try
			{
				return method.invoke(clz, args);
			} catch (IllegalArgumentException e)
			{
				e.printStackTrace();
			} catch (IllegalAccessException e)
			{
				e.printStackTrace();
			} catch (InvocationTargetException e)
			{
				e.printStackTrace();
			}
		} catch (SecurityException e)
		{
			e.printStackTrace();
		} catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
