package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author avinash.a.mishra
 */
public class ImplementTail {

    public static void main(String[] args) throws IOException {
        String path = "C:/SERVER_FILES/KMM";
        File folder = new File(path);
        List<String> list = new ArrayList<>();
        if (folder != null && folder.isDirectory() && folder.listFiles() != null) {
            for (File file : folder.listFiles()) {
                if (file.exists() && file.isFile()) {
                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        if (br != null) {
                            String line;
                            while (true) {
                                line = br.readLine();
                                if(line!=null) {
                                    list.add(line);
                                }
                            }

                        }
                    }
                }

            }
        }
    }

}
