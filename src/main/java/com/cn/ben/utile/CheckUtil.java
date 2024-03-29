package com.cn.ben.utile;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * @Auther: ljh
 * @Date: 2019/10/23 22:44
 * @Description:
 */
public class CheckUtil {
    public static final String token="weixin"; //这个记住
    public static boolean checkSignature(String signature,String timestamp,String nonce) {
        //根据微信的规则验证 是否接入成功
        String[] arr=new String[] {token, timestamp,nonce};
        Arrays.sort(arr);
        StringBuffer content= new StringBuffer();
        for(int i=0;i<arr.length;i++) {
            content.append(arr[i]);
        }
        String temp=getSha1(content.toString());//加密
        return temp.equals(signature);
    }


    public static String getSha1(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' };

        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));

            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (Exception e) {
            return null;
        }
    }

}