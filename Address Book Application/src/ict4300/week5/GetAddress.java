package ict4300.week5;

public class GetAddress implements Command {
  
  private final Address address;
  private AddressBook addressBook;
  
  public GetAddress(int index) {
    if (index <= 0 && index > addressBook.getSize()) {
      //address is the address at that index position
      address = addressBook.get(index);
    } else {
      address = null;
    }
  }

  @Override
  public Address runCommand(AddressBook addressBook) {
    if (address != null) {
      return address;
    } else {
      return null;
    }
  }

}
