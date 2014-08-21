package com.java.utils.test;

import java.io.IOException;

import com.java.utils.MD5Util;

public class Test
{
	public static void main(String[] args) throws IOException
	{
		String imageUrl = "http://img.my.csdn.net/uploads/201309/01/1378037235_7476.jpg";

		System.out.println(MD5Util.getMD5String(imageUrl));
	}
	
}
