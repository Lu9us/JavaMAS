/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import masproject.Agents.DataProcessor;
import masproject.Agents.Message;
import masproject.Agents.MetaAgent;

/**
 *
<<<<<<< HEAD
 * @author n3148087
=======
 * @author N3148087
>>>>>>> 49ba9b612417082bccfaf508a12a95471d29878a
 */
public class GuiProcessor extends DataProcessor
{

    MASGui gui;

    /**
     *
     * @param agent
     * @param gui
     */
    public GuiProcessor(MetaAgent agent, MASGui gui)
    {
        super(agent);
        this.gui = gui;
    }

    /**
     * Processes the message by converting it into a string and displaying it
     * onto the GUI
     *
     * @param msg
     */
    @Override
    public void processMsg(Message msg)
    {
        String newMsg = msg.toString();
        gui.outputBox.setText(gui.outputBox.getText() + "\n" + newMsg);
    }

}
