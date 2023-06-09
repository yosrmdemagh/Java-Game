package jeuxjava;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
public class Memorisationl3 extends JFrame{
	int ok;
	int time;
	JPanel pan1;
	JPanel pan2;
	JPanel pan3;
	JPanel pan4;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b13;
	JButton b14;
	JButton b15;
	JButton b16;
	JButton b17;
	JButton b18;
	JButton b19;
	JLabel l1;
	JLabel l2;
	JLabel lchrono;
	JLabel ltemps;
	Random r;
	Integer listpos[];
	int i;
	int pos;
	Image img1;
	Image img2;
	Image img3;
	Image img4;
	Image img5;
	Image img6;
	Image img7;
	Image img8;
	Image imgmod1;
	Image imgmod2;
	Image imgmod3;
	Image imgmod4;
	Image imgmod5;
	Image imgmod6;
	Image imgmod7;
	Image imgmod8;
	ImageIcon imgmodf1;
	ImageIcon imgmodf2;
	ImageIcon imgmodf3;
	ImageIcon imgmodf4;
	ImageIcon imgmodf5;
	ImageIcon imgmodf6;
	ImageIcon imgmodf7;
	ArrayList <String> tabcorr0;
	ArrayList <String> tabcorr1;
	ArrayList <String> tabcorr2;
	ArrayList <String> tabcorr3;
	ArrayList <String> tabcorr4;
	ArrayList <String> tabcorr5;
	ArrayList <String> tabcorr6;
	
