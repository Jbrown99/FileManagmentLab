/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanagementlab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jbrown99
 */
public class TextFileReader implements FileReaderStrategy {
    
    private TextFormatStrategy formatter;
    

    @Override
    public ArrayList readFile(String filePath) {
        
        File file = new File(filePath);
        
       
        List<String> data = new ArrayList<String>();
        
         BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(file));
	   String line = in.readLine();
	   while(line != null){
               
		  data.add(line + "\n");
		  line = in.readLine();  // strips out any carriage return chars
                  
                  
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
        
        return formatter.decode(data);
                
    }

    @Override
    public void setFormat(TextFormatStrategy txtFormat) {
        this.formatter = txtFormat;
    }

    
    
    
     
     
    
    
}
    
    
    
    
}
