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
		// ������
		Frame frame = new Frame();
		
		// ���ô��ڵĴ�С
		// frame.setSize(500, 400);
		
		// ���崰������Ļ���ֵ�λ��
		// frame.setLocation(400,200);
		
		// ���崰��λ�úʹ�С
		frame.setBounds(400,200, 500, 400);
		
		// ���ò���--��ʽ����
		frame.setLayout(new FlowLayout());
		
		// ������ť
		Button button = new Button("��ť");
				
		// ����ť��ӵ�������
		frame.add(button);
		
		// ��ӹرմ��ڼ����¼�
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("close..." + e);
				System.exit(0);
			}
		});
		
		// �ڰ�ť�ϼ���һ������
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button run...");
				System.exit(0);
			}
		});
		
		
		
		
		
		
		
		
		// ��ʾ����
		frame.setVisible(true);
		
		System.out.println("over");
	}
	
}
