package com.main.impl;

import com.main.FileStream;

import java.io.*;
import java.util.ArrayList;

public class FileSteamImpl implements FileStream {

    @Override
    public ArrayList<String> ReadMarkdown(String url) {
        ArrayList<String> stringArrayList=new ArrayList<>();
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(url));
            while (bufferedReader.ready()){
                stringArrayList.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringArrayList;
    }


    @Override
    public boolean WriterMarkdown(String url,ArrayList<String> str) {
        try {
            FileWriter fileWriter=new FileWriter(url,false);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (String s : str) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }


}
