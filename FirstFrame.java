import java.awt.Color;
import javax.swing.*;

class FirstFrame{
	public static void main(String args[]){
		
		//JFrame <- is class of swing lib(class)
		
		
		JFrame jf = new JFrame();
		//jf <- is object which we create og JFrame class

		//must this function to show frame
		jf.setVisible(true);

		//direct close 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//set size of frame
		//jf.setSize(770,500);

		//set frame location		
		//jf.setLocation(200,50);


		//if you don't wanna use two different function setSize and setLocation then

		//use it when -> setBounds()
		//prameters - > 1 Location-left=100,right100, 
		//2 -> framesize - width=1000, height=500
		jf.setBounds(100,100, 1000,500);

		//how to set JFrame Title
		jf.setTitle("Myfirst JFrame");

		//setIcon on JFrame = logo [ImageIcon is a class]
		ImageIcon logo = new ImageIcon("img/catoonme1.png");

		//setIconImage method -> pass object
		jf.setIconImage(logo.getImage());//getImage is another method of Imageicon for converting object in image
		
		//setbackgroun JFrame
		jf.getContentPane().setBackground(Color.BLUE);
		
		//risize the window		//true = resize,  false = no resize
		jf.setResizable(false);           

	}
}