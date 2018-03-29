package refactoring.chapter12;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class IntegerDisplay extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Value value;
	private JLabel lbl10ctal;
	private JLabel lblDecimal;
	private JLabel lblHexaDecimal;
	private JButton btnIncrement;
	private JButton btnDecrement;

	public IntegerDisplay() {
		InitComponent();
		
	}

	private void InitComponent() {
		setTitle("integer Display");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lbl8Title = new JLabel("8\uC9C4\uC218");
		lbl8Title.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl8Title);

		lbl10ctal = new JLabel("0");
		lbl10ctal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl10ctal);

		JLabel lbl10Title = new JLabel("10\uC9C4\uC218");
		lbl10Title.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl10Title);

		lblDecimal = new JLabel("0");
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDecimal);

		JLabel lbl16Title = new JLabel("16\uC9C4\uC218");
		lbl16Title.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl16Title);

		lblHexaDecimal = new JLabel("0");
		lblHexaDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHexaDecimal);

		btnIncrement = new JButton("+");
		btnIncrement.addActionListener(this);
		btnIncrement.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		contentPane.add(btnIncrement);

		btnDecrement = new JButton("-");
		btnDecrement.addActionListener(this);
		btnDecrement.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		contentPane.add(btnDecrement);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIncrement) {
			setValue(value.getValue() + 1);
		}
		if (e.getSource() == btnDecrement) {
			setValue(value.getValue() - 1);
		}
	}

	public int getValue() {
		return value.getValue();
	}

	public void setValue(int value) {
		this.value.setValue(value);
		lbl10ctal.setText(Integer.toOctalString(value));
		lblDecimal.setText(Integer.toOctalString(value));
		lblHexaDecimal.setText(Integer.toHexString(value));

	}

}
