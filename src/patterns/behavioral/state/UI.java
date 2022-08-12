package patterns.behavioral.state;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI {
	
	private Player player;
	private static JTextField textfield = new JTextField();
	
	public UI(Player player) {
		this.player = player;
	}
	
	public void init() {
		JFrame frame = new JFrame("Test player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		JPanel context = new JPanel();
		context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
		frame.getContentPane().add(context);
		JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
		context.add(textfield);
		context.add(buttons);
		
		JButton play = new JButton("Play");
		play.addActionListener(e -> textfield.setText(player.getState().onPlay()));
		JButton stop = new JButton("Stop");
		stop.addActionListener(e -> textfield.setText(player.getState().onLock()));
		JButton next = new JButton("Next");
		next.addActionListener(e -> textfield.setText(player.getState().onNext()));
		JButton prev = new JButton("Previous");
		prev.addActionListener(e -> textfield.setText(player.getState().onPrevious()));
		
		frame.setVisible(true);
		frame.setSize(300, 100);
		
		buttons.add(play);
		buttons.add(stop);
		buttons.add(next);
		buttons.add(prev);
		
	}
	
}