	ArrayList <String> intermediaire;
	int trouve;
	Memorisationl3()
		{
		time=0;
		ok=0;
		trouve=0;
		lchrono=new JLabel("time remaining:");
		ltemps=new JLabel("64 second");
		intermediaire=new ArrayList();
		tabcorr0=new ArrayList();
		tabcorr1=new ArrayList();
		tabcorr2=new ArrayList();
		tabcorr3=new ArrayList();
		tabcorr4=new ArrayList();
		tabcorr5=new ArrayList();
		tabcorr6=new ArrayList();
		listpos= new Integer[16];
		setSize(700,700);
		setTitle("Memorisation level 3");
		pan1=new JPanel(new GridLayout(4,4));
		pan2=new JPanel(new GridLayout(5,1));
		pan3=new JPanel();
		pan4=new JPanel();
		l1=new JLabel("result :");
		l2=new JLabel("-------------------------");
		b1=new JButton();
		b2=new JButton();
		b3=new JButton();
		b4=new JButton();
		b5=new JButton();
		b6=new JButton();
		b7=new JButton();
		b8=new JButton();
		b9=new JButton();
		b10=new JButton();
		b11=new JButton();
		b12=new JButton();
		b13=new JButton();
		b14=new JButton();
		b15=new JButton();
		b16=new JButton();
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		b10.setEnabled(false);
		b11.setEnabled(false);
		b12.setEnabled(false);
		b13.setEnabled(false);
		b14.setEnabled(false);
		b15.setEnabled(false);
		b16.setEnabled(false);
		b17=new JButton("start");
		b18= new JButton("exit");
		b19= new JButton("next");
		b19.setVisible(false);
		img1= Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\fleur.png");
		img2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\voiture_bleuepng.png");
		img3 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\pomme_img.png");
		img4 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\maisonpng.png");
		img5 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\doll2.png");
		img6 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\icecream1.png");
		img7 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\bomb.png");
		img8 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\YM.jpg");
		imgmod1=img1.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
	    imgmod2=img2.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
	    imgmod3=img3.getScaledInstance(110, 110, Image.SCALE_SMOOTH);
	    imgmod4=img4.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
	    imgmod5=img5.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
	    imgmod6=img6.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
	    imgmod7=img7.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
	    imgmod8=img8.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	    imgmodf1 =new ImageIcon(imgmod1);
	    imgmodf2 =new ImageIcon(imgmod2);
	    imgmodf3 =new ImageIcon(imgmod3);
	    imgmodf4 =new ImageIcon(imgmod4);
	    imgmodf5 =new ImageIcon(imgmod5);
	    imgmodf6 =new ImageIcon(imgmod6);
	    imgmodf7 =new ImageIcon(imgmod7);
	    this.setIconImage(imgmod8);
	    r=new Random();
	  
	    for (i=0;i<16;i++)System.out.println(listpos[i]+"/");
	    ///0 positions :
	    for (i=0;i<2;i++)
	    {
	    pos=r.nextInt(16);	
	    if(listpos[pos]!=null) {
	    	while(listpos[pos]!=null)pos=r.nextInt(16);
	    }
	    listpos[pos]=0;
	    }
	    /// 1 positions :
	    for (i=0;i<2;i++)
	    {
	    pos=r.nextInt(16);	
	    if(listpos[pos]!=null) {
	    	while(listpos[pos]!=null)pos=r.nextInt(16);
	    }
	    listpos[pos]=1;
	    }
	    /// 2 positions :
	    for (i=0;i<2;i++)
	    {
	    pos=r.nextInt(16);	
	    if(listpos[pos]!=null) {
	    	while(listpos[pos]!=null)pos=r.nextInt(16);
	    }
	    listpos[pos]=2;
	    }
	    /// 3 positions:
	    for (i=0;i<2;i++)
	    {
	    pos=r.nextInt(16);	
	    if(listpos[pos]!=null) {
	    	while(listpos[pos]!=null)pos=r.nextInt(16);
	    }
	    listpos[pos]=3;
	    }
	    /// 4 positions:
	    for (i=0;i<2;i++)
	    {
	    pos=r.nextInt(16);	
	    if(listpos[pos]!=null) {
	    	while(listpos[pos]!=null)pos=r.nextInt(16);
	    }
	    listpos[pos]=4;
	    }
	    /// 5 positions:
	    for (i=0;i<2;i++)
	    {
	    pos=r.nextInt(16);	
	    if(listpos[pos]!=null) {
	    	while(listpos[pos]!=null)pos=r.nextInt(16);
	    }
	    listpos[pos]=5;
	    }
	    /// 6 positions:
	    for (i=0;i<16;i++)
	    	if(listpos[i]==null) {listpos[i]=6;}
	    		
	    
	    System.out.println("apres");
	    for (i=0;i<16;i++) System.out.println(listpos[i]+"/");
	
	  b17.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
	 	{
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
			b10.setEnabled(true);
			b11.setEnabled(true);
			b12.setEnabled(true);
			b13.setEnabled(true);
			b14.setEnabled(true);
			b15.setEnabled(true);
			b16.setEnabled(true);
		 	for (i=0;i<16;i++) {
	    	if(i==0) 
	    	{
	    		if(listpos[i]==0) {b1.setIcon(imgmodf1);tabcorr0.add("1,1");}
	    		else if(listpos[i]==1) {b1.setIcon(imgmodf2);tabcorr1.add("1,1");}
	    		else if(listpos[i]==2) {b1.setIcon(imgmodf3);tabcorr2.add("1,1");}
	    		else if(listpos[i]==3) {b1.setIcon(imgmodf4);tabcorr3.add("1,1");}
	    		else if(listpos[i]==4) {b1.setIcon(imgmodf5);tabcorr4.add("1,1");}
	    		else if(listpos[i]==5) {b1.setIcon(imgmodf6);tabcorr5.add("1,1");}
	    		else {b1.setIcon(imgmodf7);tabcorr6.add("1,1");}
	    	}
	    	else if(i==1)
	    	{
	    		if(listpos[i]==0) {b2.setIcon(imgmodf1);tabcorr0.add("2,1");}
	    		else if(listpos[i]==1) {b2.setIcon(imgmodf2);tabcorr1.add("2,1");}
	    		else if(listpos[i]==2) {b2.setIcon(imgmodf3);tabcorr2.add("2,1");}
	    		else if(listpos[i]==3) {b2.setIcon(imgmodf4);tabcorr3.add("2,1");}
	    		else if(listpos[i]==4) {b2.setIcon(imgmodf5);tabcorr4.add("2,1");}
	    		else if(listpos[i]==5) {b2.setIcon(imgmodf6);tabcorr5.add("2,1");}
	    		else {b2.setIcon(imgmodf7);tabcorr6.add("2,1"); }
	    	}
	    	else if(i==2)
	    	{
	    		if(listpos[i]==0) {b3.setIcon(imgmodf1);tabcorr0.add("3,1"); }
	    		else if(listpos[i]==1) {b3.setIcon(imgmodf2);tabcorr1.add("3,1"); }
	    		else if(listpos[i]==2) {b3.setIcon(imgmodf3);tabcorr2.add("3,1"); }
	    		else if(listpos[i]==3) {b3.setIcon(imgmodf4);tabcorr3.add("3,1"); }
	    		else if(listpos[i]==4) {b3.setIcon(imgmodf5);tabcorr4.add("3,1");}
	    		else if(listpos[i]==5) {b3.setIcon(imgmodf6);tabcorr5.add("3,1");}
	    		else { b3.setIcon(imgmodf7);tabcorr6.add("3,1"); }
	    	}
	    	else if (i==3)
	    	{
	    		if(listpos[i]==0) {b4.setIcon(imgmodf1);tabcorr0.add("4,1"); }
	    		else if(listpos[i]==1) {b4.setIcon(imgmodf2);tabcorr1.add("4,1"); }
	    		else if(listpos[i]==2) {b4.setIcon(imgmodf3);tabcorr2.add("4,1"); }
	    		else if(listpos[i]==3) {b4.setIcon(imgmodf4);tabcorr3.add("4,1"); }
	    		else if(listpos[i]==4) {b4.setIcon(imgmodf5);tabcorr4.add("4,1");}
	    		else if(listpos[i]==5) {b4.setIcon(imgmodf6);tabcorr5.add("4,1");}
	    		else { b4.setIcon(imgmodf7);tabcorr6.add("4,1");  }
	    	}
	    	else if (i==4)
	    	{
	    		if(listpos[i]==0) {b5.setIcon(imgmodf1);tabcorr0.add("1,2"); }
	    		else if(listpos[i]==1) {b5.setIcon(imgmodf2);tabcorr1.add("1,2"); }
	    		else if(listpos[i]==2) {b5.setIcon(imgmodf3);tabcorr2.add("1,2"); }
	    		else if(listpos[i]==3) {b5.setIcon(imgmodf4);tabcorr3.add("1,2"); }
	    		else if(listpos[i]==4) {b5.setIcon(imgmodf5);tabcorr4.add("1,2");}
	    		else if(listpos[i]==5) {b5.setIcon(imgmodf6);tabcorr5.add("1,2");}
	    		else { b5.setIcon(imgmodf7);tabcorr6.add("1,2");  }
	    	}
	    	else if (i==5)
	    	{
	    		if(listpos[i]==0) {b6.setIcon(imgmodf1);tabcorr0.add("2,2"); }
	    		else if(listpos[i]==1) {b6.setIcon(imgmodf2);tabcorr1.add("2,2"); }
	    		else if(listpos[i]==2) {b6.setIcon(imgmodf3);tabcorr2.add("2,2"); }
	    		else if(listpos[i]==3) {b6.setIcon(imgmodf4);tabcorr3.add("2,2"); }
	    		else if(listpos[i]==4) {b6.setIcon(imgmodf5);tabcorr4.add("2,2");}
	    		else if(listpos[i]==5) {b6.setIcon(imgmodf6);tabcorr5.add("2,2");}
	    		else { b6.setIcon(imgmodf7);tabcorr6.add("2,2");  }
	    	}
	    	else if (i==6)
	    	{
	    		if(listpos[i]==0) {b7.setIcon(imgmodf1);tabcorr0.add("3,2"); }
	    		else if(listpos[i]==1) {b7.setIcon(imgmodf2);tabcorr1.add("3,2"); }
	    		else if(listpos[i]==2) {b7.setIcon(imgmodf3);tabcorr2.add("3,2"); }
	    		else if(listpos[i]==3) {b7.setIcon(imgmodf4);tabcorr3.add("3,2"); }
	    		else if(listpos[i]==4) {b7.setIcon(imgmodf5);tabcorr4.add("3,2");}
	    		else if(listpos[i]==5) {b7.setIcon(imgmodf6);tabcorr5.add("3,2");}
	    		else { b7.setIcon(imgmodf7);tabcorr6.add("3,2");  }
	    	}
	    	else if (i==7)
	    	{
	    		if(listpos[i]==0) {b8.setIcon(imgmodf1);tabcorr0.add("4,2"); }
	    		else if(listpos[i]==1) {b8.setIcon(imgmodf2);tabcorr1.add("4,2"); }
	    		else if(listpos[i]==2) {b8.setIcon(imgmodf3);tabcorr2.add("4,2"); }
	    		else if(listpos[i]==3) {b8.setIcon(imgmodf4);tabcorr3.add("4,2"); }
	    		else if(listpos[i]==4) {b8.setIcon(imgmodf5);tabcorr4.add("4,2");}
	    		else if(listpos[i]==5) {b8.setIcon(imgmodf6);tabcorr5.add("4,2");}
	    		else { b8.setIcon(imgmodf7);tabcorr6.add("4,2");  }
	    	}
	    	else if(i==8)
	    	{
	    		if(listpos[i]==0) {b9.setIcon(imgmodf1);tabcorr0.add("1,3"); }
	    		else if(listpos[i]==1) {b9.setIcon(imgmodf2);tabcorr1.add("1,3"); }
	    		else if(listpos[i]==2) {b9.setIcon(imgmodf3);tabcorr2.add("1,3"); }
	    		else if(listpos[i]==3) {b9.setIcon(imgmodf4);tabcorr3.add("1,3"); }
	    		else if(listpos[i]==4) {b9.setIcon(imgmodf5);tabcorr4.add("1,3");}
	    		else if(listpos[i]==5) {b9.setIcon(imgmodf6);tabcorr5.add("1,3");}
	    		else { b9.setIcon(imgmodf7);tabcorr6.add("1,3");  }
	    	}
	    	else if(i==9)
	    	{
	    		if(listpos[i]==0) {b10.setIcon(imgmodf1);tabcorr0.add("2,3"); }
	    		else if(listpos[i]==1) {b10.setIcon(imgmodf2);tabcorr1.add("2,3"); }
	    		else if(listpos[i]==2) {b10.setIcon(imgmodf3);tabcorr2.add("2,3"); }
	    		else if(listpos[i]==3) {b10.setIcon(imgmodf4);tabcorr3.add("2,3"); }
	    		else if(listpos[i]==4) {b10.setIcon(imgmodf5);tabcorr4.add("2,3");}
	    		else if(listpos[i]==5) {b10.setIcon(imgmodf6);tabcorr5.add("2,3");}
	    		else { b10.setIcon(imgmodf7);tabcorr6.add("2,3");  }
	    	}
	    	else if(i==10)
	    	{
	    		if(listpos[i]==0) {b11.setIcon(imgmodf1);tabcorr0.add("3,3"); }
	    		else if(listpos[i]==1) {b11.setIcon(imgmodf2);tabcorr1.add("3,3"); }
	    		else if(listpos[i]==2) {b11.setIcon(imgmodf3);tabcorr2.add("3,3"); }
	    		else if(listpos[i]==3) {b11.setIcon(imgmodf4);tabcorr3.add("3,3"); }
	    		else if(listpos[i]==4) {b11.setIcon(imgmodf5);tabcorr4.add("3,3");}
	    		else if(listpos[i]==5) {b11.setIcon(imgmodf6);tabcorr5.add("3,3");}
	    		else { b11.setIcon(imgmodf7);tabcorr6.add("3,3");  }
	    	}
	    	else if(i==11)
	    	{
	    		if(listpos[i]==0) {b12.setIcon(imgmodf1);tabcorr0.add("4,3"); }
	    		else if(listpos[i]==1) {b12.setIcon(imgmodf2);tabcorr1.add("4,3"); }
	    		else if(listpos[i]==2) {b12.setIcon(imgmodf3);tabcorr2.add("4,3"); }
	    		else if(listpos[i]==3) {b12.setIcon(imgmodf4);tabcorr3.add("4,3"); }
	    		else if(listpos[i]==4) {b12.setIcon(imgmodf5);tabcorr4.add("4,3");}
	    		else if(listpos[i]==5) {b12.setIcon(imgmodf6);tabcorr5.add("4,3");}
	    		else { b12.setIcon(imgmodf7);tabcorr6.add("4,3");  }
	    	}
	    	else if(i==12)
	    	{
	    		if(listpos[i]==0) {b13.setIcon(imgmodf1);tabcorr0.add("1,4"); }
	    		else if(listpos[i]==1) {b13.setIcon(imgmodf2);tabcorr1.add("1,4"); }
	    		else if(listpos[i]==2) {b13.setIcon(imgmodf3);tabcorr2.add("1,4"); }
	    		else if(listpos[i]==3) {b13.setIcon(imgmodf4);tabcorr3.add("1,4"); }
	    		else if(listpos[i]==4) {b13.setIcon(imgmodf5);tabcorr4.add("1,4");}
	    		else if(listpos[i]==5) {b13.setIcon(imgmodf6);tabcorr5.add("1,4");}
	    		else { b13.setIcon(imgmodf7);tabcorr6.add("1,4");  }
	    	}
	    	else if(i==13)
	    	{
	    		if(listpos[i]==0) {b14.setIcon(imgmodf1);tabcorr0.add("2,4"); }
	    		else if(listpos[i]==1) {b14.setIcon(imgmodf2);tabcorr1.add("2,4"); }
	    		else if(listpos[i]==2) {b14.setIcon(imgmodf3);tabcorr2.add("2,4"); }
	    		else if(listpos[i]==3) {b14.setIcon(imgmodf4);tabcorr3.add("2,4"); }
	    		else if(listpos[i]==4) {b14.setIcon(imgmodf5);tabcorr4.add("2,4");}
	    		else if(listpos[i]==5) {b14.setIcon(imgmodf6);tabcorr5.add("2,4");}
	    		else { b14.setIcon(imgmodf7);tabcorr6.add("2,4");  }
	    	}
	    	else if(i==14)
	    	{
	    		if(listpos[i]==0) {b15.setIcon(imgmodf1);tabcorr0.add("3,4"); }
	    		else if(listpos[i]==1) {b15.setIcon(imgmodf2);tabcorr1.add("3,4"); }
	    		else if(listpos[i]==2) {b15.setIcon(imgmodf3);tabcorr2.add("3,4"); }
	    		else if(listpos[i]==3) {b15.setIcon(imgmodf4);tabcorr3.add("3,4"); }
	    		else if(listpos[i]==4) {b15.setIcon(imgmodf5);tabcorr4.add("3,4");}
	    		else if(listpos[i]==5) {b15.setIcon(imgmodf6);tabcorr5.add("3,4");}
	    		else { b15.setIcon(imgmodf7);tabcorr6.add("3,4");  }
	    	}
	    	else if(i==15)
	    	{
	    		if(listpos[i]==0) {b16.setIcon(imgmodf1);tabcorr0.add("4,4"); }
	    		else if(listpos[i]==1) {b16.setIcon(imgmodf2);tabcorr1.add("4,4"); }
	    		else if(listpos[i]==2) {b16.setIcon(imgmodf3);tabcorr2.add("4,4"); }
	    		else if(listpos[i]==3) {b16.setIcon(imgmodf4);tabcorr3.add("4,4"); }
	    		else if(listpos[i]==4) {b16.setIcon(imgmodf5);tabcorr4.add("4,4");}
	    		else if(listpos[i]==5) {b16.setIcon(imgmodf6);tabcorr5.add("4,4");}
	    		else { b16.setIcon(imgmodf7);tabcorr6.add("4,4");  }
	    	}
	    }
		 	b17.setEnabled(false);
		 Timer chrono =new Timer();
		 chrono.schedule(new TimerTask()
		{ int time=64;
			 public void run()
			 {
				 time--;
			 
				 if(time==60) {
				b1.setIcon(null); 
				b2.setIcon(null); 
				b3.setIcon(null); 
				b4.setIcon(null); 
				b5.setIcon(null); 
				b6.setIcon(null); 
				b7.setIcon(null); 
				b8.setIcon(null); 
				b9.setIcon(null); 
				b10.setIcon(null); 
				b11.setIcon(null); 
				b12.setIcon(null); 
				b13.setIcon(null); 
				b14.setIcon(null); 
				b15.setIcon(null); 
				b16.setIcon(null);}
				 if(ok==1)cancel();
				 if(time==0&&ok==0)
				 {
					 ltemps.setText(time+" second");
					 l2.setText("Time over !!");
					 cancel();
					   b1.setEnabled(false);
						b2.setEnabled(false);
						b3.setEnabled(false);
						b4.setEnabled(false);
						b5.setEnabled(false);
						b6.setEnabled(false);
						b7.setEnabled(false);
						b8.setEnabled(false);
						b9.setEnabled(false);
						b10.setEnabled(false);
						b11.setEnabled(false);
						b12.setEnabled(false);
						b13.setEnabled(false);
						b14.setEnabled(false);
						b15.setEnabled(false);
						b16.setEnabled(false);
						//confirmer1();
				 }
				 if(time>0)
				 ltemps.setText(time+" second");
				 if(time==-3&&ok==0) {System.out.println("ok");confirmer1();}
				 
			 }
				 }
				 ,1000,1000);
		 System.out.println("tables de corr");
			System.out.println(tabcorr0);
			System.out.println(tabcorr1);
			System.out.println(tabcorr2);
			System.out.println(tabcorr3);
			System.out.println(tabcorr4);
			System.out.println(tabcorr5);
			System.out.println(tabcorr6);
		 
	 	}
		
		}
	 );
	  
	
