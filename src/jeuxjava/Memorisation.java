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
public class Memorisation extends JFrame{
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
	JLabel l1;
	JLabel l2;
	JLabel l3;
	Random r;
	Integer listpos[];
	int i;
	int pos0;
	int pos1;
	Image img1;
	Image img2;
	Image img3;
	Image imgmod1;
	Image imgmod2;
	Image imgmod3;
	ImageIcon imgmodf1;
	ImageIcon imgmodf2;
	ArrayList <String> tabcorr0;
	ArrayList <String> tabcorr1;
	ArrayList <String> intermediaire;
	int trouve;
	Memorisation()
		{
		trouve=0;
		intermediaire=new ArrayList();
		tabcorr0=new ArrayList();
		tabcorr1=new ArrayList();
		setSize(700,700);
		setTitle("Memorisation");
		pan1=new JPanel(new GridLayout(2,2));
		pan2=new JPanel(new GridLayout(5,1));
		pan3=new JPanel();
		l1=new JLabel("result :");
		l2=new JLabel("--------------------");
		b1=new JButton();
		b2=new JButton();
		b3=new JButton();
		b4=new JButton();
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5=new JButton("start");
		b6= new JButton("exit");
		b7= new JButton("next");
		b7.setVisible(false);
		img1= Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\fleur.png");
		img2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\voiture_eco.png");
		img3 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\YM.jpg");
	    imgmod1=img1.getScaledInstance(160, 160, Image.SCALE_SMOOTH);
	    imgmod2=img2.getScaledInstance(160, 160, Image.SCALE_SMOOTH);
	    imgmod3=img3.getScaledInstance(30,30, Image.SCALE_SMOOTH);
	    imgmodf1 =new ImageIcon(imgmod1);
	    imgmodf2 =new ImageIcon(imgmod2);
	    this.setIconImage(imgmod3);
	    r=new Random();
	    listpos= new Integer[4];
	    for (i=0;i<4;i++)System.out.println(listpos[i]+"/");
	    ///0 positions :
	    
	    for (i=0;i<2;i++)
	    {
	    pos0=r.nextInt(4);	
	    if(listpos[pos0]!=null) {
	    	while(listpos[pos0]!=null)pos0=r.nextInt(4);
	    }
	    listpos[pos0]=0;
	    }
	    /// 1 positions :
	    for (i=0;i<2;i++)
	    {
	    pos1=r.nextInt(4);	
	    if(listpos[pos1]!=null) {
	    	while(listpos[pos1]!=null)pos1=r.nextInt(4);
	    }
	    listpos[pos1]=1;
	    }
	    System.out.println("apres");
	    for (i=0;i<4;i++) System.out.println(listpos[i]+"/");
	    b5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
	 	{
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
		 	for (i=0;i<4;i++) {
	    	if(i==0) 
	    	{
	    		if(listpos[i]==0) {b1.setIcon(imgmodf1);tabcorr0.add("1,1");}
	    		else {b1.setIcon(imgmodf2);tabcorr1.add("1,1");}
	    	}
	    	else if(i==1)
	    	{
	    		if(listpos[i]==0) {b2.setIcon(imgmodf1);tabcorr0.add("2,1");}
	    		else {b2.setIcon(imgmodf2);tabcorr1.add("2,1"); }
	    	}
	    	else if(i==2)
	    	{
	    		if(listpos[i]==0) {b3.setIcon(imgmodf1);tabcorr0.add("1,2"); }
	    		else { b3.setIcon(imgmodf2);tabcorr1.add("1,2"); }
	    	}
	    	else
	    	{
	    		if(listpos[i]==0) {b4.setIcon(imgmodf1);tabcorr0.add("2,2"); }
	    		else { b4.setIcon(imgmodf2);tabcorr1.add("2,2");  }
	    	}
	    	
	    }
		 	b5.setEnabled(false);
		 Timer chrono =new Timer();
		 chrono.schedule(new TimerTask()
				 {
			 public void run()
			 {
				b1.setIcon(null); 
				b2.setIcon(null); 
				b3.setIcon(null); 
				b4.setIcon(null); 
			 }
				 }
				 ,1000);
	 	}
		}
	 );
	  
	   
