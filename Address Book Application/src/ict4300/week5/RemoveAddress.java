package ict4300.week5;

public class RemoveAddress implements Command {
  
  private final Address address;
  private AddressBook addressBook;
  
  public RemoveAddress(int index) {
    //
  }

  @Override
  public Address runCommand(AddressBook addressBook) {
    return address;
  }

}