b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		if(listpos[0]==0) {b1.setIcon(imgmodf1);intermediaire.add("1,1");}
		else if(listpos[0]==1) {b1.setIcon(imgmodf2);intermediaire.add("1,1");}
		else if(listpos[0]==2) {b1.setIcon(imgmodf3);intermediaire.add("1,1");}
		else if(listpos[0]==3) {b1.setIcon(imgmodf4);intermediaire.add("1,1");}
		else if(listpos[0]==4) {b1.setIcon(imgmodf5);intermediaire.add("1,1");}
		else if(listpos[0]==5) {b1.setIcon(imgmodf6);intermediaire.add("1,1");}
		else {b1.setIcon(imgmodf7);l2.setText("game over !!");
		ok=1;
		time=0;
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		b10.setEnabled(false);
		b11.setEnabled(false);
		b12.setEnabled(false);
		b13.setEnabled(false);
		b14.setEnabled(false);
		b15.setEnabled(false);
		b16.setEnabled(false);
		confirmer1();
		}
		
		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) { 
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				 if(trouve==6)
					{l2.setText("Level 3 accomplished successfully");
					ok=1;
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
				}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();/***************************************/
				}
				 if(trouve==6)
					{l2.setText("Level 3 accomplished successfully");
					ok=1;
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
					}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6)
					{l2.setText("Level 3 accomplished successfully");
					ok=1;
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
					}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6)
					{l2.setText("Level 3 accomplished successfully");
					ok=1;
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
					}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6)
					{l2.setText("Level 3 accomplished successfully");
					ok=1;
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
					}
			}
			else
			{
				 Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 	b1.setIcon(null);
							if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
							else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
							else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
							else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
							else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
							else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
							else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
							else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
							else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
							else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
							else {b16.setIcon(null);}
							intermediaire.clear();
					 }
						 }
						 ,500);
				
			}
		}
			
		
	}
});
   
