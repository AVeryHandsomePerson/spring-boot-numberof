package com.cn.ben.utile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Auther: ljh
 * @Date: 2019/8/8 11:07
 * @Description:
 */
public class DemoUtile {
    //读取文件
    public String NumberOf() throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("E:\\JinFengIDeaFile\\dzfile\\src\\main\\java\\com\\cn\\ben\\sd.log"), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        for(String line : lines){
            sb.append(line).append(",");
        }
        List<String> list =new ArrayList<>();
        String [] str  =sb.toString().split(",");
        for (int i = 0; i < str.length-1; i++) {
            list.add("("+str[i]+","+str[i+1]+")");
        }
      Map<String,Long> map =  list.stream().flatMap(line -> Arrays.stream(line.split(" ")))
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        ListStat.demoStat(map);

        return super.toString();
    }

    public static void main(String[] args) throws IOException {
        new DemoUtile().NumberOf();
    }
}
