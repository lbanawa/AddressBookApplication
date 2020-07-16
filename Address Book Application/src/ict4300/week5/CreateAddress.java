package ict4300.week5;

import java.util.List;

public class CreateAddress implements Command {
  
  private final Address address;
  
  public CreateAddress(List<String> args) {
    if (args.size() == 5) {
      address = new Address(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4));
    } else {
      address = null;
    }
  }

  @Override
  public Address runCommand(AddressBook addressBook) {
    if (address != null) {
      addressBook.add(address);
    }
    return address;
  }

}
