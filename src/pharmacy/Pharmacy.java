/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.awt.Font;
import javax.swing.UIManager;

/**
 *
 * @author varsh
 */
public class Pharmacy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }
        catch(Exception e){
            System.out.println(e);
        }
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 18));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 12));
        new LoginScreen().setVisible(true);
    }
    
}
