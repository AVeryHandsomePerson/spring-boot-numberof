package com.cn.ben.utile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther: ljh
 * @Date: 2019/8/8 11:07
 * @Description:
 */
public class DemoUtile {
    //读取文件
    public String NumberOf(String path)  {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
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
            if(str[i].contains("|")){
                list.add("("+str[i].split("\\|")[0]+","+str[i].split("\\|")[1]+")");
                if(!str[i+1].contains("|")){
                    list.add("("+str[i].split("\\|")[1]+","+str[i+1]+")");
                }
                if(str[i+1].contains("|")){
                    list.add("("+str[i].split("\\|")[1]+","+str[i+1].split("\\|")[0]+")");
                }
            }else if(str[i+1].contains("|")){
                list.add("("+str[i]+","+str[i+1].split("\\|")[0]+")");
                list.add("("+str[i+1].split("\\|")[0]+","+str[i+1].split("\\|")[1]+")");
            }else{
                list.add("("+str[i]+","+str[i+1]+")");
            }

        }
        System.out.println(list);
      Map<String,Long> map =  list.stream().flatMap(line -> Arrays.stream(line.split(" ")))
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        return new MatrxCreate().demoStat(map);
    }

    public boolean rowWriteFile(String path,String ben){
        try { File file = new File(path);
            FileOutputStream fos = new FileOutputStream(file);
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
        System.out.println(new DemoUtile().NumberOf("D:\\个人测试\\无标题1.txt"));
//       List<String> lines = null;
//        try {
//            lines =    Files.readAllLines(Paths.get("D:\\金烽信息科技\\智能判障需求\\规则库\\1.txt"), StandardCharsets.UTF_8);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        StringBuilder sb = new StringBuilder();
//        for(String line : lines){
//            String[] str = line.split("\t");
//            String ben = str[4]
//                    .replace("下行PRB平均占用率（%）","prb_dl_usage_rate")
//                    .replace("PDCCH信道占用率（%）","pdcch_usage_rate")
//                    .replace("上行PRB平均占用率（%）","prb_ul_usage_rate")
//                    .replace("RRC连接建立成功率（%）","rrc_conn_rate")
//                    .replace("RRC连接重建比例（%）","rrc_reset_rate")
//                    .replace("RRC最大连接用户数","rrc_conn_num_max")
//                    .replace("平均RRC连接用户数","avg_rrc_con_user")
//                    .replace("UE上下文掉线率（%）","ue_context_drop_rate")
//                    .replace("E－RAB掉线率（%）","erab_est_drop_rate")
//                    .replace("用户面下行包平均时延（毫秒/包）","user_plane_dl_packet_avg_delay")
//                    .replace("eNodeB内切换成功率（%）","enb_intra_ho_succ_rate")
//                    .replace("X2接口切换成功率（%）","x2_ho_rate")
//                    .replace("下行PRB双流占比","dl_prb_dul_rate")
//                    .replace("RSRP大于等于－105的比例","rsrp_higer_105")
//                    .replace("平均噪声","rssi_noice_avg")
//                    .replace("平均接入距离","distance_avg")
//                    .replace("E－RAB建立成功率（%）","erab_est_rate")
//                    .replace("CQI≥7比例","cqi_higher7_rate")
//                    .replace("最大激活用户数","max_act_user")
//                    .replace("平均激活用户数","avg_act_user")
//                    .replace("and","&&")
//                    ;
//            System.out.println(str[0]+"\t"+str[1]+"\t"+str[2]+"\t"+str[3]+"\t"+ben+"\t"+str[4]);
//        }
//        System.out.println(sb);
    }
}
