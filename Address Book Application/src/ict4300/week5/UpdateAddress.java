package ict4300.week5;

import java.util.List;

public class UpdateAddress implements Command {
  
  private final Address address;
  private final int index;
  
  public UpdateAddress(int index, List<String> args) {
    this.index  = index;
    if (args.size() == 5) {
      address = new Address(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4));
    } else {
      address = null;
    }
  }

  @Override
  public Address runCommand(AddressBook addressBook) {
    if (address != null) {
      addressBook.update(index, address);
    }
    return address;
  }

}
