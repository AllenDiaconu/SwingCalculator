package SwingCalculator;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.util.Stack;
import java.util.Scanner;

public class MainFrame extends JFrame {
	JTextField textField; // top field
	JTextField textField_1; // bottom field
	String aString; // was t
	String bString; // was g
	boolean flag;

	public MainFrame() {
		initialize();
	}

	public void initialize() {
		flag = true;
		setLayout(null);
		setSize(366, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator App");
		setResizable(false);
		setVisible(true);
		textField = new JTextField();
		textField.setBounds(1, 1, 349, 55);
		add(textField);
		textField.setEditable(false);
		textField_1 = new JTextField();
		textField_1.setBounds(1, 56, 349, 55);
		add(textField_1);
		textField_1.setEditable(false);

		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton decimal = new JButton(".");
		JButton equals = new JButton("=");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton times = new JButton("x");
		JButton division = new JButton("/");
		JButton ac = new JButton("AC");
		JButton backspace = new JButton("<=");
		JButton exp = new JButton("exp");
		JButton mod = new JButton("mod");
		JButton factorial = new JButton("n!");
		JButton closeParentheses = new JButton(")");
		JButton openParentheses = new JButton("(");
		JButton plusOrMinus = new JButton("+/-");
		JButton ln = new JButton("ln");
		JButton log = new JButton("log");
		JButton tenToPowX = new JButton("10^x");
		JButton xToPowY = new JButton("x^y");
		JButton sqrt = new JButton("sqrt");
		JButton absoluteValue = new JButton("|x|");
		JButton oneOverX = new JButton("1/x");
		JButton second = new JButton("2nd");
		JButton pi = new JButton("pi");
		JButton e = new JButton("e");
		JButton square = new JButton("x^2");
		JButton xToPowThree = new JButton("x^3");
		JButton cbrt = new JButton("cbrt");
		JButton xrt = new JButton("xrt");
		JButton twoPowX = new JButton("2^x");
		JButton logyX = new JButton("logyX");
		JButton eToPowX = new JButton("e^x");

		second.setBounds(0, 111, 70, 50);
		pi.setBounds(70, 111, 70, 50);
		e.setBounds(140, 111, 70, 50);
		ac.setBounds(210, 111, 70, 50);
		backspace.setBounds(280, 111, 70, 50);

		square.setBounds(0, 161, 70, 50);
		oneOverX.setBounds(70, 161, 70, 50);
		absoluteValue.setBounds(140, 161, 70, 50);
		exp.setBounds(210, 161, 70, 50);
		mod.setBounds(280, 161, 70, 50);

		sqrt.setBounds(0, 211, 70, 50);
		openParentheses.setBounds(70, 211, 70, 50);
		closeParentheses.setBounds(140, 211, 70, 50);
		factorial.setBounds(210, 211, 70, 50);
		division.setBounds(280, 211, 70, 50);

		log.setBounds(0, 361, 70, 50);
		b1.setBounds(70, 361, 70, 50);
		b2.setBounds(140, 361, 70, 50);
		b3.setBounds(210, 361, 70, 50);
		plus.setBounds(280, 361, 70, 50);

		tenToPowX.setBounds(0, 311, 70, 50);
		b4.setBounds(70, 311, 70, 50);
		b5.setBounds(140, 311, 70, 50);
		b6.setBounds(210, 311, 70, 50);
		minus.setBounds(280, 311, 70, 50);

		xToPowY.setBounds(0, 261, 70, 50);
		b7.setBounds(70, 261, 70, 50);
		b8.setBounds(140, 261, 70, 50);
		b9.setBounds(210, 261, 70, 50);
		times.setBounds(280, 261, 70, 50);

		ln.setBounds(0, 411, 70, 50);
		plusOrMinus.setBounds(70, 411, 70, 50);
		b0.setBounds(140, 411, 70, 50);
		decimal.setBounds(210, 411, 70, 50);
		equals.setBounds(280, 411, 70, 50);

		xToPowThree.setBounds(0, 161, 70, 50);
		cbrt.setBounds(0, 211, 70, 50);
		xrt.setBounds(0, 261, 70, 50);
		twoPowX.setBounds(0, 311, 70, 50);
		logyX.setBounds(0, 361, 70, 50);
		eToPowX.setBounds(0, 411, 70, 50);

		add(square);
		add(pi);
		add(e);
		add(second);
		add(oneOverX);
		add(xToPowY);
		add(b0);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(decimal);
		add(equals);
		add(plus);
		add(minus);
		add(times);
		add(division);
		add(ac);
		add(backspace);
		add(exp);
		add(mod);
		add(factorial);
		add(closeParentheses);
		add(openParentheses);
		add(plusOrMinus);
		add(ln);
		add(log);
		add(tenToPowX);
		add(sqrt);
		add(absoluteValue);
		add(xToPowThree);
		add(cbrt);
		add(xrt);
		add(twoPowX);
		add(logyX);
		add(eToPowX);

		second.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag = !flag;
				square.setVisible(!flag);
				sqrt.setVisible(!flag);
				xToPowY.setVisible(!flag);
				tenToPowX.setVisible(!flag);
				log.setVisible(!flag);
				ln.setVisible(!flag);
				square.setVisible(flag);
				sqrt.setVisible(flag);
				xToPowY.setVisible(flag);
				tenToPowX.setVisible(flag);
				log.setVisible(flag);
				ln.setVisible(flag);
			}
		});
		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput(".");
			}
		});
		e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("" + Math.E);
			}
		});
		pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("" + Math.PI);
			}
		});
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("0");
			}
		});
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("1");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("2");
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("3");
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("4");
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("5");
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("6");
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("7");
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("8");
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operandInput("9");
			}
		});

		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("+");
			}
		});
		times.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("*");
			}
		});
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("/");
			}
		});
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("-");
			}
		});
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("=");
			}
		});
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("%");
			}
		});
		square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("^2");
			}
		});
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("√");
			}
		});
		openParentheses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("(");
			}
		});
		closeParentheses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput(")");
			}
		});
		ln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("ln");
			}
		});
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("log");
			}
		});
		factorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("!");
			}
		});
		absoluteValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("||");
			}
		});
		plusOrMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("+/-");
			}
		});
		xToPowY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("^");
			}
		});
		tenToPowX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("10^");
			}
		});
		oneOverX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("1/");
			}
		});
		exp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("exp");
			}
		});
		xToPowThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("^3");
			}
		});
		cbrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("3√");
			}
		});
		xrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("x√");
			}
		});
		twoPowX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("2^");
			}
		});
		logyX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("logyX");
			}
		});
		eToPowX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operatorInput("e^");
			}
		});

		ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearTextField();
			}
		});
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearChar();
			}
		});
		clearTextField();
	}

	public void operandInput(String bInput) {
		bString = bString + bInput;
		textField.setText(bString); // top field
		textField_1.setText(bString); // bottom field
	}

	private void operatorInput(String bInput) {
		bString = bString + " " + bInput;
		if (bInput.equals("=")) {
			textField_1.setText(bString.substring(0, bString.length() - 2));
		} else {
			textField_1.setText(bString);
		}
		bString = bString + " ";
		StringTokenizer tokens = new StringTokenizer(bString, "(,),");
		while (tokens.hasMoreTokens()) {
			System.out.println("+++++" + tokens.nextToken());
		}
		if (bInput.equals("=")) {
			textField.setText(bString);
			textField_1.setText(doCalculation(bString));
			bString = doCalculation(bString);
		}
	}

	private String doCalculation(String gString) {
		String postfixString;
		String resultString = "";
		String item;
		postfixString = toPostfix(gString);
		Stack<Double> iStack = new Stack<Double>();
		Double operand_1, operand_2;
		StringTokenizer tokens = new StringTokenizer(postfixString);
		while (tokens.hasMoreTokens()) {
			item = tokens.nextToken();
			if (item.equals("+")) {
				operand_2 = iStack.pop();
				operand_1 = iStack.pop();
				iStack.push(operand_1 + operand_2);
			} else if (item.equals("-")) {
				operand_2 = iStack.pop();
				operand_1 = iStack.pop();
				iStack.push(operand_1 - operand_2);
			} else if (item.equals("*")) {
				operand_2 = iStack.pop();
				operand_1 = iStack.pop();
				iStack.push(operand_1 * operand_2);
			} else if (item.equals("/")) {
				operand_2 = iStack.pop();
				operand_1 = iStack.pop();
				iStack.push(operand_1 / operand_2);
			} else if (item.equals("logyX")) {

			} else if (item.equals("%")) {
				operand_2 = iStack.pop();
				operand_1 = iStack.pop();
				iStack.push(operand_1 % operand_2);
			} else if (item.equals("exp")) {
				operand_2 = iStack.pop();
				operand_1 = iStack.pop();
				if (operand_1 > 0) {
					iStack.push((operand_1 + Math.pow(10, operand_2)) - 1);
				} else {
					iStack.push(-1 * ((operand_1 + Math.pow(10, operand_2)) + 1));
				}
			} else if (item.equals("^2")) {
				operand_1 = iStack.pop();
				iStack.push(operand_1 * operand_1);
			} else if (item.equals("^3")) {
				operand_1 = iStack.pop();
				iStack.push(operand_1 * operand_1 * operand_1);
			} else if (item.equals("√")) {
				operand_1 = iStack.pop();
				iStack.push(Math.sqrt(operand_1));
			} else if (item.equals("3√")) {
				operand_1 = iStack.pop();
				iStack.push(Math.cbrt(operand_1));
			} else if (item.equals("x√")) {

			} else if (item.equals("2^")) {
				operand_1 = iStack.pop();
				iStack.push(Math.pow(2, operand_1));
			} else if (item.equals("e^")) {
				operand_1 = iStack.pop();
				iStack.push(Math.pow(Math.E, operand_1));
			} else if (item.equals("ln")) {
				operand_1 = iStack.pop();
				iStack.push(Math.log(operand_1));
			} else if (item.equals("^")) {
				operand_2 = iStack.pop();
				operand_1 = iStack.pop();
				iStack.push(Math.pow(operand_1, operand_2));
			} else if (item.equals("!")) {
				operand_1 = iStack.pop();
				double y = operand_1;
				double out = 1;
				if (operand_1 == 0) {
					out = 0;
				} else {
					for (int i = (int) y; i > 0; i--) {
						out *= i;
					}
				}
				iStack.push(out);
			} else if (item.equals("log")) {
				operand_1 = iStack.pop();
				iStack.push(Math.log10(operand_1));
			} else if (item.equals("||")) {
				operand_1 = iStack.pop();
				iStack.push(Math.abs(operand_1));
			} else if (item.equals("+/-")) {
				operand_1 = iStack.pop();
				iStack.push(operand_1 * -1);
			} else if (item.equals("10^")) {
				operand_1 = iStack.pop();
				iStack.push(Math.pow(10, operand_1));
			} else if (item.equals("1/")) {
				operand_1 = iStack.pop();
				iStack.push(1 / operand_1);
			} else {
				iStack.push(Double.parseDouble(item));
			}
		}
		resultString = iStack.pop().toString();
		return (resultString);
	}

	private String toPostfix(String gString) {
		String localString = gString;
		String postfixString = "";
		String item;
		Stack<String> lStack = new Stack<String>();
		StringTokenizer tokens = new StringTokenizer(localString);
		lStack.push("EOS");// End of Stack
		while (tokens.hasMoreTokens()) {
			item = tokens.nextToken();
			if (item.equals("+")) {
				while (isp(lStack.peek()) >= icp("+")) {
					postfixString = postfixString + lStack.pop() + " ";
				}
				lStack.push(item);
			} else if (item.equals("-")) {
				while (isp(lStack.peek()) >= icp("-"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("*")) {
				while (isp(lStack.peek()) >= icp("*"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("/")) {
				while (isp(lStack.peek()) >= icp("/"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("%")) {
				while (isp(lStack.peek()) >= icp("%"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("log")) {
				while (isp(lStack.peek()) >= icp("%"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("(")) {
				while (isp(lStack.peek()) >= icp("("))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("^2")) {
				while (isp(lStack.peek()) >= icp("^2"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("^3")) {
				while (isp(lStack.peek()) >= icp("^3"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("√")) {
				while (isp(lStack.peek()) >= icp("√"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("3√")) {
				while (isp(lStack.peek()) >= icp("3√"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("x√")) {
				while (isp(lStack.peek()) >= icp("x√"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("exp")) {
				while (isp(lStack.peek()) >= icp("exp"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("!")) {
				while (isp(lStack.peek()) >= icp("!"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("ln")) {
				while (isp(lStack.peek()) >= icp("ln"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("log")) {
				while (isp(lStack.peek()) >= icp("log"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("||")) {
				while (isp(lStack.peek()) >= icp("||"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("+/-")) {
				while (isp(lStack.peek()) >= icp("+/-"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("^")) {
				while (isp(lStack.peek()) >= icp("^"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("10^")) {
				while (isp(lStack.peek()) >= icp("10^"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("2^")) {
				while (isp(lStack.peek()) >= icp("2^"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("e^")) {
				while (isp(lStack.peek()) >= icp("e^"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals("1/")) {
				while (isp(lStack.peek()) >= icp("1/"))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.push(item);
			} else if (item.equals(")")) {
				while (!lStack.peek().equals("("))
					postfixString = postfixString + lStack.pop() + " ";
				lStack.pop();
			} else if (item.equals("=")) {
				while (lStack.peek() != "EOS")
					postfixString = postfixString + lStack.pop() + " ";
				lStack.pop();
			} else {
				postfixString = postfixString + item + " ";
			}
		}
		return (postfixString);
	}

	private int isp(String operator) {
		int ispvalue = 0;
		if (operator.equals("("))
			ispvalue = 0;
		if (operator.equals(")"))
			ispvalue = 19;
		if (operator.equals("+"))
			ispvalue = 12;
		if (operator.equals("-"))
			ispvalue = 12;
		if (operator.equals("*"))
			ispvalue = 13;
		if (operator.equals("/"))
			ispvalue = 13;
		if (operator.equals("1/"))
			ispvalue = 13;
		if (operator.equals("%"))
			ispvalue = 13;
		if (operator.equals("!"))
			ispvalue = 13;
		if (operator.equals("exp"))
			ispvalue = 13;
		if (operator.equals("^2"))
			ispvalue = 19;
		if (operator.equals("^3"))
			ispvalue = 19;
		if (operator.equals("10^"))
			ispvalue = 19;
		if (operator.equals("2^"))
			ispvalue = 19;
		if (operator.equals("e^"))
			ispvalue = 19;
		if (operator.equals("log"))
			ispvalue = 13;
		if (operator.equals("ln"))
			ispvalue = 13;
		if (operator.equals("√"))
			ispvalue = 13;
		if (operator.equals("3√"))
			ispvalue = 13;
		if (operator.equals("x√"))
			ispvalue = 13;
		if (operator.equals("||"))
			ispvalue = 13;
		if (operator.equals("^"))
			ispvalue = 13;
		if (operator.equals("+/-"))
			ispvalue = 13;
		if (operator.equals("EOS"))
			ispvalue = 0;
		return (ispvalue);
	}

	private int icp(String operator) {
		int icpvalue = 0;
		if (operator.equals("("))
			icpvalue = 20;
		if (operator.equals(")"))
			icpvalue = 19;
		if (operator.equals("+"))
			icpvalue = 12;
		if (operator.equals("-"))
			icpvalue = 12;
		if (operator.equals("*"))
			icpvalue = 13;
		if (operator.equals("/"))
			icpvalue = 13;
		if (operator.equals("1/"))
			icpvalue = 13;
		if (operator.equals("%"))
			icpvalue = 13;
		if (operator.equals("^2"))
			icpvalue = 19;
		if (operator.equals("^3"))
			icpvalue = 19;
		if (operator.equals("ln"))
			icpvalue = 13;
		if (operator.equals("log"))
			icpvalue = 13;
		if (operator.equals("√"))
			icpvalue = 13;
		if (operator.equals("3√"))
			icpvalue = 13;
		if (operator.equals("x√"))
			icpvalue = 13;
		if (operator.equals("||"))
			icpvalue = 13;
		if (operator.equals("!"))
			icpvalue = 13;
		if (operator.equals("exp"))
			icpvalue = 13;
		if (operator.equals("+/-"))
			icpvalue = 13;
		if (operator.equals("^"))
			icpvalue = 13;
		if (operator.equals("10^"))
			icpvalue = 13;
		if (operator.equals("2^"))
			icpvalue = 13;
		if (operator.equals("e^"))
			icpvalue = 13;
		return (icpvalue);
	}

	private void clearChar() {
		aString = textField.getText();
		if (aString.length() > 0) {
			aString = aString.substring(0, aString.length() - 1);
			textField.setText(aString);
			System.out.println(aString);
			bString = aString;
			textField_1.setText(bString);
			System.out.println(bString);
		}
	}

	private void clearTextField() {
		textField.setText("");
		textField_1.setText("");
		aString = "";
		bString = "";
	}
}