package ict4300.week5;

import java.util.Objects;

public class Address {
  
  private final String name;
  private final String street;
  private final String city;
  private final String state;
  private final String zip;
  
  public Address(String name, String street, String city, String state, String zip) {
    this.name = name;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }
  
  public String getAddress() {
    return String.format("%s, %s, %s, %s, %s", name, street, city, state, zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, name, state, street, zip);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Address)) {
      return false;
    }
    Address other = (Address) obj;
    return Objects.equals(city, other.city) && Objects.equals(name, other.name)
        && Objects.equals(state, other.state) && Objects.equals(street, other.street)
        && Objects.equals(zip, other.zip);
  }

  @Override
  public String toString() {
    return "Address [name=" + name + ", street=" + street + ", city=" + city + ", state=" + state
        + ", zip=" + zip + "]";
  }
  
}
