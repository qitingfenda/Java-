package com.sicheng.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKeyTest01 {

	private Frame f;
	
	private TextField tf;
	
	private Button but;
		
	public MouseAndKeyTest01() {
		f = new Frame();
		
		f.setBounds(400, 200, 500, 400);
		
		f.setLayout(new FlowLayout());
		
		tf = new TextField(15);
		
		f.add(tf);
		
		but = new Button("按钮");
		
		f.add(but);
		
		myEvent();
		
		f.setVisible(true);
		
	}
	
	private void myEvent() {
		// 给文本框添加键盘监听
		tf.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				// System.out.println("key run..."+"\n"+e);
				// System.out.println(e.getKeyChar()+":"+e.getKeyCode());
				// System.out.println(KeyEvent.getKeyText(e.getKeyCode()));
				// System.out.println(e.getKeyCode());
				
				int code = e.getKeyCode();
				System.out.println(code);
				if(!(code >= KeyEvent.VK_0 && code <= KeyEvent.VK_9)) {
					System.out.println("必须是数字！");
					e.consume();
				}
				
				if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.println("enter..");
				}
				
			}
			
		});
		
		
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("action run...");
				
			}
		});
		
		// 在按钮上添加一个鼠标监听
		but.addMouseListener(new MouseAdapter() {
			private int count = 0;
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouse enter..."+(++count));
				tf.setText("" + count);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e);
				if(e.getClickCount() == 2) {
					tf.setText("双击");
				}
			}
			
		});
				
	}

	public static void main(String[] args) {
		new MouseAndKeyTest01();
	}
	
}
