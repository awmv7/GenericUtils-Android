package com.xxx.xxx;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SystemPropertiesUtils {
    public static String get(String key) {
        try {
  			Class<?> SystemProperties = Class.forName("android.os.SystemProperties");
  			Method get = SystemProperties.getDeclaredMethod("get", String.class);
  			Object obj = get.invoke(SystemProperties, key);
  			return (String) obj;
  		} catch (ClassNotFoundException e) {
  			e.printStackTrace();
  		} catch (NoSuchMethodException e) {
  			e.printStackTrace();
  		} catch (IllegalAccessException e) {
  			e.printStackTrace();
  		} catch (IllegalArgumentException e) {
  			e.printStackTrace();
  		} catch (InvocationTargetException e) {
  			e.printStackTrace();
  		}
  		return null;
	}

	public static String get(String key, String def) {
		try {
			Class<?> SystemProperties = Class.forName("android.os.SystemProperties");
			Method get = SystemProperties.getDeclaredMethod("get", String.class, String.class);
			Object obj = get.invoke(SystemProperties, key, def);
			return (String) obj;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void set(String key, String value) {
		try {
			Class<?> SystemProperties = Class.forName("android.os.SystemProperties");
			Method set = SystemProperties.getDeclaredMethod("set", String.class, String.class);
			Object obj = set.invoke(SystemProperties, key, value);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	public static boolean getBoolean(String key, boolean def) {
		try {
			Class<?> SystemProperties = Class.forName("android.os.SystemProperties");
			Method get = SystemProperties.getDeclaredMethod("getBoolean", String.class, boolean.class);
			Object obj = get.invoke(SystemProperties, key, def);
			return (boolean) obj;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return false;
	}
}
