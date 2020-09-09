package com.ray.example.stringxml2excel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ray.example.stringxml2excel.bean.XlsWriteBean;
import com.ray.example.stringxml2excel.method.WriteXlsManager;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static String VALUE_PATH = "Test";  //value文件夹存放的名字
    private static String XLS_NAME = "test.xlsx"; //要生成xls的名字
    private static String ROOT_PATH; // 当前路径


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File file = new File("");
        ROOT_PATH = file.getAbsolutePath();
        XlsWriteBean bean = new XlsWriteBean.Builder()
                .setRootPath(ROOT_PATH)
                .setFileFloderName(VALUE_PATH)
                .setXlsName(XLS_NAME)
                .builder();
        WriteXlsManager.getInstance().startWrite(bean.getBuilder());
        System.out.println("在 "+ROOT_PATH+File.separator+VALUE_PATH+"生成文件啦!!");

    }
}