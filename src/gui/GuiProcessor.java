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
 * @author N3148087
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