b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
	{

	if(listpos[1]==0) {b2.setIcon(imgmodf1);intermediaire.add("2,1");}
	else if(listpos[1]==1) {b2.setIcon(imgmodf2);intermediaire.add("2,1");}
	else if(listpos[1]==2) {b2.setIcon(imgmodf3);intermediaire.add("2,1");}
	else if(listpos[1]==3) {b2.setIcon(imgmodf4);intermediaire.add("2,1");}
	else if(listpos[1]==4) {b2.setIcon(imgmodf5);intermediaire.add("2,1");}
	else if(listpos[1]==5) {b2.setIcon(imgmodf6);intermediaire.add("2,1");}
	else {b2.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
				}
			}
			
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
				}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6){
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
				}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
				}
			}
			
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
				}
			}
			
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
				}
			}
			
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 b2.setIcon(null);
							if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
							else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
							else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
							else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
							else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);;}
							else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
							else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
							else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
							else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
							else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
							else {b16.setIcon(null);}
						 	intermediaire.clear();
							
					 }
						 }
						 ,500);
				
				
				}
		}
			
		
	}
		});  
b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
	{
	if(listpos[2]==0) {b3.setIcon(imgmodf1);intermediaire.add("3,1");}
	else if(listpos[2]==1) {b3.setIcon(imgmodf2);intermediaire.add("3,1");}
	else if(listpos[2]==2) {b3.setIcon(imgmodf3);intermediaire.add("3,1");}
	else if(listpos[2]==3) {b3.setIcon(imgmodf4);intermediaire.add("3,1");}
	else if(listpos[2]==4) {b3.setIcon(imgmodf5);intermediaire.add("3,1");}
	else if(listpos[2]==5) {b3.setIcon(imgmodf6);intermediaire.add("3,1");}
	else {b3.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3|trouve==4||trouve==5)
				{	
					l2.setText("Nice Step !!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					
			}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) 
				{
				l2.setText("Level 3 accomplished successfully");
				ok=1;
				b3.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
				else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
				else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
				else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
				else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
				else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
				else {b16.setEnabled(false);}
				intermediaire.clear();
				confirmer();
				
			}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6)
				{
				l2.setText("Level 3 accomplished successfully");
				ok=1;
				b3.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
				else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
				else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
				else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
				else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
				else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
				else {b16.setEnabled(false);}
				intermediaire.clear();
				confirmer();
				
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6)
				{
				l2.setText("Level 3 accomplished successfully ");
				ok=1;
				b3.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
				else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
				else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
				else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
				else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
				else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
				else {b16.setEnabled(false);}
				intermediaire.clear();
				confirmer();
				
			}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) 
				{
				l2.setText("Level 3 accomplished successfully");
				ok=1;
				b3.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
				else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
				else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
				else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
				else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
				else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
				else {b16.setEnabled(false);}
				intermediaire.clear();
				confirmer();
				
			}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) 
				{
				l2.setText("Level 3 accomplished successfully");
				ok=1;
				b3.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
				else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
				else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
				else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
				else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
				else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
				else {b16.setEnabled(false);}
			
				intermediaire.clear();
				confirmer();
				
			}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 	b3.setIcon(null);
							if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
							else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
							else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
							else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
							else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
							else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
							else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
							else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
							else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
							else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
							else {b16.setIcon(null);}
							intermediaire.clear();
					 }
						 }
						 ,500);
				}
		}
	}
		});
	 
