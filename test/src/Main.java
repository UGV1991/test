import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Enter numbers");
        Scanner scanner = new Scanner(System.in);
        String strValue = scanner.nextLine();

        var strArray = strValue.split(" ");
        if (strArray.length != 5 && strArray.length !=3)
        {
            throw new Exception("Limit Exceed");
        }

        var action01 = strArray[1];
        // var action02 = strArray[3];
        var num1 = Integer.parseInt(strArray[0]);
        var num2 = Integer.parseInt(strArray[2]);
        // var num3 = Integer.parseInt(strArray[4]);
        var result = switch (action01)
                {
            case ("+") -> num1 + num2;
            case ("-") -> num1 - num2;
            case ("*") -> num1 * num2;
            case ("/") -> num1 / num2;
            default -> throw new Exception("Wrong operation");
                };

        System.out.println(result);
    }
}



