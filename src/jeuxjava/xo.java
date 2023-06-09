package jeuxjava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class xo extends JFrame {
	String nextPlayer;
	String over;
	JPanel pan1;
	JPanel pan2;
	JPanel pan3;
	JPanel pan4;
	JPanel pan5;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b13;
	Image img1;
	Image imgmod1;

	ArrayList <String> xlist;
	ArrayList <String> olist;
	xo()
	{
		setSize(700,700);
		setTitle("xo");
		xlist=new ArrayList();
		olist=new ArrayList();
		over="";
		img1= Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\YM.jpg");
		imgmod1=img1.getScaledInstance(30,30, Image.SCALE_SMOOTH);
		this.setIconImage(imgmod1);
		pan1=new JPanel(new GridLayout(3,3));
		pan2=new JPanel(new GridLayout(3,1));
		pan3=new JPanel();
		pan4=new JPanel();
		pan5=new JPanel();
		b1=new JButton("");
		b2=new JButton("");
		b3=new JButton("");
		b4=new JButton("");
		b5=new JButton("");
		b6=new JButton("");
		b7=new JButton("");
		b8=new JButton("");
		b9=new JButton("");
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		pan1.add(b1);
		pan1.add(b2);
		pan1.add(b3);
		pan1.add(b4);
		pan1.add(b5);
		pan1.add(b6);
		pan1.add(b7);
		pan1.add(b8);
		pan1.add(b9);
		l1=new JLabel("Result :");
		l2=new JLabel("----------");
		l3=new JLabel("who will start:");
		b10=new JButton("x");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				nextPlayer="x";
				l2.setText(" x will start");
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				b10.setEnabled(false);
				b11.setEnabled(false);
			}
		});
		b11=new JButton("o");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				nextPlayer="o";
				l2.setText("o will start");
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				b10.setEnabled(false);
				b11.setEnabled(false);
			}
		});
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				if(nextPlayer=="x")
				{
				b1.setText("x");
				b1.setEnabled(false);
				b1.setForeground(Color.GREEN);
				xlist.add("1,1");
			
				System.out.println("xlist"+xlist);
				if(xlist.size()>=3)
				{
				
				if (xlist.contains("1,1") && xlist.contains("2,1") && xlist.contains("3,1"))
				{l2.setText(" x won"); over="over"; System.out.println("1;1");
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("1,1") && xlist.contains("2,2") && xlist.contains("3,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				
				if(olist.contains("1,1") && xlist.contains("1,2") && xlist.contains("1,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				}
				nextPlayer="o";
				}
				else
				{System.out.println("olist"+olist);
				b1.setForeground(Color.RED);
				b1.setText("o");
				b1.setEnabled(false);
				olist.add("1,1");
				System.out.println("olist"+olist);
				System.out.println("xlist"+xlist);
				if(olist.size()>=3)
				{
				if (olist.contains("1,1") && olist.contains("2,1") && olist.contains("3,1"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("1,1") && olist.contains("2,2") && olist.contains("3,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				
				if(olist.contains("1,1") && olist.contains("1,2") && olist.contains("1,3"))
					{l2.setText(" o won"); over="over";
					b1.setEnabled(false);
					b2.setEnabled(false);
					b3.setEnabled(false);
					b4.setEnabled(false);
					b5.setEnabled(false);
					b6.setEnabled(false);
					b7.setEnabled(false);
					b8.setEnabled(false);
					b9.setEnabled(false);
					confirmery();}
				}
				nextPlayer="x";
				}
				if(over=="")
				
				l2.setText("next player is "+nextPlayer);
				if(over=="" && xlist.size()+olist.size()==9) {l2.setText("tie");}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				if(nextPlayer=="x")
				{
				b2.setForeground(Color.GREEN);
				b2.setText("x");
				b2.setEnabled(false);
				xlist.add("2,1");
				System.out.println("xlist"+xlist);
				if(xlist.size()>=3)
				{
				if (xlist.contains("1,1") && xlist.contains("2,1") && xlist.contains("3,1"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("2,1") && xlist.contains("2,2") && xlist.contains("2,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				}
				nextPlayer="o";
				}
				else
				{
				b2.setForeground(Color.RED);
				b2.setText("o");
				b2.setEnabled(false);
				olist.add("2,1");
				System.out.println("olist"+olist);
				
				if(olist.size()>=3)
				{
				if (olist.contains("1,1") && olist.contains("2,1") && olist.contains("3,1"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("2,1") && olist.contains("2,2") && olist.contains("2,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				}
				nextPlayer="x";
				}
				if(over=="")
				{
				l2.setText("next player is :"+nextPlayer);
				}
				if(over=="" && xlist.size()+olist.size()==9) {l2.setText("tie");
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				}
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			
				if(nextPlayer=="x")
				{b3.setForeground(Color.GREEN);
				b3.setText("x");
				b3.setEnabled(false);
				xlist.add("3,1");
				System.out.println("xlist"+xlist);
				if(xlist.size()>=3)
				{
				if (xlist.contains("1,1") && xlist.contains("2,1") && xlist.contains("3,1"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("3,1") && xlist.contains("3,2") && xlist.contains("3,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("3,1") && xlist.contains("2,2") && xlist.contains("1,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}

				}
				nextPlayer="o";
				}
				else
				{b3.setForeground(Color.RED);
				b3.setText("o");
				b3.setEnabled(false);
				olist.add("3,1");
				System.out.println("olist"+olist);
				if(olist.size()>=3)
				{
				if (olist.contains("1,1") && olist.contains("2,1") && olist.contains("3,1"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("3,1") && olist.contains("3,2") && olist.contains("3,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("3,1") && olist.contains("2,2") && olist.contains("1,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				}
				nextPlayer="x";
				}
				if(over=="")
				
				l2.setText("next player is :"+nextPlayer);
				if(over=="" && xlist.size()+olist.size()==9) {l2.setText("tie");}
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				if(nextPlayer=="x")
				{b4.setForeground(Color.GREEN);
				b4.setText("x");
				b4.setEnabled(false);
				xlist.add("1,2");
				System.out.println("xlist"+xlist);
				if(xlist.size()>=3)
				{
				if (xlist.contains("1,1") && xlist.contains("1,2") && xlist.contains("1,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("1,2") && xlist.contains("2,2") && xlist.contains("3,2"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				}
				nextPlayer="o";
				}
				else
				{b4.setForeground(Color.RED);
				b4.setText("o");
				b4.setEnabled(false);
				olist.add("1,2");
				System.out.println("olist"+olist);
				if(olist.size()>=3)
				{
				if (olist.contains("1,1") && olist.contains("1,2") && olist.contains("1,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("1,2") && olist.contains("2,2") && olist.contains("3,2"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				}
				nextPlayer="x";
				}
				if(over=="")
				{
				l2.setText("next player is :"+nextPlayer);
				}
				if(over=="" && xlist.size()+olist.size()==9) {l2.setText("tie");}
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				if(nextPlayer=="x")
				{b5.setForeground(Color.GREEN);
				b5.setText("x");
				b5.setEnabled(false);
				xlist.add("2,2");
				System.out.println("xlist"+xlist);
				if(xlist.size()>=3)
				{
				if (xlist.contains("1,1") && xlist.contains("2,2") && xlist.contains("3,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("2,1") && xlist.contains("2,2") && xlist.contains("2,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("1,2") && xlist.contains("2,2") && xlist.contains("3,2"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				}
				nextPlayer="o";
				}
				else
				{b5.setForeground(Color.RED);
				b5.setText("o");
				b5.setEnabled(false);
				olist.add("2,2");
				System.out.println("olist"+olist);
				if(olist.size()>=3)
				{
				if (olist.contains("1,1") && olist.contains("2,2") && olist.contains("3,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("2,1") && olist.contains("2,2") && olist.contains("2,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("1,2") && olist.contains("2,2") && olist.contains("3,2"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				}
				nextPlayer="x";
				}
				if(over=="")
				
				l2.setText("next player is :"+nextPlayer);
				if(over=="" && xlist.size()+olist.size()==9) {l2.setText("tie");}
				
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				if(nextPlayer=="x")
				{b6.setForeground(Color.GREEN);
				b6.setText("x");
				b6.setEnabled(false);
				xlist.add("3,2");
				System.out.println("xlist"+xlist);
				if(xlist.size()>=3)
				{
				if (xlist.contains("3,1") && xlist.contains("3,2") && xlist.contains("3,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("1,2") && xlist.contains("2,2") && xlist.contains("2,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				}
				nextPlayer="o";
				}
				else
				{b6.setForeground(Color.RED);
				b6.setText("o");
				b6.setEnabled(false);
				olist.add("3,2");
				System.out.println("olist"+olist);
				if(olist.size()>=3)
				{
				if (olist.contains("3,1") && olist.contains("3,2") && olist.contains("3,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("1,2") && olist.contains("2,2") && olist.contains("2,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				}
				nextPlayer="x";
				}
				
				if(over=="")
				l2.setText("next player is :"+nextPlayer);
				if(over=="" && xlist.size()+olist.size()==9) {l2.setText("tie");}
			}
		});

		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				if(nextPlayer=="x")
				{b9.setForeground(Color.GREEN);
				b7.setText("x");
				b7.setEnabled(false);
				xlist.add("1,3");
				System.out.println("xlist"+xlist);
				if(xlist.size()>=3)
				{
				if (xlist.contains("1,1") && xlist.contains("1,2") && xlist.contains("1,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("1,3") && xlist.contains("2,2") && xlist.contains("3,1"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				
				if(xlist.contains("1,3") && xlist.contains("2,3") && xlist.contains("3,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				}
				nextPlayer="o";
				}
				else
				{b7.setForeground(Color.RED);
				b7.setText("o");
				b7.setEnabled(false);
				olist.add("1,3");
				System.out.println("olist"+olist);
				if(olist.size()>=3)
				{
				if (olist.contains("1,1") && olist.contains("1,2") && olist.contains("1,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("1,3") && olist.contains("2,2") && olist.contains("3,1"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("1,3") && olist.contains("2,3") && olist.contains("3,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				}
				nextPlayer="x";
				}
				if(over=="")
				{
				l2.setText("next player is :"+nextPlayer);
				}
				if(over=="" && xlist.size()+olist.size()==9) {l2.setText("tie");}
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(nextPlayer=="x")
				{b8.setForeground(Color.GREEN);
				b8.setText("x");
				b8.setEnabled(false);
				xlist.add("2,3");
				System.out.println("xlist"+xlist);
				if(xlist.size()>=3)
				{
				if (xlist.contains("2,1") && xlist.contains("2,2") && xlist.contains("2,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("2,3") && xlist.contains("1,3") && xlist.contains("3,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				}
				nextPlayer="o";
				}
				else
				{b8.setText("o");
				b8.setForeground(Color.RED);
				b8.setEnabled(false);
				olist.add("2,3");
				System.out.println("olist"+olist);
				if(olist.size()>=3)
				{
				if (olist.contains("2,1") && olist.contains("2,2") && olist.contains("2,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("2,3") && olist.contains("1,3") && olist.contains("3,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				}
				nextPlayer="x";
				}
				if(over=="")
				{
				l2.setText("next player is :"+nextPlayer);
				}
				if(over=="" && xlist.size()+olist.size()==9) {l2.setText("tie");}
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			
				if(nextPlayer=="x")
				{b9.setForeground(Color.GREEN);
				b9.setText("x");
				b9.setEnabled(false);
				xlist.add("3,3");
				System.out.println("xlist"+xlist);
				if(xlist.size()>=3)
				{
				if (xlist.contains("3,1") && xlist.contains("3,2") && xlist.contains("3,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("1,3") && xlist.contains("2,3") && xlist.contains("3,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				if(xlist.contains("1,1") && xlist.contains("2,2") && xlist.contains("3,3"))
				{l2.setText(" x won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmerx();}
				}
				nextPlayer="o";
				}
				else
				{b9.setForeground(Color.RED);
				b9.setText("o");
				b9.setEnabled(false);
				olist.add("3,3");
				System.out.println("olist"+olist);
				if(olist.size()>=3)
				{
				if (olist.contains("3,1") && olist.contains("3,2") && olist.contains("3,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("1,3") && olist.contains("2,3") && olist.contains("3,3"))
				{l2.setText(" o won"); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				if(olist.contains("1,1") && olist.contains("2,2") && olist.contains("3,3"))
				{l2.setText(" o won "); over="over";
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				confirmery();}
				}
				nextPlayer="x";
				}
				if(over=="")
				{
				l2.setText("next player is :"+nextPlayer);
				}
				if(over=="" && xlist.size()+olist.size()==9) {l2.setText("tie");}
			}
			
		});
		
		b12=new JButton("exit");
		b12.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		dispose();
	}
		});
		b13=new JButton("restart");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				b1.setText("");
				b2.setText("");
				b3.setText("");;
				b4.setText("");
				b5.setText("");
				b6.setText("");
				b7.setText("");
				b8.setText("");
				b9.setText("");
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				nextPlayer="";
				xlist.clear();
				olist.clear();
				b10.setEnabled(true);
				b11.setEnabled(true);
				l2.setText("----------");
			}
		});
		b1.setFont(new Font("Sans-serif",Font.BOLD,80));
		b2.setFont(new Font("Sans-serif",Font.BOLD,80));
		b3.setFont(new Font("Sans-serif",Font.BOLD,80));
		b4.setFont(new Font("Sans-serif",Font.BOLD,80));
		b5.setFont(new Font("Sans-serif",Font.BOLD,80));
		b6.setFont(new Font("Sans-serif",Font.BOLD,80));
		b7.setFont(new Font("Sans-serif",Font.BOLD,80));
		b8.setFont(new Font("Sans-serif",Font.BOLD,80));
		b9.setFont(new Font("Sans-serif",Font.BOLD,80));
		pan3.add(l1);
		pan3.add(l2);
		pan4.add(l3);
		pan4.add(b10);
		pan4.add(b11);
		pan5.add(b12);
		pan5.add(b13);
		pan2.add(pan3);
		pan2.add(pan4);
		pan2.add(pan5);
		add(pan1,BorderLayout.CENTER);
		add(pan2,BorderLayout.EAST);
		setVisible(true);
	}
	public void confirmerx()
	{
		 JOptionPane.showMessageDialog(this,"Perfect\nx is the winner ","winner",JOptionPane.DEFAULT_OPTION);

	}
	public void confirmery()
	{
		 JOptionPane.showMessageDialog(this,"Perfect\no is the winner ","winner",JOptionPane.DEFAULT_OPTION);

	}
}

