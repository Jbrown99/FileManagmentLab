/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanagementlab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jbrown99
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileService service = new FileService(new TextFileReader(
                new XmlFormat()),new TextFileWriter(new XmlFormat()));
        
        
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("bannanas");
        
        
        service.setFilePath();
        service.writeToFile(list,false);
        service.
        
    }
    
    
    
}