b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
	if(listpos[3]==0) {b4.setIcon(imgmodf1);intermediaire.add("4,1");}
	else if(listpos[3]==1) {b4.setIcon(imgmodf2);intermediaire.add("4,1");}
	else if(listpos[3]==2) {b4.setIcon(imgmodf3);intermediaire.add("4,1");}
	else if(listpos[3]==3) {b4.setIcon(imgmodf4);intermediaire.add("4,1");}
	else if(listpos[3]==4) {b4.setIcon(imgmodf5);intermediaire.add("4,1");}
	else if(listpos[3]==5) {b4.setIcon(imgmodf6);intermediaire.add("4,1");}
	else {b4.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4|trouve==5)
				{
					
					l2.setText("Nice Step !!");
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					 	intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("level 3 accomplished successfully");
					ok=1;
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					 	intermediaire.clear();
				}
				if(trouve==6) {l2.setText("Level 3 accomplished successfully");
				ok=1;
				b4.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
				else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
				else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
				else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
				else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
				else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
				else {b16.setEnabled(false);}				
				intermediaire.clear();
				confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b4.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="1,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						 	intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b4.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b4.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						 	intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						
						b4.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
	if(listpos[4]==0) {b5.setIcon(imgmodf1);intermediaire.add("1,2");}
	else if(listpos[4]==1) {b5.setIcon(imgmodf2);intermediaire.add("1,2");}
	else if(listpos[4]==2) {b5.setIcon(imgmodf3);intermediaire.add("1,2");}
	else if(listpos[4]==3) {b5.setIcon(imgmodf4);intermediaire.add("1,2");}
	else if(listpos[4]==4) {b5.setIcon(imgmodf5);intermediaire.add("1,2");}
	else if(listpos[4]==5) {b5.setIcon(imgmodf6);intermediaire.add("1,2");}
	else {b5.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b5.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b5.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
			
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b5.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b5.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b5.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					 intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b5.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b5.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						 intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b5.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b5.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						 intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b5.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();			}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b5.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						 intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b5.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
					
						b5.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});


