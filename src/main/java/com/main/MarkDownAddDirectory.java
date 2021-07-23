package com.main;

import com.main.impl.DirectoryImpl;
import com.main.impl.FileSteamImpl;

import java.util.ArrayList;

public class MarkDownAddDirectory {
    public boolean markDownAddDirectory(String url){
        FileStream fileStream = new FileSteamImpl();
        Directory directory = new DirectoryImpl();
        ArrayList page= fileStream.ReadMarkdown(url);
        ArrayList str = directory.setDirectory(directory.getTitle(page));
        str.add("");
        str.addAll(page);
        return fileStream.WriterMarkdown(url, str);
    }
}
