package com.cn.ben.utile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @Auther: ljh
 * @Date: 2019/8/8 11:07
 * @Description:
 */
public class DemoUtile {
    //读取文件
    public String NumberOf() throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\dell\\.ssh\\id_rsa.pub"), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        for(String line : lines){
            sb.append(line);
        }
        String fromFile = sb.toString();
        System.out.println(fromFile);
        return super.toString();
    }

    public static void main(String[] args) throws IOException {
        new DemoUtile().NumberOf();
    }
}
