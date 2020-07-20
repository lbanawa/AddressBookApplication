package ict4300.week5;

import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandReader {
  private static final int LENGTH = 5;
  private final Scanner scanner;
  private final PrintWriter output;
  
  public CommandReader(Reader input, PrintWriter output) {
    scanner = new Scanner(input);
    scanner.useDelimiter(System.lineSeparator());
    this.output = output;
  }
  
  public Command readNext() {
    String command;
    do {
      output.print("Please enter the command [create, get, list, update, remove, exit]: ");
      output.flush();
      command = scanner.next();
      
      if (command.toLowerCase().equals("list")) {
        return new ListAddresses();
      }
      
      if (command.toLowerCase().equals("get")) {
        return new GetAddress(getNumber());
      }
      
      if (command.toLowerCase().equals("remove")) {
        return new RemoveAddress(getNumber());
      }
      
      if (command.toLowerCase().equals("create")) {
        return new CreateAddress(getArgs());
      }
      
      if (command.toLowerCase().equals("update")) {
        return new UpdateAddress(getNumber(), getArgs());
      }
      
    } while (!command.toLowerCase().equals("exit"));
    return null;
  }
  
  private List<String> getArgs() {
    List<String> args = new ArrayList<>();
    output.println("Please enter the address as name, street, city, state, zip: ");
    output.flush();
    String line = scanner.next();
    
    for (String arg : line.split(", *")) {
      args.add(arg);
    }
    
    if (args.size() < LENGTH) {
      output.println("Please enter the address as name, street, city, state, zip: ");
    }
    return args;
  }
  
  private int getNumber() {
    output.print("Which address? Please enter a number: ");
    output.flush();
    return scanner.nextInt();
  }
  
}
