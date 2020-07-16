package ict4300.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook {
  private final List<Address> addressBook;
  
  
  public AddressBook() {
    addressBook = new ArrayList<>();
  }
  
  public int getSize() {
    return addressBook.size();
  }
  
  public void add(Address a) {
    addressBook.add(a);
  }
  
  public Address get(int index) {
    return addressBook.get(index);
  }
  
  public Address update(int index, Address a) {
    return addressBook.set(index, a);
  }
  
  public List<Address> getAll() {
    return Collections.unmodifiableList(addressBook);
  }
  
  public Address remove(int index) {
    return addressBook.remove(index);
  }
  
}


