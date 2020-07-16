package ict4300.week5;

public class ListAddresses implements Command {

  @Override
  public Address runCommand(AddressBook addressBook) {
    return (Address) addressBook.getAll();
 }
}
  
