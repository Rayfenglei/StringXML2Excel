package com.ray.example.stringxml2excel;

import com.ray.example.stringxml2excel.bean.XlsWriteBean;
import com.ray.example.stringxml2excel.method.WriteXlsManager;

import java.io.File;


public class WriteXmlToXls {
	private static String VALUE_PATH = "String2Xls";  //value文件夹 可以放string和array
	private static String XLS_NAME = "Strings.xlsx"; //目标文件
	private static String ROOT_PATH; // 路径

	public static void main(String[] args) {
		File file = new File("");
		ROOT_PATH = file.getAbsolutePath(); //工程路径
		XlsWriteBean bean = new XlsWriteBean.Builder()
				.setRootPath(ROOT_PATH)
				.setFileFloderName(VALUE_PATH)
				.setXlsName(XLS_NAME)
				.builder();
		WriteXlsManager.getInstance().startWrite(bean.getBuilder());
		System.out.println("在 "+ROOT_PATH+File.separator+VALUE_PATH+"生成文件: "+XLS_NAME);
	}


}	
