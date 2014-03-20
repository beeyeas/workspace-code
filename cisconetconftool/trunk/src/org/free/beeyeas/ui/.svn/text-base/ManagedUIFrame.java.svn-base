package org.free.beeyeas.ui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

import org.free.beeyeas.cisco.n1kv.CustomN1KV;

public class ManagedUIFrame {
	private static JFrame frame ;
	private static CustomN1KV customN1KV = new CustomN1KV();
	public ManagedUIFrame() {
	}

	public static void main(String args[]){
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				prepareUI();
			}
		});
	}
	
	private static void prepareUI(){
		if (frame==null){
			frame = new JFrame("Cisco Nexus Command Utility - by beeyeas@gmail.com");
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			frame.setPreferredSize(new Dimension((int)dim.getWidth() /2 , (int)dim.getHeight() /2));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		ManagedUIPanel panel = new ManagedUIPanel(customN1KV);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}
}
