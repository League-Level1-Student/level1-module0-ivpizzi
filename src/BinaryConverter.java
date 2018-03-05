import javax.swing.JFrame;
import javax.swing.JPanel;

public class BinaryConverter 
{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public static void main(String[] args)
	{
		
		new BinaryConverter().createUI();
		
	}
	
	private void createUI()
	{
		
		frame.add(panel);
		frame.setVisible(true);
		
	}

}
