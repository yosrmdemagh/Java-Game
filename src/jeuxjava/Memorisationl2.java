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
public class MemorisationL2 extends JFrame{
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
	JButton b10;
	JButton b11;
	JButton b12;
	JLabel l1;
	JLabel l2;
	JLabel l3;
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
	Image imgmod1;
	Image imgmod2;
	Image imgmod3;
	Image imgmod4;
	Image imgmod5;
	Image imgmod6;
	ImageIcon imgmodf1;
	ImageIcon imgmodf2;
	ImageIcon imgmodf3;
	ImageIcon imgmodf4;
	ImageIcon imgmodf5;
	ArrayList <String> tabcorr0;
	ArrayList <String> tabcorr1;
	ArrayList <String> tabcorr2;
	ArrayList <String> tabcorr3;
	ArrayList <String> tabcorr4;
	ArrayList <String> intermediaire;
	int trouve;
	MemorisationL2()
		{
		trouve=0;
		intermediaire=new ArrayList();
		tabcorr0=new ArrayList();
		tabcorr1=new ArrayList();
		tabcorr2=new ArrayList();
		tabcorr3=new ArrayList();
		tabcorr4=new ArrayList();
		listpos= new Integer[9];
		setSize(700,700);
		setTitle("Memorisation level 2");
		pan1=new JPanel(new GridLayout(3,3));
		pan2=new JPanel(new GridLayout(4,1));
		pan3=new JPanel();
		l1=new JLabel("result :");
		l2=new JLabel("---------");
		b1=new JButton();
		b2=new JButton();
		b3=new JButton();
		b4=new JButton();
		b5=new JButton();
		b6=new JButton();
		b7=new JButton();
		b8=new JButton();
		b9=new JButton();
		b10=new JButton("start");
		b11= new JButton("exit");
		b12= new JButton("next");
		b12.setVisible(false);
		img1= Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\fleur.png");
		img2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\voiture_bleuepng.png");
		img3 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\pomme_img.png");
		img4 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\maisonpng.png");
		img5 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\bomb.png");
		img6 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\YM.jpg");
		imgmod1=img1.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
	    imgmod2=img2.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
	    imgmod3=img3.getScaledInstance(110, 110, Image.SCALE_SMOOTH);
	    imgmod4=img4.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
	    imgmod5=img5.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
	    imgmod6=img6.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	    imgmodf1 =new ImageIcon(imgmod1);
	    imgmodf2 =new ImageIcon(imgmod2);
	    imgmodf3 =new ImageIcon(imgmod3);
	    imgmodf4 =new ImageIcon(imgmod4);
	    imgmodf5 =new ImageIcon(imgmod5);	   
	    this.setIconImage(imgmod6);
	    r=new Random();
	    for (i=0;i<9;i++)System.out.println(listpos[i]+"/");
	    ///0 positions :
	    for (i=0;i<2;i++)
	    {
	    pos=r.nextInt(9);	
	    if(listpos[pos]!=null) {
	    	while(listpos[pos]!=null)pos=r.nextInt(9);
	    }
	    listpos[pos]=0;
	    }
	    /// 1 positions :
	    for (i=0;i<2;i++)
	    {
	    pos=r.nextInt(9);	
	    if(listpos[pos]!=null) {
	    	while(listpos[pos]!=null)pos=r.nextInt(9);
	    }
	    listpos[pos]=1;
	    }
	    /// 2 positions :
	    for (i=0;i<2;i++)
	    {
	    pos=r.nextInt(9);	
	    if(listpos[pos]!=null) {
	    	while(listpos[pos]!=null)pos=r.nextInt(9);
	    }
	    listpos[pos]=2;
	    }
	    /// 3 positions
	    for (i=0;i<2;i++)
	    {
	    pos=r.nextInt(9);	
	    if(listpos[pos]!=null) {
	    	while(listpos[pos]!=null)pos=r.nextInt(9);
	    }
	    listpos[pos]=3;
	    }
	    for (i=0;i<9;i++)
	    	if(listpos[i]==null) {listpos[i]=4;break;}
	    		
	    
	    System.out.println("apres");
	    for (i=0;i<9;i++) System.out.println(listpos[i]+"/");
	    b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	   b10.addActionListener(new ActionListener() {
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
		 	for (i=0;i<9;i++) {
	    	if(i==0) 
	    	{
	    		if(listpos[i]==0) {b1.setIcon(imgmodf1);tabcorr0.add("1,1");}
	    		else if(listpos[i]==1) {b1.setIcon(imgmodf2);tabcorr1.add("1,1");}
	    		else if(listpos[i]==2) {b1.setIcon(imgmodf3);tabcorr2.add("1,1");}
	    		else if(listpos[i]==3) {b1.setIcon(imgmodf4);tabcorr3.add("1,1");}
	    		else {b1.setIcon(imgmodf5);tabcorr4.add("1,1");}
	    	}
	    	else if(i==1)
	    	{
	    		if(listpos[i]==0) {b2.setIcon(imgmodf1);tabcorr0.add("2,1");}
	    		else if(listpos[i]==1) {b2.setIcon(imgmodf2);tabcorr1.add("2,1");}
	    		else if(listpos[i]==2) {b2.setIcon(imgmodf3);tabcorr2.add("2,1");}
	    		else if(listpos[i]==3) {b2.setIcon(imgmodf4);tabcorr3.add("2,1");}
	    		else {b2.setIcon(imgmodf5);tabcorr4.add("2,1"); }
	    	}
	    	else if(i==2)
	    	{
	    		if(listpos[i]==0) {b3.setIcon(imgmodf1);tabcorr0.add("3,1"); }
	    		else if(listpos[i]==1) {b3.setIcon(imgmodf2);tabcorr1.add("3,1"); }
	    		else if(listpos[i]==2) {b3.setIcon(imgmodf3);tabcorr2.add("3,1"); }
	    		else if(listpos[i]==3) {b3.setIcon(imgmodf4);tabcorr3.add("3,1"); }
	    		else { b3.setIcon(imgmodf5);tabcorr4.add("3,1"); }
	    	}
	    	else if (i==3)
	    	{
	    		if(listpos[i]==0) {b4.setIcon(imgmodf1);tabcorr0.add("1,2"); }
	    		else if(listpos[i]==1) {b4.setIcon(imgmodf2);tabcorr1.add("1,2"); }
	    		else if(listpos[i]==2) {b4.setIcon(imgmodf3);tabcorr2.add("1,2"); }
	    		else if(listpos[i]==3) {b4.setIcon(imgmodf4);tabcorr3.add("1,2"); }
	    		else { b4.setIcon(imgmodf5);tabcorr4.add("1,2");  }
	    	}
	    	else if (i==4)
	    	{
	    		if(listpos[i]==0) {b5.setIcon(imgmodf1);tabcorr0.add("2,2"); }
	    		else if(listpos[i]==1) {b5.setIcon(imgmodf2);tabcorr1.add("2,2"); }
	    		else if(listpos[i]==2) {b5.setIcon(imgmodf3);tabcorr2.add("2,2"); }
	    		else if(listpos[i]==3) {b5.setIcon(imgmodf4);tabcorr3.add("2,2"); }
	    		else { b5.setIcon(imgmodf5);tabcorr4.add("2,2");  }
	    	}
	    	else if (i==5)
	    	{
	    		if(listpos[i]==0) {b6.setIcon(imgmodf1);tabcorr0.add("3,2"); }
	    		else if(listpos[i]==1) {b6.setIcon(imgmodf2);tabcorr1.add("3,2"); }
	    		else if(listpos[i]==2) {b6.setIcon(imgmodf3);tabcorr2.add("3,2"); }
	    		else if(listpos[i]==3) {b6.setIcon(imgmodf4);tabcorr3.add("3,2"); }
	    		else { b6.setIcon(imgmodf5);tabcorr4.add("3,2");  }
	    	}
	    	else if (i==6)
	    	{
	    		if(listpos[i]==0) {b7.setIcon(imgmodf1);tabcorr0.add("1,3"); }
	    		else if(listpos[i]==1) {b7.setIcon(imgmodf2);tabcorr1.add("1,3"); }
	    		else if(listpos[i]==2) {b7.setIcon(imgmodf3);tabcorr2.add("1,3"); }
	    		else if(listpos[i]==3) {b7.setIcon(imgmodf4);tabcorr3.add("1,3"); }
	    		else { b7.setIcon(imgmodf5);tabcorr4.add("1,3");  }
	    	}
	    	else if (i==7)
	    	{
	    		if(listpos[i]==0) {b8.setIcon(imgmodf1);tabcorr0.add("2,3"); }
	    		else if(listpos[i]==1) {b8.setIcon(imgmodf2);tabcorr1.add("2,3"); }
	    		else if(listpos[i]==2) {b8.setIcon(imgmodf3);tabcorr2.add("2,3"); }
	    		else if(listpos[i]==3) {b8.setIcon(imgmodf4);tabcorr3.add("2,3"); }
	    		else { b8.setIcon(imgmodf5);tabcorr4.add("2,3");  }
	    	}
	    	else 
	    	{
	    		if(listpos[i]==0) {b9.setIcon(imgmodf1);tabcorr0.add("3,3"); }
	    		else if(listpos[i]==1) {b9.setIcon(imgmodf2);tabcorr1.add("3,3"); }
	    		else if(listpos[i]==2) {b9.setIcon(imgmodf3);tabcorr2.add("3,3"); }
	    		else if(listpos[i]==3) {b9.setIcon(imgmodf4);tabcorr3.add("3,3"); }
	    		else { b9.setIcon(imgmodf5);tabcorr4.add("3,3");  }
	    	}
	    	
	    }
		 	b10.setEnabled(false);
		 Timer chrono =new Timer();
		 chrono.schedule(new TimerTask()
				 {
			 public void run()
			 {
				b1.setIcon(null); 
				b2.setIcon(null); 
				b3.setIcon(null); 
				b4.setIcon(null); 
				b5.setIcon(null); 
				b6.setIcon(null); 
				b7.setIcon(null); 
				b8.setIcon(null); 
				b9.setIcon(null); 
			 }
				 }
				 ,2000);
		 System.out.println("tables de corr");
			System.out.println(tabcorr0);
			System.out.println(tabcorr1);
			System.out.println(tabcorr2);
			System.out.println(tabcorr3);
			System.out.println(tabcorr4);
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
		else {b1.setIcon(imgmodf5);l2.setText("game over !!");
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
		
		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("bravo");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) { 
					l2.setText("tu as gagné");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice step !!");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				 if(trouve==4)
					{l2.setText("tu as gagné");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
					intermediaire.clear();
				}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				 if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("bravo");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				 if(trouve==4)
					{l2.setText("tu as gagné");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				 if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("bravo");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4)
					{l2.setText("tu as gagné");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
					intermediaire.clear();
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
							else if(intermediaire.get(0)=="1,2") {b4.setIcon(null);}
							else if(intermediaire.get(0)=="2,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="2,3") {b8.setIcon(null);}
							else {b9.setIcon(null);}
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
	else {b2.setIcon(imgmodf5);l2.setText("game over !!");
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

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step!!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
					intermediaire.clear();
				}
			}
			
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
					intermediaire.clear();
				}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4){
					l2.setText("Level 2 accomplished successfully");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
					intermediaire.clear();
				}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
					intermediaire.clear();
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
							else if(intermediaire.get(0)=="1,2") {b4.setIcon(null);}
							else if(intermediaire.get(0)=="2,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="2,3") {b8.setIcon(null);}
							else {b9.setIcon(null);}
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
	else {b3.setIcon(imgmodf5);l2.setText("game over !!");
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
		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{	
					l2.setText("Nice Step !!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
					intermediaire.clear();
			}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {l2.setText("Level 2 accomplished successfully");
				b3.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
				else {b9.setEnabled(false);}
				int choix=confirmer();
				if(choix==JOptionPane.YES_OPTION)
				{b12.setVisible(true);
				confirmer1();}
				else dispose();
				intermediaire.clear();
			}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {l2.setText("Level 2 accomplished successfully");
				b3.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
				else {b9.setEnabled(false);}
				int choix=confirmer();
				if(choix==JOptionPane.YES_OPTION)
				{b12.setVisible(true);
				confirmer1();}
				else dispose();
				intermediaire.clear();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {l2.setText("Level 2 accomplished successfully");
				b3.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
				else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
				else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
				else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
				else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
				else {b9.setEnabled(false);}
				int choix=confirmer();
				if(choix==JOptionPane.YES_OPTION)
				{b12.setVisible(true);
				confirmer1();}
				else dispose();
				intermediaire.clear();
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
							else if(intermediaire.get(0)=="1,2") {b4.setIcon(null);}
							else if(intermediaire.get(0)=="2,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="2,3") {b8.setIcon(null);}
							else {b9.setIcon(null);}
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
	if(listpos[3]==0) {b4.setIcon(imgmodf1);intermediaire.add("1,2");}
	else if(listpos[3]==1) {b4.setIcon(imgmodf2);intermediaire.add("1,2");}
	else if(listpos[3]==2) {b4.setIcon(imgmodf3);intermediaire.add("1,2");}
	else if(listpos[3]==3) {b4.setIcon(imgmodf4);intermediaire.add("1,2");}
	else {b4.setIcon(imgmodf5);l2.setText("game over !!");
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
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
					
					l2.setText("Nice Step !!");
					b4.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b4.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b4.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 	intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b4.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b4.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 	intermediaire.clear();
				}
				if(trouve==4) {l2.setText("Level 2 accomplished successfully");
				b4.setEnabled(false);
				 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
				 int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
				intermediaire.clear();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					 l2.setText("Nice Step !!");
						b4.setEnabled(false);
						 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
							else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
							else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
							else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
							else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
							else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
							else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
							else {b9.setEnabled(false);}
						 	intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b4.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
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
							else if(intermediaire.get(0)=="2,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="2,3") {b8.setIcon(null);}
							else {b9.setIcon(null);}
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
	if(listpos[4]==0) {b5.setIcon(imgmodf1);intermediaire.add("2,2");}
	else if(listpos[4]==1) {b5.setIcon(imgmodf2);intermediaire.add("2,2");}
	else if(listpos[4]==2) {b5.setIcon(imgmodf3);intermediaire.add("2,2");}
	else if(listpos[4]==3) {b5.setIcon(imgmodf4);intermediaire.add("2,2");}
	else {b5.setIcon(imgmodf5);l2.setText("game over !!");
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
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b5.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b5.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
			
				 if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b5.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b5.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b5.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
				b5.setEnabled(false);
				 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
					else {b9.setEnabled(false);}
				 int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b12.setVisible(true);
					confirmer1();}
					else dispose();
				intermediaire.clear();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					 l2.setText("Nice Step !!");
						b5.setEnabled(false);
						 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
							else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
							else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
							else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
							else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
							else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
							else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
							else {b9.setEnabled(false);}
						 intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b5.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
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
							else if(intermediaire.get(0)=="1,2") {b4.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="2,3") {b8.setIcon(null);}
							else {b9.setIcon(null);}
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
	if(listpos[5]==0) {b6.setIcon(imgmodf1);intermediaire.add("3,2");}
	else if(listpos[5]==1) {b6.setIcon(imgmodf2);intermediaire.add("3,2");}
	else if(listpos[5]==2) {b6.setIcon(imgmodf3);intermediaire.add("3,2");}
	else if(listpos[5]==3) {b6.setIcon(imgmodf4);intermediaire.add("3,2");}
	else {b6.setIcon(imgmodf5);l2.setText("game over !!");
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
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
					
					l2.setText("Nice Step !!");
					b6.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b6.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b6.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b6.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b6.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b6.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					 l2.setText("Nice Step !!");
						b6.setEnabled(false);
						 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
							else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
							else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
							else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
							else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
							else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
							else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
							else {b9.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b6.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();			}
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
							else if(intermediaire.get(0)=="2,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="1,2") {b4.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="2,3") {b8.setIcon(null);}
							else {b9.setIcon(null);}
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
	if(listpos[6]==0) {b7.setIcon(imgmodf1);intermediaire.add("1,3");}
	else if(listpos[6]==1) {b7.setIcon(imgmodf2);intermediaire.add("1,3");}
	else if(listpos[6]==2) {b7.setIcon(imgmodf3);intermediaire.add("1,3");}
	else if(listpos[6]==3) {b7.setIcon(imgmodf4);intermediaire.add("1,3");}
	else {b7.setIcon(imgmodf5);l2.setText("game over !!");
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
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
					
					l2.setText("Nice Step !!");
					b7.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b7.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b7.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b7.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b7.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b7.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					 l2.setText("Nice Step !!");
						b7.setEnabled(false);
						 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
							else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
							else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
							else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
							else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
							else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
							else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
							else {b9.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b7.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else if(intermediaire.get(0)=="2,3") {b8.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();		}
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
							else if(intermediaire.get(0)=="2,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="1,2") {b4.setIcon(null);}
							else if(intermediaire.get(0)=="2,3") {b8.setIcon(null);}
							else {b9.setIcon(null);}
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
	if(listpos[7]==0) {b8.setIcon(imgmodf1);intermediaire.add("2,3");}
	else if(listpos[7]==1) {b8.setIcon(imgmodf2);intermediaire.add("2,3");}
	else if(listpos[7]==2) {b8.setIcon(imgmodf3);intermediaire.add("2,3");}
	else if(listpos[7]==3) {b8.setIcon(imgmodf4);intermediaire.add("2,3");}
	else {b8.setIcon(imgmodf5);l2.setText("game over !!");
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
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
				
					
					l2.setText("Nice Step !!");
					b8.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b8.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b8.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b8.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b4.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b8.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else {b9.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b8.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b4.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					 l2.setText("Nice Step !!");
				b8.setEnabled(false);
				 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
					else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
					else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
					else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
					else {b9.setEnabled(false);}
				intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b8.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b4.setEnabled(false);}
						else {b9.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();		}
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
							else if(intermediaire.get(0)=="2,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="1,2") {b4.setIcon(null);}
							else {b9.setIcon(null);}
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
	if(listpos[8]==0) {b9.setIcon(imgmodf1);intermediaire.add("3,3");}
	else if(listpos[8]==1) {b9.setIcon(imgmodf2);intermediaire.add("3,3");}
	else if(listpos[8]==2) {b9.setIcon(imgmodf3);intermediaire.add("3,3");}
	else if(listpos[8]==3) {b9.setIcon(imgmodf4);intermediaire.add("3,3");}
	else {b9.setIcon(imgmodf5);l2.setText("game over !!");
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
		

		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
				
					
					l2.setText("Nice Step !!");
					b9.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else {b8.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b9.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else {b8.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b9.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else {b8.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b9.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,4") {b4.setEnabled(false);}
						else {b8.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr2.get(0)) && intermediaire.contains(tabcorr2.get(1)))
			{
				trouve++;
				if(trouve==1||trouve==2||trouve==3)
				{
					l2.setText("Nice Step !!");
					b9.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else {b8.setEnabled(false);}
					intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b9.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else {b8.setEnabled(false);}
					 int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();}
						else dispose();
					intermediaire.clear();
			}
			}
			else if(intermediaire.contains(tabcorr3.get(0)) && intermediaire.contains(tabcorr3.get(1)))
			{
				trouve++;
				
				 if(trouve==1||trouve==2||trouve==3)
				{
					 l2.setText("Nice Step !!");
						b9.setEnabled(false);
						 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
							else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
							else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
							else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
							else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
							else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
							else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
							else {b8.setEnabled(false);}
						intermediaire.clear();
				}
				if(trouve==4) {
					l2.setText("Level 2 accomplished successfully");
					b9.setEnabled(false);
					 if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
						else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
						else if(intermediaire.get(0)=="3,1") {b3.setEnabled(false);}
						else if(intermediaire.get(0)=="2,2") {b5.setEnabled(false);}
						else if(intermediaire.get(0)=="3,2") {b6.setEnabled(false);}
						else if(intermediaire.get(0)=="1,3") {b7.setEnabled(false);}
						else if(intermediaire.get(0)=="1,2") {b4.setEnabled(false);}
						else {b8.setEnabled(false);}
					 	int choix=confirmer();
						if(choix==JOptionPane.YES_OPTION)
						{b12.setVisible(true);
						confirmer1();
						}
						else dispose();
					intermediaire.clear();
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
							else if(intermediaire.get(0)=="2,2") {b5.setIcon(null);}
							else if(intermediaire.get(0)=="3,2") {b6.setIcon(null);}
							else if(intermediaire.get(0)=="1,3") {b7.setIcon(null);}
							else if(intermediaire.get(0)=="1,2") {b4.setIcon(null);}
							else {b8.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});

b11.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		dispose();
	}
		});
b12.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
	dispose();
new Memorisationl3();

}
});
	    pan1.add(b1);
		pan1.add(b2);
		pan1.add(b3);
		pan1.add(b4);
		pan1.add(b5);
		pan1.add(b6);
		pan1.add(b7);
		pan1.add(b8);
		pan1.add(b9);
		pan3.add(l1);
		pan3.add(l2);
		pan2.add(pan3);
		pan2.add(b10);
		pan2.add(b12);
		pan2.add(b11);
	
		add(pan1,BorderLayout.CENTER);
		add(pan2,BorderLayout.SOUTH);
		setVisible(true);
		}
	public int confirmer()
	{
		return JOptionPane.showConfirmDialog(this,"Very good!! \n you won  this level \nDo you want to go to the next level ?","confirmation",JOptionPane.YES_NO_OPTION);

	}
	public void confirmer1()
	{
		 JOptionPane.showMessageDialog(this,"Pay attention next Level will involve a chronometer !!","Warrning",JOptionPane.DEFAULT_OPTION);

	}


}
