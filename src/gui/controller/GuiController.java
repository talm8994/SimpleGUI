package gui.controller;

import gui.view.GuiFrame;

public class GuiController
{
	/**
	 * Referance to GUIFrame object of the view
	 */
	private GuiFrame baseFrame;
	
	
	public GuiController()
	{
		baseFrame = new GuiFrame(this);
	}
	
	public void start()
	{
		
	}

}
