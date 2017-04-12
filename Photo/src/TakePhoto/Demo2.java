package TakePhoto;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Demo2 {
	
	public static void main(String[] args) throws AWTException, IOException {
		
		Robot r = new Robot();
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle area = new Rectangle(d);
		
		BufferedImage photo = r.createScreenCapture(area);
		
		ImageIO.write(photo, "png", new File("d:desktop.png"));
	}
}
