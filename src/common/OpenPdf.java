/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.io.File;
import javax.swing.JOptionPane;
import dao.PharmacyUtils;
/**
 *
 * @author Kartikesh Ambavade
 */
public class OpenPdf {
    public static void openById(String id) {
        try {
            if((new File(PharmacyUtils.billPath+id+".pdf")).exists())
            {
                Process p = Runtime
                        .getRuntime()
                        .exec("rund1132 url.dll,FileProtocolHandler " +PharmacyUtils.billPath+""+id+".pdf");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
