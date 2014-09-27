package com.java.utils.test;

import java.io.File;
import java.io.IOException;

import com.java.utils.MD5Util;

public class Test
{
	public static void main(String[] args) throws IOException
	{
		System.out.println(MD5Util.getFileMD5String(new File("D:\\AndroidIDE\\.android\\debug.keystore")));
	}

}
