import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
public class Main extends Canvas 
{
	public static int[] pixelLocationsX;
	public static int[] pixelLocationsY;

	public static byte selectedTile;

  public static int cursorX;
  public static int cursorY;

	private MouseAdapter ma;

  static Toolkit toolkit;

	public void paint(Graphics g) 
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

		Main m=new Main();  
    JFrame f=new JFrame();  
    f.add(m);  
    f.setSize(250,250);  
    f.setVisible(true); 

    Point cursorPoint = MouseInfo.getPointerInfo().getLocation();
    
	}

  private static void cursorLocation(Point cursorPoint)
  {
    cursorPoint = MouseInfo.getPointerInfo().getLocation();
    cursorX = cursorPoint.x;
    cursorY = cursorPoint.y;
    //Note: blue bar is part of window. bottom of blue bar, y=25. top of frame, y=0
  }

	public static void onClick(MouseEvent e)
	{
		//System.out.println(cursorPoint);
	}

}