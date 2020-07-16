package ict4300.week5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddressBookTest {
  
  private final Address lauren = new Address("Lauren", "123 Street", "Tampa", "Florida", "33647");
  private final Address nori = new Address("Nori", "456 Cat Lane", "Orlando", "Florida", "34747");
  private AddressBook addressBook;

  @BeforeEach
  void setUp() throws Exception {
    addressBook = new AddressBook();
  }
  
  @Test
  void testEmptyToStartWith() {
    assertEquals(0, addressBook.getSize());
  }
  
  @Test
  void testAdd() {
    addressBook.add(lauren);
    assertEquals(1, addressBook.getSize());
    assertEquals(lauren, addressBook.get(0));
  }
  
  @Test
  void testRemove() {
    addressBook.add(lauren);
    addressBook.remove(0);
    assertEquals(0, addressBook.getSize());
  }
  
  @Test
  void testMoreRemove() {
    addressBook.add(lauren);
    addressBook.add(nori);
    assertEquals(nori, addressBook.get(1));
    addressBook.remove(0);
    assertEquals(1, addressBook.getSize());
    assertEquals(nori, addressBook.get(0));
  }

}
