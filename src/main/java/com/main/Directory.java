package com.main;

import java.util.ArrayList;

public interface Directory {
    // 通过arraylist读取里面所有的标题
    ArrayList<String> getTitle(ArrayList<String> strings);
    // 将读取到的标题进行转变为链接列表
    ArrayList<String> setDirectory(ArrayList<String> strings);
}
