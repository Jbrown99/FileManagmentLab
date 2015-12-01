/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanagementlab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author jbrown99
 */
public class TextFileWriter implements FileWriterStrategy {
    
    private TextFormatStrategy formatter;
    
    private String file;

    @Override
    public void setFilePath(String file) {
        this.file = file;
        
    }

    @Override
    public void writeFile(ArrayList data, boolean append)throws IOException {
        
        File theFile = new File(file);
        
        PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new FileWriter(theFile, append)));
        
        formatter.passInText(theFile);
        out.close();
        
        
        
    }
    
    
    
    
    
    
}
