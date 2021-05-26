/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 *
 * @author RanggaDelpiero UB
 */
public class Data {
    
    static ArrayList<Mahasiswa> mhs = new ArrayList<>();
    static ArrayList<Dosen> dsn = new ArrayList<>();
    
    public static void initMahasiswa(){
        String dirPath = "folderData";
        //Inialisasi file
        File dirFile = new File(dirPath);
        //Mengecek direktori file
        if (!Files.exists(Paths.get(dirPath))) {
            dirFile.mkdir(); //Membuat direktori jika direktori tidak ditemukan
        }
        
        //Membuat File
        File fileMhs = new File("folderData/databaseMahasiswa.txt");
        boolean ada = fileMhs.exists();
        //Mengecek file
        if (!ada) {
            try{
                fileMhs.createNewFile(); //Membuat file jika file tidak ditemukan
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        
        //Membaca file perbaris
        try{
            File baris = new File("folderData/databaseMahasiswa.txt");
            Scanner scan = new Scanner(baris);
            while (scan.hasNextLine()) {
                pecahMhs(scan.nextLine());
            } 
        } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
        }
    }
    
    public static void pecahMhs(String dataMahasiswa){
        System.out.println(dataMahasiswa.length());
        String[] PecahMhs = dataMahasiswa.split("_");
        mhs.add(new Mahasiswa(PecahMhs[0], PecahMhs[1], PecahMhs[2], PecahMhs[3]));
    }
    
    public static void simpanMhs(){
        try {
            FileWriter dataMahasiswa = new FileWriter("folderData/databaseMahasiswa.txt");
            for (int i = 0; i < mhs.size(); i++) {
                dataMahasiswa.write(mhs.get(i).getNim() + "_" +
                mhs.get(i).getNama() + "_" + 
                mhs.get(i).getProdi() + "_" + 
                mhs.get(i).getFakultas()
                );
                dataMahasiswa.write(System.getProperty("line.separator"));
            }
            dataMahasiswa.flush();
            dataMahasiswa.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void initDosen(){
        String dirPath = "folderData";
        //Inialisasi file
        File dirFile = new File(dirPath);
        //Mengecek direktori file
        if (!Files.exists(Paths.get(dirPath))) {
            dirFile.mkdir(); //Membuat direktori jika direktori tidak ditemukan
        }
        
        //Membuat File
        File fileDsn = new File("folderData/databaseDosen.txt");
        //Mengecek file
        boolean ada = fileDsn.exists();
        if (!ada) {
            try{
                fileDsn.createNewFile(); //Membuat file jika file tidak ditemukan
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        
        //Membaca file perbaris
        try{
            File baris = new File("folderData/databaseDosen.txt");
            Scanner scan = new Scanner(baris);
            while (scan.hasNextLine()) {
                pecahDsn(scan.nextLine());
            } 
        } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
        }
    }
    
    public static void pecahDsn(String dataDosen){
        System.out.println(dataDosen.length());
        String[] PecahDsn = dataDosen.split("_");
        dsn.add(new Dosen(PecahDsn[0], PecahDsn[1], PecahDsn[2], PecahDsn[3]));
    }
    
    public static void simpanDsn(){
        try {
            FileWriter dataDosen = new FileWriter("folderData/databaseDosen.txt");
            for (int i = 0; i < dsn.size(); i++) {
                dataDosen.write(dsn.get(i).getNip() + "_" +
                dsn.get(i).getNama() + "_" + 
                dsn.get(i).getProdi() + "_" + 
                dsn.get(i).getFakultas()
                );
                dataDosen.write(System.getProperty("line.separator"));
            }
            dataDosen.flush();
            dataDosen.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
