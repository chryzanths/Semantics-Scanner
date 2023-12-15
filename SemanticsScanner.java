import java.util.Scanner;
public class SemanticsScanner {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Source Language: ");
        String sourceCode = input.nextLine();

        String[] arraySplit1 = sourceCode.split(" ");

        // extracting the numbers/integers
        String alteredInput = sourceCode.replaceAll("[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz,='\"]", "").replaceAll(" ", "");

        // extracting only "" and ''
        String alteredInput3 = sourceCode.replaceAll("[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz,=;]"," ").replaceAll(" ", "");


      for (String stringArray : arraySplit1)
      {
          if (stringArray.equals("int") && !alteredInput.contains("."))
          {
              System.out.println("\nSemantically Correct!");
              System.out.println(stringArray + alteredInput);
          }
          else if (stringArray.equals("double") && alteredInput.contains("."))
          {
              System.out.println("\nSemantically Correct!");
              System.out.println(stringArray + alteredInput);
          }
          else if (stringArray.contains("String") && alteredInput3.equals("\"\"") || alteredInput3.equals("“”"))
          {
              System.out.println("\nSemantically Correct!");
              System.out.println(stringArray + alteredInput);
          }
          else if (stringArray.contains("char") && alteredInput3.equals("\'\'"))
          {
              System.out.println("\nSemantically Correct!");
          }
          else
          {
              System.out.println("\nSemantically Incorrect!");
              System.out.println(stringArray + alteredInput3);
          }
          break;
      }
    }
}


