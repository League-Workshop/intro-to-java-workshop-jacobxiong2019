package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		int score = 0;
		String answer = JOptionPane.showInputDialog("what is 1+1?");
		if(answer.equals("2"))
		{
			score++;
			speak("Correct!");
		}
		else
		{
			speak("Wrong!");
		}
		String answer1 = JOptionPane.showInputDialog("what is 2+2?");
		if(answer1.equals("4"))
		{
			score++;
			speak("Correct!");
		}
		else
		{
			speak("Wrong!");
		}
		String answer2 = JOptionPane.showInputDialog("what is 4+4?");
		if(answer2.equals("8"))
		{
			score++;
			speak("Correct!");
		}
		else
		{
			speak("Wrong!");
		}
		String answer3 = JOptionPane.showInputDialog("what is 8+8?");
		if(answer3.equals("16"))
		{
			score++;
			speak("Correct!");
		}
		else
		{
			speak("Wrong!");
		}
		JOptionPane.showMessageDialog(null, "Your final score was " + score);
	}static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}

}
