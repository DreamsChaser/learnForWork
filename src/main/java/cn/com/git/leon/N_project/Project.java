package cn.com.git.leon.N_project;

import java.io.File;
import java.util.stream.Collectors;

/**
 * @author sirius
 * @since 2019/5/14
 */
public class Project {

    private static int count = 0;

    public static void main(String[] args) {
        String str = "D:\\workspace\\learnForWork\\src\\main\\java\\cn\\com\\git\\leon";
        File file = new File(str);
//        test(file);
        countFiles(file);
        System.out.println(count);
    }

    public static void test(File in){
        if (in.isDirectory()){
            File[] files = in.listFiles();
            if (files == null || files.length == 0){
                return;
            }
            for (File file : files){
                if (file.isDirectory()){
                    test(file);
                } else {
                    String fileName = file.getName();
                    String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
                    if ("java".equals(suffix)){
                        String absFileName = file.getAbsolutePath();
                        file.renameTo(new File(absFileName.replace(".java",".txt")));
                    }else if ("txt".equals(suffix)){
                        continue;
                    }else if ("png".equals(suffix)){
                        continue;
                    }else {
                        String absFileName = file.getAbsolutePath();
                        file.renameTo(new File(absFileName.concat(".txt")));
                    }
                }
            }
        }
    }

    public static void countFiles(File in){
        if (in.isDirectory()){
            File[] files = in.listFiles();
            if (files == null || files.length == 0){
                return;
            }
            for (File file : files){
                countFiles(file);
            }
        } else {
            count++;
        }
    }
}
