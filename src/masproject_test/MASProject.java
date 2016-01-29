/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masproject_test;

import gui.MASGui;
import javax.swing.JFrame;

/**
 *
 * @author n3148087
 */
public class MASProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Portal p = new Portal("portal");
//        p.start();
//        Portal p2 = new Portal("portal2");
//        p2.start();
//
//        UserAgent a = new UserAgent("a", null, p);
//        a.setProc(new testDp(a));
//        UserAgent b = new UserAgent("b", null, p2);
//        b.setProc(new testDp(b));
//        Message msg = new Message();
//        msg.setSender("b");
//        msg.setReceiver("a");
//        msg.setMsg("testing testing");
//        p.addPortal(p2);
//        p2.addPortal(p);
//        a.start();
//        b.start();
//        b.sendMessage(msg);
        
        MASGui newWindow = new MASGui();
        newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newWindow.pack();
        newWindow.setVisible(true);
    }

}
