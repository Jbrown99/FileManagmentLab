/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanagementlab;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author jbrown99
 */
public interface FileReaderStrategy {
    

    
 public abstract ArrayList readFile(String filePath);
 
 public abstract void setFormat(TextFormatStrategy txtFormat);
 
 
    
}
