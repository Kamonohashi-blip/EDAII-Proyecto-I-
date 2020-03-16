package proyecto;

import java.util.*;
import java.io.*;
/**
 *
 * @author david
 */
public class Archivo {
    public File file;
    
    public Archivo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo:");
        String fileName = sc.next();
        fileName = fileName + ".txt";
        try{
            file = new File(fileName);
            if(file.createNewFile()){
                System.out.println("Archivo creado: " + file.getName());
            }
            else{
                System.out.println("Archivo no creado: El archivo ya existe.");
            }
        }
        catch(IOException exc){
                System.out.println("Ocurrió un error.");
        }
    }
    
    public void Write(String data){
        try{
            FileWriter writer = new FileWriter(file.getName());
            writer.write(data);
            writer.close();
        }
        catch(IOException exc){
            System.out.println("Ocurrió un error.");
        }
    }
    
    public String[] Read(){
        try{
            Scanner counterScan = new Scanner(file);
            int counter = 0;
            while(counterScan.hasNextLine()){
                counterScan.nextLine();
                counter += 1;
            }
            String[] output = new String[counter];
            Scanner reader = new Scanner(file);
            int index = 0;
            while(reader.hasNextLine()){
               output[index] = reader.nextLine();
               index++;
               return output;
           }
        }
        catch(FileNotFoundException exc){
            System.out.println("Error: archivo no encontrado.");
        }
            String[] output = null;
            return output;
    }
    
    public static String[] ReadFile(String fileName){
        if(fileName.substring(fileName.length() - 4,fileName.length()).equals(".txt") == false){
            fileName += ".txt";
        }
        try{
            File file = new File(fileName);
            Scanner counterScan = new Scanner(file);
            int counter = 0;
            while(counterScan.hasNextLine()){
                counterScan.nextLine();
                counter += 1;
            }
            String[] output = new String[counter];
            Scanner reader = new Scanner(file);
            int index = 0;
            while(reader.hasNextLine()){
               output[index] = reader.nextLine();
               index++;
               return output;
           }
        }
        catch(FileNotFoundException exc){
            System.out.println("Error: archivo no encontrado.");
        }
            String[] output = null;
            return output;
    }
    
    public void Delete(){
        if(file.delete()) System.out.println("Archivo eliminado: " + file.getName());
        
        else System.out.println("Error: no se pudo eliminar el archivo.");
    }
}
