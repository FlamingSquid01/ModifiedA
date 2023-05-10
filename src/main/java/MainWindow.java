import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MainWindow extends Canvas 
{
	public static int[] pixelLocationsX;
	public static int[] pixelLocationsY;

	public static byte selectedTile;

  public static int cursorX;
  public static int cursorY;

  static Toolkit toolkit;

  public MainWindow(){
	addMouseListener(new MouseAdapter() { 
		public void mousePressed(MouseEvent me) { 
		 System.out.println(me); 
		} 
	}); 
  }

	public void paintInit(Graphics g) 
	{  
		if(toolkit == null)
		{
			toolkit = Toolkit.getDefaultToolkit();
		}
	}  

	public static void main(String[] args)
	{
		pixelLocationsX = new int[8];
		pixelLocationsY = new int[8];

		MainWindow m=new MainWindow();  
    	JFrame f=new JFrame();  
    	f.add(m);  
    	f.setSize(1000,1000);  
    	f.setVisible(true); 

		if(toolkit == null)
		{
			toolkit = Toolkit.getDefaultToolkit();
		}

		
	}

    private static Point cursorLocation()
    {
      return MouseInfo.getPointerInfo().getLocation();
    }

}