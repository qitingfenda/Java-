package com.sicheng.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest01 {

	public static void main(String[] args) {
		// 窗口类
		Frame frame = new Frame();
		
		// 设置窗口的大小
		// frame.setSize(500, 400);
		
		// 定义窗口在屏幕出现的位置
		// frame.setLocation(400,200);
		
		// 定义窗口位置和大小
		frame.setBounds(400,200, 500, 400);
		
		// 设置布局--流式布局
		frame.setLayout(new FlowLayout());
		
		// 创建按钮
		Button button = new Button("按钮");
				
		// 将按钮添加到窗体中
		frame.add(button);
		
		// 添加关闭窗口监听事件
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("close..." + e);
				System.exit(0);
			}
		});
		
		// 在按钮上加上一个监听
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button run...");
				System.exit(0);
			}
		});
		
		
		
		
		
		
		
		
		// 显示窗口
		frame.setVisible(true);
		
		System.out.println("over");
	}
	
}
