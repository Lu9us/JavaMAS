/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masproject_test;

import masproject.Agents.Message;
import masproject.Agents.Portal;
import masproject.Agents.UserAgent;

/**
 *
 * @author Admin
 */
public class ResTestAgent extends UserAgent
{
  
    public ResTestAgent(String name, Portal portal) {
        super(name, portal);
        
    }
   
    @Override
     public void processMsg(Message msg)
    {
     if(msg.getMsg().equals("count"))
     {
     for(int i=0;i<10;i++)
     {
     this.sendMessage(msg.getSender(),Integer.toString(i));
     }
     
     
     }
        
        
    }

    
}
