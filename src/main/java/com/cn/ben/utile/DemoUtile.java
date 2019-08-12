package com.cn.ben.utile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther: ljh
 * @Date: 2019/8/8 11:07
 * @Description:
 */
public class DemoUtile {
    public static final File FILE = new File("E:\\JinFengIDeaFile\\dzfile\\src\\main\\java\\com\\cn\\ben\\a.log");

    //读取文件
    public String NumberOf()  {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("E:\\JinFengIDeaFile\\dzfile\\src\\main\\java\\com\\cn\\ben\\sd.log"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        return new MatrxCreate().demoStat(map);
    }

    public boolean rowWriteFile(String ben){
        try {
//            Files.lines(Paths.get("E:\\JinFengIDeaFile\\dzfile\\src\\main\\java\\com\\cn\\ben\\a.log"), StandardCharsets.UTF_8).forEach(System.out::println);
            File FILE = new File("E:\\JinFengIDeaFile\\dzfile\\src\\main\\java\\com\\cn\\ben\\a.csv");
            FileOutputStream fos = new FileOutputStream(FILE);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos,"utf-8"));
            writer.write(ben);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
//        new DemoUtile().rowWriteFile(new DemoUtile().NumberOf());;
    }
}
