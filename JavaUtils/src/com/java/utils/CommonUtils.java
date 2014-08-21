package com.java.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CommonUtils
{
	/**
	 * InputStream转换成字符串
	 * 
	 * @param is
	 * @return
	 */
	public static String IS2Str(InputStream is)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String content = "";
		String line;
		try
		{
			line = br.readLine();
			while (line != null)
			{
				content += line + "\n";
				line = br.readLine();
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		return content;
	}
	/**
	 * 字符串转换为InputStream
	 * @param str
	 * @return
	 */
	public static InputStream Str2IS(String str)
	{
		return new ByteArrayInputStream(str.getBytes());
	}
	
}
