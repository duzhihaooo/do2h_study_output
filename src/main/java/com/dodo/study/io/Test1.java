package com.dodo.study.io;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        try {
            byte[] by = {1,3,5,7};
            OutputStream outputStream = new FileOutputStream("test.txt");
            for (int x=0;x<by.length;x++){
                outputStream.write(by[x]);
            }
            outputStream.close();

            InputStream in = new FileInputStream("test.txt");
            int size = in.available();

            for (int x=0;x<size;x++){
                System.out.print(in.read()+" ");
            }
            in.close();



        } catch (IOException e){
            System.out.println("Exception");
        }
    }
}
