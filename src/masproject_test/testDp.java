/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masproject_test;

import masproject.Agents.Message;
import masproject.Agents.MetaAgent;

/**
 *
 * @author n3148087
 */
public class testDp extends masproject.Agents.DataProcessor {

    int recived = 0;

    /**
     *
     * @param agent
     */
    public testDp(MetaAgent agent) {
        super(agent);
    }

    /**
     *
     * @param msg
     */
    @Override
    public void processMsg(Message msg) {
        System.out.println("agent: " + agent.getName() + " message: " + msg.getMsg() + " reciver: " + msg.getReceiver() + " sender: " + msg.getSender());
        recived++;
        if (recived < 7) {
            Message masg = new Message();
            masg.setSender(agent.getName());
            masg.setMsg(msg.getMsg());
            masg.setReceiver(msg.getSender());
            agent.sendMessage(masg);

        }
    }

}
