package cn.cfg.java.DBinterfaceTest;


import java.awt.*;
import javax.swing.*;
public class ScreenTest extends JFrame{
	public  ScreenTest()  throws HeadlessException{
		this.setTitle("cal");
		this.setSize(300,300);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args){
		ScreenTest sct = new ScreenTest();
		sct.setVisible(true);
		
	}
	
}
