import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean continueOperation = true;

    String clientName = "Joao";
    String accountType = "Current";
    double accountBalance = 2500.00;

    System.out.println("******************************");
    System.out.println("Name: " + clientName);
    System.out.println("Account type: " + accountType);
    System.out.println("Account balance: " + accountBalance);
    System.out.println("******************************");

    System.out.println();
    while (continueOperation) {
      System.out.println("Operations: ");
      System.out.println();

      System.out.println("1 - Check balances");
      System.out.println("2 - Receive values");
      System.out.println("3 - Transfer values");
      System.out.println("4 - Exit");
      System.out.println();

      System.out.print("Choose an operation: ");
      int operation = sc.nextInt();

      if (operation == 1) {
        System.out.println("The current balance is " + accountBalance);
      } else if (operation == 2) {
        System.out.print("Insert the value to be received: ");
        double valueToBeReceived = sc.nextDouble();
        if (valueToBeReceived >= 0.1) {
          accountBalance = (accountBalance + valueToBeReceived);
          System.out.println("Updated balance " + accountBalance);
        } else {
          System.out.println("The value to be received must be positive");
        }
      } else if (operation == 3) {
        System.out.print("Insert the value to be transferred: ");
        double valueToBeTransferred = sc.nextDouble();
        if (valueToBeTransferred <= accountBalance) {
          System.out.println("Updated balance " + (accountBalance - valueToBeTransferred));
        } else {
          System.out.println("Value not available to make this transfer");
        }
      } else if (operation == 4) {
        continueOperation = false;
        System.out.println("Operation closed");
      } else {
        System.out.println("Invalid operation");
      }
    }

    sc.close();
  }
}
