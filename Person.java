
package assignment2;

public class Person 
{
    private String name;
     private String address;
     private int phone_number;
      private String emil_address;

    public Person(String name, String address, int phone_number, String emil_address)
    {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.emil_address = emil_address;
    }
   
      public String toString(String name)
      {
        return " Person :"+this.name; 
      }
      
}