b6.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
if(listpos[5]==0) {b6.setIcon(imgmodf1);intermediaire.add("2,2");}
else if(listpos[5]==1) {b6.setIcon(imgmodf2);intermediaire.add("2,2");}
else if(listpos[5]==2) {b6.setIcon(imgmodf3);intermediaire.add("2,2");}
else if(listpos[5]==3) {b6.setIcon(imgmodf4);intermediaire.add("2,2");}
else if(listpos[5]==4) {b6.setIcon(imgmodf5);intermediaire.add("2,2");}
else if(listpos[5]==5) {b6.setIcon(imgmodf6);intermediaire.add("2,2");}
else {b6.setIcon(imgmodf7);l2.setText("game over !!");
ok=1;
time=0;
b1.setEnabled(false);
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
b10.setEnabled(false);
b11.setEnabled(false);
b12.setEnabled(false);
b13.setEnabled(false);
b14.setEnabled(false);
b15.setEnabled(false);
b16.setEnabled(false);
}

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					
					l2.setText("Nice Step !!");
					b6.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b6.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b6.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b6.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b6.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b6.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b6.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b6.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();			
					}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b6.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b6.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();		
					}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b6.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b6.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();			
					}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b6.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b7.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
	if(listpos[6]==0) {b7.setIcon(imgmodf1);intermediaire.add("3,2");}
	else if(listpos[6]==1) {b7.setIcon(imgmodf2);intermediaire.add("3,2");}
	else if(listpos[6]==2) {b7.setIcon(imgmodf3);intermediaire.add("3,2");}
	else if(listpos[6]==3) {b7.setIcon(imgmodf4);intermediaire.add("3,2");}
	else if(listpos[6]==4) {b7.setIcon(imgmodf5);intermediaire.add("3,2");}
	else if(listpos[6]==5) {b7.setIcon(imgmodf6);intermediaire.add("3,2");}
	else {b7.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					
					l2.setText("Nice Step !!");
					b7.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b7.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b7.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b7.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b7.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b7.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b7.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b7.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();	
					}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b7.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b7.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b7.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b7.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b7.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b8.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{
	if(listpos[7]==0) {b8.setIcon(imgmodf1);intermediaire.add("4,2");}
	else if(listpos[7]==1) {b8.setIcon(imgmodf2);intermediaire.add("4,2");}
	else if(listpos[7]==2) {b8.setIcon(imgmodf3);intermediaire.add("4,2");}
	else if(listpos[7]==3) {b8.setIcon(imgmodf4);intermediaire.add("4,2");}
	else if(listpos[7]==4) {b8.setIcon(imgmodf5);intermediaire.add("4,2");}
	else if(listpos[7]==5) {b8.setIcon(imgmodf6);intermediaire.add("4,2");}
	else {b8.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
				
					
					l2.setText("bravo");
					b8.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b8.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b8.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b8.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b8.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b8.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
				b8.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
				else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
				else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
				else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
				else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
				else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
				else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
				else {b16.setEnabled(false);}
				intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b8.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
				b8.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
				else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
				else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
				else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
				else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
				else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
				else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
				else {b16.setEnabled(false);}
				intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b8.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();	
					}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
				b8.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
				else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
				else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
				else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
				else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
				else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
				else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
				else {b16.setEnabled(false);}
				intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b8.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b8.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setEnabled(false);}
						b19.setVisible(true);
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b9.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{

	if(listpos[8]==0) {b9.setIcon(imgmodf1);intermediaire.add("1,3");}
	else if(listpos[8]==1) {b9.setIcon(imgmodf2);intermediaire.add("1,3");}
	else if(listpos[8]==2) {b9.setIcon(imgmodf3);intermediaire.add("1,3");}
	else if(listpos[8]==3) {b9.setIcon(imgmodf4);intermediaire.add("1,3");}
	else if(listpos[8]==4) {b9.setIcon(imgmodf5);intermediaire.add("1,3");}
	else if(listpos[8]==5) {b9.setIcon(imgmodf6);intermediaire.add("1,3");}
	else {b9.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
				
					
					l2.setText("Nice Step !!");
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b9.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b9.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b9.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b9.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});
b10.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{

	if(listpos[9]==0) {b10.setIcon(imgmodf1);intermediaire.add("2,3");}
	else if(listpos[9]==1) {b10.setIcon(imgmodf2);intermediaire.add("2,3");}
	else if(listpos[9]==2) {b10.setIcon(imgmodf3);intermediaire.add("2,3");}
	else if(listpos[9]==3) {b10.setIcon(imgmodf4);intermediaire.add("2,3");}
	else if(listpos[9]==4) {b10.setIcon(imgmodf5);intermediaire.add("2,3");}
	else if(listpos[9]==5) {b10.setIcon(imgmodf6);intermediaire.add("2,3");}
	else {b10.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
				
					
					l2.setText("Nice Step !!");
					b10.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b10.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b10.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b10.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b10.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b10.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b10.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b10.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b10.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b10.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b10.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b10.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b10.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b11.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{

	if(listpos[10]==0) {b11.setIcon(imgmodf1);intermediaire.add("3,3");}
	else if(listpos[10]==1) {b11.setIcon(imgmodf2);intermediaire.add("3,3");}
	else if(listpos[10]==2) {b11.setIcon(imgmodf3);intermediaire.add("3,3");}
	else if(listpos[10]==3) {b11.setIcon(imgmodf4);intermediaire.add("3,3");}
	else if(listpos[10]==4) {b11.setIcon(imgmodf5);intermediaire.add("3,3");}
	else if(listpos[10]==5) {b11.setIcon(imgmodf6);intermediaire.add("3,3");}
	else {b11.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
				
					
					l2.setText("Nice Step !!");
					b11.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b11.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b11.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b11.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b11.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b11.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b11.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b11.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b11.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b11.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b11.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b11.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b12.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{

	if(listpos[11]==0) {b12.setIcon(imgmodf1);intermediaire.add("4,3");}
	else if(listpos[11]==1) {b12.setIcon(imgmodf2);intermediaire.add("4,3");}
	else if(listpos[11]==2) {b12.setIcon(imgmodf3);intermediaire.add("4,3");}
	else if(listpos[11]==3) {b12.setIcon(imgmodf4);intermediaire.add("4,3");}
	else if(listpos[11]==4) {b12.setIcon(imgmodf5);intermediaire.add("4,3");}
	else if(listpos[11]==5) {b12.setIcon(imgmodf6);intermediaire.add("4,3");}
	else {b12.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
				
					
					l2.setText("Nice Step !!");
					b12.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b12.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b12.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b12.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b12.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b12.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b12.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b12.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b12.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b12.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b12.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b12.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b12.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b13.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{

	if(listpos[12]==0) {b13.setIcon(imgmodf1);intermediaire.add("1,4");}
	else if(listpos[12]==1) {b13.setIcon(imgmodf2);intermediaire.add("1,4");}
	else if(listpos[12]==2) {b13.setIcon(imgmodf3);intermediaire.add("1,4");}
	else if(listpos[12]==3) {b13.setIcon(imgmodf4);intermediaire.add("1,4");}
	else if(listpos[12]==4) {b13.setIcon(imgmodf5);intermediaire.add("1,4");}
	else if(listpos[12]==5) {b13.setIcon(imgmodf6);intermediaire.add("1,4");}
	else {b13.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
				
					
					l2.setText("Nice Step !!");
					b13.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b13.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b13.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b13.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b13.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b13.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b13.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b13.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b13.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b13.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b13.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b13.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b13.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b14.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{

	if(listpos[13]==0) {b14.setIcon(imgmodf1);intermediaire.add("2,4");}
	else if(listpos[13]==1) {b14.setIcon(imgmodf2);intermediaire.add("2,4");}
	else if(listpos[13]==2) {b14.setIcon(imgmodf3);intermediaire.add("2,4");}
	else if(listpos[13]==3) {b14.setIcon(imgmodf4);intermediaire.add("2,4");}
	else if(listpos[13]==4) {b14.setIcon(imgmodf5);intermediaire.add("2,4");}
	else if(listpos[13]==5) {b14.setIcon(imgmodf6);intermediaire.add("2,4");}
	else {b14.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
				
					
					l2.setText("Nice Step !!");
					b14.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b14.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b14.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b14.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					
					b14.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b14.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b14.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully ");
					ok=1;
					b14.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step ");
						b14.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b14.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b14.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 acomplished successfully");
					ok=1;
					b14.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b14.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b16.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});


b15.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{

	if(listpos[14]==0) {b15.setIcon(imgmodf1);intermediaire.add("3,4");}
	else if(listpos[14]==1) {b15.setIcon(imgmodf2);intermediaire.add("3,4");}
	else if(listpos[14]==2) {b15.setIcon(imgmodf3);intermediaire.add("3,4");}
	else if(listpos[14]==3) {b15.setIcon(imgmodf4);intermediaire.add("3,4");}
	else if(listpos[14]==4) {b15.setIcon(imgmodf5);intermediaire.add("3,4");}
	else if(listpos[14]==5) {b15.setIcon(imgmodf6);intermediaire.add("3,4");}
	else {b15.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
				
					
					l2.setText("Nice Step !!");
					b15.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomlished successfully");
					ok=1;
					b15.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b15.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					b15.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b15.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b15.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b15.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b15.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();	}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b15.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b15.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b15.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
						else {b16.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfuly");
					ok=1;
					b15.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b9.setEnabled(false);}
					else {b16.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b15.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="1,3") {b9.setIcon(null);}
						else {b16.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b16.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
{

	if(listpos[15]==0) {b16.setIcon(imgmodf1);intermediaire.add("4,4");}
	else if(listpos[15]==1) {b16.setIcon(imgmodf2);intermediaire.add("4,4");}
	else if(listpos[15]==2) {b16.setIcon(imgmodf3);intermediaire.add("4,4");}
	else if(listpos[15]==3) {b16.setIcon(imgmodf4);intermediaire.add("4,4");}
	else if(listpos[15]==4) {b16.setIcon(imgmodf5);intermediaire.add("4,4");}
	else if(listpos[15]==5) {b16.setIcon(imgmodf6);intermediaire.add("4,4");}
	else {b19.setIcon(imgmodf7);l2.setText("game over !!");
	ok=1;
	time=0;
	b1.setEnabled(false);
	b2.setEnabled(false);
	b3.setEnabled(false);
	b4.setEnabled(false);
	b5.setEnabled(false);
	b6.setEnabled(false);
	b7.setEnabled(false);
	b8.setEnabled(false);
	b9.setEnabled(false);
	b10.setEnabled(false);
	b11.setEnabled(false);
	b12.setEnabled(false);
	b13.setEnabled(false);
	b14.setEnabled(false);
	b15.setEnabled(false);
	b16.setEnabled(false);
	confirmer1();
	}
		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
				
					
					l2.setText("Nice Step !!");
					b16.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b16.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b16.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b16.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
					confirmer();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					l2.setText("Nice Step !!");
					b16.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b9.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
					confirmer();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b16.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b9.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b16.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr4.get(0)) && intermediaire.contains(tabcorr4.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b16.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b9.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b16.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else if(intermediaire.contains(tabcorr5.get(0)) && intermediaire.contains(tabcorr5.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3||trouve==4||trouve==5)
				{
					 l2.setText("Nice Step !!");
						b16.setEnabled(false);
						if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
						else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
						else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
						else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
						else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
						else {b9.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==6) {
					l2.setText("Level 3 accomplished successfully");
					ok=1;
					b16.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="4,1") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="4,2") {b8.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b10.setEnabled(false);}
					else if(intermediaire.get(0)=="3,3") {b11.setEnabled(false);}
					else if(intermediaire.get(0)=="4,3") {b12.setEnabled(false);}
					else if(intermediaire.get(0)=="1,4") {b13.setEnabled(false);}
					else if(intermediaire.get(0)=="2,4") {b14.setEnabled(false);}
					else if(intermediaire.get(0)=="3,4") {b15.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
					confirmer();
	}
			}
			else 
				{
				Timer chrono =new Timer();
				 chrono.schedule(new TimerTask()
						 {
					 public void run()
					 {
						 
						b16.setIcon(null);
						if(intermediaire.get(0)=="1,1") {b1.setIcon(null);}
						else if(intermediaire.get(0)=="2,1") {b2.setIcon(null);}
						else if(intermediaire.get(0)=="3,1") {b3.setIcon(null);}
						else if(intermediaire.get(0)=="4,1") {b4.setIcon(null);}
						else if(intermediaire.get(0)=="1,2") {b5.setIcon(null);}
						else if(intermediaire.get(0)=="2,2") {b6.setIcon(null);}
						else if(intermediaire.get(0)=="3,2") {b7.setIcon(null);}
						else if(intermediaire.get(0)=="4,2") {b8.setIcon(null);}
						else if(intermediaire.get(0)=="2,3") {b10.setIcon(null);}
						else if(intermediaire.get(0)=="3,3") {b11.setIcon(null);}
						else if(intermediaire.get(0)=="4,3") {b12.setIcon(null);}
						else if(intermediaire.get(0)=="1,4") {b13.setIcon(null);}
						else if(intermediaire.get(0)=="2,4") {b14.setIcon(null);}
						else if(intermediaire.get(0)=="3,4") {b15.setIcon(null);}
						else {b9.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b18.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		dispose();
	}
		});
		pan4.add(lchrono);
		pan4.add(ltemps);
	    pan1.add(b1);
		pan1.add(b2);
		pan1.add(b3);
		pan1.add(b4);
		pan1.add(b5);
		pan1.add(b6);
		pan1.add(b7);
		pan1.add(b8);
		pan1.add(b9);
		pan1.add(b10);
		pan1.add(b11);
		pan1.add(b12);
		pan1.add(b13);
		pan1.add(b14);
		pan1.add(b15);
		pan1.add(b16);
		pan3.add(l1);
		pan3.add(l2);
		pan2.add(pan4);
		pan2.add(pan3);
		pan2.add(b17);
		pan2.add(b18);
		//pan2.add(b19);
	
		add(pan1,BorderLayout.CENTER);
		add(pan2,BorderLayout.SOUTH);
		setVisible(true);
		}
	public void confirmer()
	{
		JOptionPane.showMessageDialog(this,"Perfect!!\\nYou reached the last Level \n You are an execelent Player !!","confirmation",JOptionPane.DEFAULT_OPTION);
		
	}
	public void confirmer1()
	{
		 JOptionPane.showMessageDialog(this,"Sorry,You lost this Level!!\n Game Over !!","Game over ",JOptionPane.DEFAULT_OPTION);
		

	}
}
