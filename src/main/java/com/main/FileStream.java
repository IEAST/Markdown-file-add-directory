package com.main;

import java.util.ArrayList;

public interface FileStream {
    //写回添加目录后的arraylist到指定路径
    boolean WriterMarkdown(String url, ArrayList<String> str);

    //根据指定路径读取markdown文件并转成ArrayList
    ArrayList<String> ReadMarkdown(String url);
}
