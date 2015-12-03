/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanagementlab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jbrown99
 */
public interface FileWriterStrategy {
    
    public abstract void setFilePath(String filePath);
    public abstract void setFormat(TextFormatStrategy txtFormat);
    
    public abstract void writeFile(List<String> data,boolean append)throws IOException;
}
