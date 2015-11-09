package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;
/**
 * 
 * @author talm8994
 *
 */
public class GuiFrame extends JFrame
{

	private GuiController baseController;
	private GuiPanel basePanel;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController;
		basePanel = new GuiPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setTitle("dezz nuts");
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(400,400);
		this.setVisible(true);
	}
}
