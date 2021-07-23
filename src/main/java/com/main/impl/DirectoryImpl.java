package com.main.impl;

import com.main.Directory;

import java.util.ArrayList;

public class DirectoryImpl implements Directory {

    @Override
    public ArrayList<String> getTitle(ArrayList<String> strings) {
        ArrayList<String > titles=new ArrayList<>();
        for (String string : strings) {
            //通过判断是否以#开头来确实是否为标题
            if (string.startsWith("#")) {
                titles.add(string);
            }
        }
        return titles;
    }

    @Override
    public ArrayList<String> setDirectory(ArrayList<String> strings) {
        ArrayList<String > directory=new ArrayList<>();
        for (String string : strings) {
            // 通过string.indexOf查找标题中的第一个空格,同时将其进行截取,对题目中存在的空格采用-进行替换
            String s = TitleToDirectory(string.indexOf(' '), string.substring(string.indexOf(' ') + 1), string.substring(string.indexOf(' ') + 1).replace(' ', '-'));
            directory.add(s);
        }
        return directory;
    }

    // 拼接链接及列表格式化
    private String TitleToDirectory(int num, String s1, String s2){
        String str ="";
        for(int i=1;i<num;i++){
            str += "  ";
        }
        return  str+"- ["+s1+"](#"+s2+')';
    }
}
