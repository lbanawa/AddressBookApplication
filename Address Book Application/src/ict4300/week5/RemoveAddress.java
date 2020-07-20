package ict4300.week5;

public class RemoveAddress implements Command {
  
  private final int id_;
  
  public RemoveAddress(int index) {
    id_ = index;
  }

  @Override
  public String runCommand(AddressBook addressBook) {
    if (id_ >= 0 && id_ < addressBook.getSize()) {
      addressBook.remove(id_);
    }
    return String.format("Address ID %s Removed", id_);
  }
}
