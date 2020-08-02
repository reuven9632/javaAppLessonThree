package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //крестики нолики
        X_O ixith_and_ziros = new X_O();











        //Работа с потоками данных (Threads)













        /*//Запись и чтение данных из файлов (Java io)

        BufferedReader test_buffered_reader = null;                                                  //переменная типпа BufferedReader создаю пустой(null)
        try {
            File test_file = new File("New_Test_File.txt");                                 //создание переменнтой file типа File, передаем в конструктор имя файла или каталога

            PrintWriter test_print_writer = new PrintWriter(test_file);                              //создание переменнтой test_print_writer типа PrintWriter, передаем в конструктор имя файла или каталога
            test_print_writer.println("Hi, we are created new file");                                //имя переменной от PrintWriter.println("даннные которые вводяться в строку файла");
            test_print_writer.println("test_created of String");
            test_print_writer.close();                                                               //всегда нужно закрывать файл после его использования
            if (!test_file.exists()) {                                                               //exists() от библиотеки import java.io.File;  проверяет что файл создан
                test_file.createNewFile();                                                           //createNewFile() создает новый файл по пути, который передан в конструктор
            }
            test_buffered_reader = new BufferedReader(new FileReader("New_Test_File.txt"));
            String line;
            while ((line = test_buffered_reader.readLine()) != null) {                              //создал строку line в которую буду записывать строки из файла .readLine() пока не будет строка равна пустоте т.е. файл закончился != null
                System.out.println(line);

            }
        } catch(IOException e){                                                                     //IOException e подчеркиваеться красным в двух случаях: если не добавили import java.io.IOException;
                                                                                                    //или проверка по мнению компилятора базсмысленна, но если добавить создание файла то проверка на ошибку его создания приобретает смысл и ошибка исчезает
            System.out.println("Error is : " + e);
        } finally {
            try {
                test_buffered_reader.close();
            }   catch (IOException e) {
                System.out.println("Error :" + e);
            }
        }*/

    }
}
