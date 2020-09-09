package com.ray.example.stringxml2excel.bean;

import java.util.List;

public class CusRow {
	public String key;
	public String value;
	public boolean isArray;
	public List<String> items;
	@Override
	public String toString() {
		return "CusRow [key=" + key + ", value=" + value + ", isArray="
				+ isArray + ", items=" + items + "]";
	}
	
	
}
