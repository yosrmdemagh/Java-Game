package jeuxjava;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class Menu  extends JFrame{
	JButton xo;
	JButton startxo;
	JButton memorisation;
	JButton startmemorisation;
	JButton exit;
	JPanel pan1;
	JPanel pan2;
	JPanel total;
	JLabel lxo;
	JLabel lmemorisation;
	JLabel game1;
	JLabel game2;
	JLabel l2;
	JLabel l1;
	Image img1;
	Image img2;
	Image img3;
	Image img4;
	Image img5;
	Image imgmod1;
	Image imgmod2;
	Image imgmod3;
	Image imgmod4;
	Image imgmod5;
	Icon imgmodf1;
	Icon imgmodf2;
	Icon imgmodf3;
	Icon imgmodf4;

	Menu()
	{
		 img1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\Fullscreen.png");
		 img2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\soundactivation.jpg");
		 img3 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\sounddesactivation.png");
		 img4 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\guide.png");
		 img5 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\YM.jpg");
		 imgmod1=img1.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		  imgmod2=img2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		  imgmod3=img3.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		  imgmod4=img4.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		  imgmod5=img5.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		  imgmodf1 =new ImageIcon(imgmod1);
		  imgmodf2 =new ImageIcon(imgmod2);
		  imgmodf3 =new ImageIcon(imgmod3);
		  imgmodf4 =new ImageIcon(imgmod4);
		  setSize(700,700);
		pan1=new JPanel();
		pan2=new JPanel();
		total=new JPanel();
		xo=new JButton("XO");
		startxo=new JButton("Start XO");
		startmemorisation=new JButton("Start Memorization");
		exit=new JButton("exit");
		memorisation=new JButton("Memorization"); 
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		menuBar.setPreferredSize(new Dimension(400, 50));
		JMenu menuFile = new JMenu("Parameter");
		JMenu menuEdit = new JMenu("Game Help");
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		JMenuItem menuItemFullscreen = new JMenuItem("Full Screen");
		menuItemFullscreen.setIcon(imgmodf1);
		JMenuItem menuItemOpen = new JMenuItem("Sound Activation");
		JMenuItem menuItemclose = new JMenuItem("Sound Desactivation");
		menuItemclose.setIcon(imgmodf3);
		menuItemOpen.setIcon(imgmodf2);
		menuFile.add(menuItemFullscreen);
		menuFile.add(menuItemOpen);
		JMenuItem menuItemxoguide = new JMenuItem("XO guide");
		JMenuItem menuItemmemorisationguide = new JMenuItem("Memorization Guide");
		menuItemxoguide.setIcon(imgmodf4);
		menuItemmemorisationguide.setIcon(imgmodf4);
		menuEdit.add(menuItemxoguide);
		menuEdit.add(menuItemmemorisationguide);
		menuItemOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				 try {
			            File audioFile = new File("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\Kosmorider-Night.mp3");
			            Clip clip = AudioSystem.getClip();
			            clip.open(AudioSystem.getAudioInputStream(audioFile));
			            clip.start();
			            Thread.sleep(clip.getMicrosecondLength() / 1000);
			        } catch (Exception e1) {
			            System.err.println("Error playing audio file: " + e1.getMessage());
			        }
				
			}});
		
		
		
		menuItemxoguide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					confirmer1();
					
				}});
		menuItemFullscreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				fullScreen();
				
			}});
		menuItemmemorisationguide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				confirmer2();
			}});
		
		startmemorisation.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
			new Memorisation();	
			}
				});
		startxo.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
	new xo();	
	}
		});
		xo.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		startxo.setEnabled(true);
		xo.setEnabled(false);
	}
		});
		memorisation.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent e)
	{
		startmemorisation.setEnabled(true);
		memorisation.setEnabled(false);
	}
		});
		
		game1=new JLabel("Game 1 :");
		game2=new JLabel("Game 2 :");
		//xo.setForeground(Color.RED);
		Image img1= Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\Tic-Tac-Toe-Game.Png");
		Image img2= Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bsi 220219\\eclipseworkspace\\jeuxjava\\src\\memorization_icon.png");
		Image imgmod1=img1.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		Image imgmod2=img2.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon imgmodf1 =new ImageIcon(imgmod1);
		ImageIcon imgmodf2 =new ImageIcon(imgmod2);
		l1=new JLabel("WELCOME");
		l1.setForeground(Color.BLUE);
		l1.setBorder(BorderFactory.createEtchedBorder());
		l1.setFont(new Font("Sans-serif",Font.BOLD,80));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l2=new JLabel("Choose your Game :");
		l2.setFont(new Font("Arial",Font.BOLD,50));
		l2.setBorder(BorderFactory.createEtchedBorder());
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		setLayout(new BorderLayout());
		startmemorisation.setEnabled(false);
		startxo.setEnabled(false);
		total.setLayout(new GridLayout(4,1));
		pan1.add(game1);
		pan1.add(xo);
		startxo.setIcon(imgmodf1);
		startmemorisation.setIcon(imgmodf2);
		xo.setPreferredSize(new Dimension(100,70));
		memorisation.setPreferredSize(new Dimension(120,70));
		pan1.add(startxo);
		pan2.add(game2);
		pan2.add(memorisation);
		pan2.add(startmemorisation);
		total.add(l1);
		total.add(l2);
		total.add(pan1);
		total.add(pan2);
		add(total,BorderLayout.NORTH);
		this.setIconImage(imgmod5);
		setVisible(true);
	}
	public void confirmer1()
	{
		 JOptionPane.showMessageDialog(this,"The game starts with an empty grid.\n The first player, who is usually X, places their symbol\n in an empty square. Then, the second player, \nwho is usually O, places their symbol in another empty square.\n The players take turns placing their symbols until\n one of them wins, or the game ends in a tie.\r\n"
		 		+ "\r\n"
		 		+ "The game is won by getting three of your symbols\n in a row, either horizontally, vertically, or diagonally.\n If all of the squares on the grid are filled and \nno one has won, the game ends in a tie.","XO Help",JOptionPane.DEFAULT_OPTION);

	}
	public void confirmer2()
	{
		 JOptionPane.showMessageDialog(this,"The game starts when you press the 'start' button.\n This game is divided into three levels:\r\n"
		 		+ "\r\n"
		 		+ "Level 1: It is the easiest level, composed of 4 images.\n You have to select two similar images consecutively.\n Once you finish this task correctly, a new button\n named 'next' appears. You can now jump to the next level.\r\n"
		 		+ "\r\n"
		 		+ "Level 2: It is more difficult than the previous level,\n composed of 9 images.\n It includes 4 pairs of similar photos and a bomb image.\n If you press the button that contains the bomb,\n the game will be over, and you will lose this level.\n If you match the 4 pairs correctly, you will be able\n to jump to the 3rd level.\r\n"
		 		+ "\r\n"
		 		+ "Level 3: It is the most challenging level since it involves\n using a chronometer (you have just 64 seconds).\n This level includes 16 images, among them 6 pairs of similar\n photos and 4 bomb images. So, be careful!!.","Memorization Help",JOptionPane.DEFAULT_OPTION);

	}
	public void fullScreen()
	{
		setSize(1400,800);
	}
}
