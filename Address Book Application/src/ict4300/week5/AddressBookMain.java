package ict4300.week5;

import java.io.PrintWriter;
import java.io.Reader;
import java.io.InputStreamReader;

public class AddressBookMain {
  
  public static void main(String[] args) {
    System.out.println("Start of Program.");
    
    Reader reader = new InputStreamReader(System.in);
    PrintWriter printWriter = new PrintWriter(System.out);
        
    
    AddressBook addressBook = new AddressBook();
    CommandReader commandReader = new CommandReader(reader, printWriter);
    
      Command command = commandReader.readNext();
      while (command != null) {
        String retString = command.runCommand(addressBook);
//        Address address = command.runCommand(addressBook);
        
        System.out.println (retString);
        //System.out.println (address);
        
        command = commandReader.readNext();
      }
   
  }
  


}

//public class AddressBookMain {
//
//  public static void main(String[] args) {
//    System.out.println("Start of Program.");
//    
//    // Add some addresses
//    Address lauren = new Address("Lauren", "123 Street", "Tampa", "Florida", "33647");
//    System.out.println("Contact Address: " + lauren.getAddress());
//    
//    Address nori = new Address("Nori", "456 Cat Lane", "Orlando", "Florida", "34747");
//    System.out.println("Contact Address: " + nori.getAddress());
//    
//    AddressBook addressBook = new AddressBook();
//    addressBook.add(lauren);
//    addressBook.add(nori);
//    
//    List<Address> addresses = addressBook.getAll();
//    
//    System.out.println(addresses);
//    
//    List<String> cmdargs = new ArrayList<>();
//    cmdargs.add("Kenny");
//    cmdargs.add("202 Fish Creek");
//    cmdargs.add("Somerset");
//    cmdargs.add("Kentucky");
//    cmdargs.add("30405");
//    
//    
//    UpdateAddress cmd = new UpdateAddress(1, cmdargs);
//    cmd.runCommand(addressBook);
//    
//    System.out.println(addressBook.getAll());
//    
//    
//    List<String> addargs = new ArrayList<>();
//    addargs.add("Jack");
//    addargs.add("111 Timid Lane");
//    addargs.add("Apopka");
//    addargs.add("Florida");
//    addargs.add("32501");
//    
//    CreateAddress add = new CreateAddress(addargs);
//    add.runCommand(addressBook);
//    
//    System.out.println(addressBook.getAll());
//    
//    
//    int getargs = 1;
//    
//    GetAddress get = new GetAddress(getargs);
//    get.runCommand(addressBook);
//    
//    System.out.println(addressBook.get(1));
//  }
//
//}
