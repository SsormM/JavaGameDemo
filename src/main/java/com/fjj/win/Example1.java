package main.java.com.fjj.win;

import javax.swing.*;
import java.awt.*;

public class Example1 extends JFrame {
    public Example1(){
        //Ĭ�ϴ�������
        setTitle("Example1[Java��Ϸ�е�ͼ�����]");

        //��������Զ�������[��ͼ���]��ʵ��
        MyPanel myPanel = new MyPanel();
        Container contentPane = getContentPane();
        contentPane.add(myPanel);

        pack();
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        //�趨������رղ���
        example1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        example1.setVisible(true);
    }
}
