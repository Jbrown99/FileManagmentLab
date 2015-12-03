/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanagementlab;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jbrown99
 */
public interface TextFormatStrategy {
    
  public abstract List<String> encode (List<String> data);  
  
  public abstract ArrayList decode(List<String> data);
    
    
    
}
