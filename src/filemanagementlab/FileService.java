/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanagementlab;

/**
 *
 * @author jbrown99
 */
public class FileService {
    
    private TextFileReader read;
    private TextFileWriter write;

    public FileService(TextFileReader read, TextFileWriter write) {
        this.read = read;
        this.write = write;
    }
    
    
    
    
}
