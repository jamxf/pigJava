import javax.swing.JOptionPane;
public class pigJava
{
  public static void main(String [] args)
  {
    String userInput = "", pattern = "[a-zA-Z]{1,}";
    String firstChar = "", vowels  = "aeiou", result = "";
    boolean validInput = false;

    while (!(validInput))
    {
      userInput = JOptionPane.showInputDialog(null,"Enter word");
      if ((userInput == null) || (userInput.matches(pattern)))
          validInput = true;
      else
          JOptionPane.showMessageDialog(null,"Invalid Input");
    }

    if (userInput != null)
    {
      firstChar = (userInput.substring(0,1)).toLowerCase();
      if (vowels.indexOf(firstChar) != -1)
          result = userInput + "way";
      else
          result = userInput.substring(1)+firstChar+"ay";
      JOptionPane.showMessageDialog(null,result);
    }

  }
}
