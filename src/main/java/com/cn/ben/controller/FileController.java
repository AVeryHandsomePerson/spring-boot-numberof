package com.cn.ben.controller;
import com.cn.ben.utile.DemoUtile;
import com.cn.ben.utile.FileUtile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Auther: ljh
 * @Date: 2019/8/6 17:14
 * @Description:
 */
@RestController
public class FileController {
    private static final Logger log = LoggerFactory.getLogger(FileController.class);

    @RequestMapping(value = "/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        return new FileUtile().fileUploading(file);
    }
    @RequestMapping("/download")
    public String  generatedMtrix(String readPath,String outPath){
        DemoUtile du = new DemoUtile();
        String matrx= du.NumberOf(readPath);
       boolean fileBole = du.rowWriteFile(outPath,matrx);
        if(fileBole) {
            return matrx;
        }
        return "下载失败 请联系管理员！！！";
    }
}

//    HttpServletRequest request,
//    @GetMapping("/download")
//    public String downloadFile(HttpServletResponse response) throws IOException {
//       return new FileUtile().download(response,"a.scv","/home/demo/input");
//    }
//    @PostMapping("/batch")
//    public String handleFileUpload(HttpServletRequest request) {
//        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
//        MultipartFile file = null;
//        BufferedOutputStream stream = null;
//        for (int i = 0; i < files.size(); ++i) {
//            file = files.get(i);
//            String filePath = "/Users/dalaoyang/Downloads/";
//            if (!file.isEmpty()) {
//                try {
//                    byte[] bytes = file.getBytes();
//                    stream = new BufferedOutputStream(new FileOutputStream(
//                            new File(filePath + file.getOriginalFilename())));//设置文件路径及名字
//                    stream.write(bytes);// 写入
//                    stream.close();
//                } catch (Exception e) {
//                    stream = null;
//                    return "第 " + i + " 个文件上传失败 ==> "
//                            + e.getMessage();
//                }
//            } else {
//                return "第 " + i
//                        + " 个文件上传失败因为文件为空";
//            }
//        }
//        return "上传成功";
//    }