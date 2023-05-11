import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;

import javax.swing.JFrame;

public class MainWindow extends Canvas 
{
	public static int[] pixelLocationsX;
	public static int[] pixelLocationsY;

	public static byte selectedTile;

  public static int cursorX;
  public static int cursorY;

  public static Image nodeImg;

  static Toolkit toolkit;

  Graphics2D graphics;

  public MainWindow(){
	addMouseListener(new MouseAdapter() { 
		public void mousePressed(MouseEvent me) { 
		 cursorX = me.getX();
		 cursorY = me.getY();
		 DrawNode();
		} 
	}); 
  }

	public void paint(Graphics g) 
	{  
		Graphics2D graphic2d = (Graphics2D) g;
		graphics = graphic2d;
	}  

	public void DrawNode(){
		Graphics g = nodeImg.getGraphics();
		g.drawImage(nodeImg, cursorX, cursorY, 24, 24, getBackground(), null);
		System.out.println("h");
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
		
		try{
			nodeImg = ImageIO.read(new File("src/main/Img/Node.png"));
		} catch (IOException e){}
		

		if(toolkit == null)
		{
			toolkit = Toolkit.getDefaultToolkit();
		}

		
	}
}