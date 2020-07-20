package ict4300.week5;

public class GetAddress implements Command {
  
  private final int id_;
  
  public GetAddress(int index) {
      id_ = index;
  }

  @Override
  public String runCommand(AddressBook addressBook) {
    
    if (id_ >= 0 && id_ < addressBook.getSize()) {
      //address is the address at that index position
      return addressBook.get(id_).toString();
    } else {
      return null;
    }
  }
}



