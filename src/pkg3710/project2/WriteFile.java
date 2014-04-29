/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package pkg3710.project2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author greyson233
 */
public class WriteFile {
    private String path;
    //append_to_file is set to false, so anything in file will be erased
    private boolean append_to_file=false;
    
    //use this constructor to just overwrite a text file
    public WriteFile(String file_path){
        path = file_path;
    }
    
    //use this constructor to append to a text file
    public WriteFile(String file_path, boolean append_value){
        path = file_path;
        append_to_file = append_value;
    }
    
    //to write to the file
    public void writeToFile( String textLine ) throws IOException {
        FileWriter write = new FileWriter( path , append_to_file);
        PrintWriter print_line = new PrintWriter( write );
        
        print_line.printf( "%s" + "%n" , textLine);
        
        print_line.close();
    }
}