b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		if(listpos[0]==0) {b1.setIcon(imgmodf1);intermediaire.add("1,1");}
		else {b1.setIcon(imgmodf2);intermediaire.add("1,1");}
		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				if (trouve<1) {}
				else if(trouve==1)
				{
					l2.setText("bravo");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b3.setEnabled(false);}
					else {b4.setEnabled(false);}
					intermediaire.clear();
				}
				else { 
					l2.setText("tu as gagné");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b3.setEnabled(false);}
					else {b4.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b7.setVisible(true);}
					else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				if (trouve<1) {}
				else if(trouve==1)
				{
					l2.setText("bravo");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b3.setEnabled(false);}
					else {b4.setEnabled(false);}
					intermediaire.clear();
				}
				else {
					l2.setText("tu as gagné");
					b1.setEnabled(false);
					if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b3.setEnabled(false);}
					else {b4.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b7.setVisible(true);}
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
							else if(intermediaire.get(0)=="1,2") {b3.setIcon(null);}
							else {b4.setIcon(null);}
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
		else {b2.setIcon(imgmodf2);intermediaire.add("2,1");}
		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				if (trouve<1) {}
				else if(trouve==1)
				{
					l2.setText("Nice Step!!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b3.setEnabled(false);}
					else {b4.setEnabled(false);}
					intermediaire.clear();
				}
				else {
					l2.setText("Level 1 accomplished successfully");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b3.setEnabled(false);}
					else {b4.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b7.setVisible(true);}
					else dispose();
					intermediaire.clear();
				}
				}
			
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				if (trouve<1) {}
				else if(trouve==1)
				{
					l2.setText("Nice step!!");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b3.setEnabled(false);}
					else {b4.setEnabled(false);}
					intermediaire.clear();
				}
				else {
					l2.setText("Level 1 accomplished successfully");
					b2.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="1,2") {b3.setEnabled(false);}
					else {b4.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b7.setVisible(true);}
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
							else if(intermediaire.get(0)=="1,2") {b3.setIcon(null);}
							else {b4.setIcon(null);}
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
		if(listpos[2]==0) {b3.setIcon(imgmodf1);intermediaire.add("1,2");}
		else {b3.setIcon(imgmodf2);intermediaire.add("1,2");}
		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				if (trouve<1) {}
				else if(trouve==1)
				{	
					l2.setText("Nice Step");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else {b4.setEnabled(false);}
					intermediaire.clear();
				}
				else {
					l2.setText("Level 1 accomplished successfully");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else {b4.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b7.setVisible(true);}
					else dispose();
					intermediaire.clear();
			}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				if (trouve<1) {}
				else if(trouve==1)
				{
					l2.setText("Nice step!!");
					b3.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else {b4.setEnabled(false);}
					intermediaire.clear();
				}
				else {l2.setText("Level 1 accomplished successfully");
				b3.setEnabled(false);
				if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
				else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
				else {b4.setEnabled(false);}
				intermediaire.clear();
				int choix=confirmer();
				if(choix==JOptionPane.YES_OPTION)
				{b7.setVisible(true);}
				else dispose();
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
							else {b4.setIcon(null);}
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
		if(listpos[3]==0) {b4.setIcon(imgmodf1);intermediaire.add("2,2");}
		else {b4.setIcon(imgmodf2);intermediaire.add("2,2");}
		System.out.println(intermediaire);
		if(intermediaire.size()==2)
		{
			if(intermediaire.contains(tabcorr0.get(0)) && intermediaire.contains(tabcorr0.get(1)))
			{
				trouve++;
				if (trouve<1) {}
				else if(trouve==1)
				{
					l2.setText("Nice step!!");
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else {b3.setEnabled(false);}
					intermediaire.clear();
				}
				else {
					l2.setText("Level 1 accomplished successfully");
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else {b3.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b7.setVisible(true);}
					else dispose();
					intermediaire.clear();
					}
			}
			else if(intermediaire.contains(tabcorr1.get(0)) && intermediaire.contains(tabcorr1.get(1)))
			{
				trouve++;
				if (trouve<1) {}
				else if(trouve==1)
				{
					l2.setText("Nice step!!");
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else {b3.setEnabled(false);}
					intermediaire.clear();
				}
				else {
					l2.setText("Level 1 accomplished successfully");
					b4.setEnabled(false);
					if(intermediaire.get(0)=="1,1") {b1.setEnabled(false);}
					else if(intermediaire.get(0)=="2,1") {b2.setEnabled(false);}
					else {b3.setEnabled(false);}
					int choix=confirmer();
					if(choix==JOptionPane.YES_OPTION)
					{b7.setVisible(true);}
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
						else {b3.setIcon(null);}
						intermediaire.clear();
					 }
						 }
						 ,500);	
				}
		}	
	}
		});
	   
		/*b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);*/
		
		
		/*b1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				JFrame f=new JFrame();
				f.setSize(500,500);
				f.add(new Label("hello"));
				f.setVisible(true);
			}
				});*/
b6.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
}
});
b7.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		dispose();
		new MemorisationL2();
	}
		});
	    pan1.add(b1);
		pan1.add(b2);
		pan1.add(b3);
		pan1.add(b4);
		pan3.add(l1);
		pan3.add(l2);
		pan2.add(pan3);
		pan2.add(b5);
		pan2.add(b7);
		pan2.add(b6);
		
	
		add(pan1,BorderLayout.CENTER);
		add(pan2,BorderLayout.SOUTH);
		setVisible(true);
		}
	public int confirmer()
	{
		return JOptionPane.showConfirmDialog(this,"Very good!! \n you won  this level \nDo you want to go to the next level ?","confirmation",JOptionPane.YES_NO_OPTION);

	}
}