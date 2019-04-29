package com.bupt.server;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.net.*;
import java.io.*;

public class Frame extends JFrame implements ActionListener{
	
	JLabel menuLb=new JLabel("菜单");
	JButton startBt=new JButton("开始游戏");
	JButton rankBt=new JButton("排行榜");
	JButton helpBt=new JButton("帮助");
	JPanel panel=new JPanel();
	
	public Frame() {
		initialFrame();
	}
	
	public void initialFrame() {
		
		this.setBounds(50,50,960,720);
		
		panel.setLayout(null);
		menuLb.setBounds(150, 0, 100, 50);
		menuLb.setFont(new Font(null,20,20));
		panel.add(menuLb);
		startBt.setBounds(this.getWidth()/2-40, 20, 80, 40);
		panel.add(startBt);
		rankBt.setBounds(this.getWidth()/2-40, 60, 80, 40);
		panel.add(rankBt);
		helpBt.setBounds(this.getWidth()/2-40, 100, 80, 40);
		panel.add(helpBt);
		
		this.setTitle("java网络编程");
		this.add(panel);
		
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		new Frame();
	}
	
}
