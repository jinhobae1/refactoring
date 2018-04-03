package refactoring.chapter12;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import refactoring.chapter12.Graph.GraphType;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class IntegerDisplay extends JFrame implements ActionListener, ValueListener {

	private JPanel contentPane;
	private Value value;
	private JLabel lbl10ctal;
	private JLabel lblDecimal;
	private JLabel lblHexaDecimal;
	private JButton btnIncrement;
	private JButton btnDecrement;
	private JPanel northPanel;
	private Graph circleGraph;
	private Graph rectGraph;
	private JPanel panel;
	private JLabel lbl2Title;
	private JLabel lbl;

	public IntegerDisplay() {
		InitComponent();
		value = new Value(0);
		value.addValueListener(this);
		value.addValueListener(circleGraph);
		value.addValueListener(rectGraph);
	}

	private void InitComponent() {
		setTitle("integer Display");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		northPanel = new JPanel();
		contentPane.add(northPanel);
		northPanel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lbl8Title = new JLabel("8\uC9C4\uC218");
		northPanel.add(lbl8Title);
		lbl8Title.setHorizontalAlignment(SwingConstants.CENTER);

		lbl10ctal = new JLabel("0");
		northPanel.add(lbl10ctal);
		lbl10ctal.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl10Title = new JLabel("10\uC9C4\uC218");
		northPanel.add(lbl10Title);
		lbl10Title.setHorizontalAlignment(SwingConstants.CENTER);

		lblDecimal = new JLabel("0");
		northPanel.add(lblDecimal);
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl16Title = new JLabel("16\uC9C4\uC218");
		northPanel.add(lbl16Title);
		lbl16Title.setHorizontalAlignment(SwingConstants.CENTER);

		lblHexaDecimal = new JLabel("0");
		northPanel.add(lblHexaDecimal);
		lblHexaDecimal.setHorizontalAlignment(SwingConstants.CENTER);

		btnIncrement = new JButton("+");
		northPanel.add(btnIncrement);
		btnIncrement.addActionListener(this);
		btnIncrement.setFont(new Font("±¼¸²", Font.PLAIN, 20));

		btnDecrement = new JButton("-");
		northPanel.add(btnDecrement);
		btnDecrement.addActionListener(this);
		btnDecrement.setFont(new Font("±¼¸²", Font.PLAIN, 20));

		circleGraph = Graph.createGraph(GraphType.CIRCLE,100,100);
		contentPane.add(circleGraph);

		
		rectGraph = Graph.createGraph(GraphType.RECTANGLE,100,50);
		contentPane.add(rectGraph);
		
		panel = new JPanel();
		contentPane.add(panel);
		
		lbl2Title = new JLabel("2\uC9C4\uC218");
		panel.add(lbl2Title);
		
		lbl = new JLabel("0");
		panel.add(lbl);
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

	}

	@Override
	public void valueChanger(ValueChangeEvent e) {
		if (e.getSource() == value) {
			Value v = e.getSource();
			lbl10ctal.setText(Integer.toOctalString(this.value.getValue()));
			lblDecimal.setText(Integer.toString(this.value.getValue()));
			lblHexaDecimal.setText(Integer.toHexString(this.value.getValue()));
			lbl.setText(Integer.toBinaryString(this.value.getValue()));
		}

	}
}
