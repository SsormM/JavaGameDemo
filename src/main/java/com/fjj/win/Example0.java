package main.java.com.fjj.win;

import javax.swing.*;
import java.awt.Container;

public class Example0 extends JFrame {

    public Example0() {
        //���ô������,Ҳ����д��super("Hello Java");����ʽ
        setTitle("Hello Java");

        MyPanel myPanel = new MyPanel();

        Container contentPane = getContentPane();
        //�����Զ�������[MyPanel]�������У��ͺñ��ڵװ�������һ�㻭�档

        //Ҳ����˵��ʾʲô���ݣ��������Ǽ����Ǹ��������������ģ���������

        //��ʵ����Ϸ�в�ͬ�������л���
        contentPane.add(myPanel);

        //�Զ����ϴ���
        pack();
    }

    public static void main(String[] args) {
        Example0 example0 = new Example0();

        //�����ܹر�[�¼�]
        example0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //��ʾ���壨PS:��Java�б���show()���������ѳ�Ϊ׼��̭������

        //˵����ʲôʱ��㲻֧���ˣ�ǿ�Ҳ�����ʹ�ã���ȻVisible�ڲ�

        //Ŀǰ���ǵ���������

        example0.setVisible(true);
    }
}
