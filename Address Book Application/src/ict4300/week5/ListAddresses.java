package ict4300.week5;

public class ListAddresses implements Command {

  @Override
  public String runCommand(AddressBook addressBook) {
    return addressBook.getAll().toString();
 }
}
  
