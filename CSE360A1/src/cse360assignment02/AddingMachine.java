package cse360assignment02;

public class AddingMachine {
  private int total;
  private String memory;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    memory = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  memory = memory + " + " + value;
	  return;
  }

  public void subtract (int value) {
	  total = total - value;
	  memory = memory + " - " + value;
	  return;
  }

  public String toString () {
    return memory;
  }

  public void clear() {
	  memory = "0";
	  return;
  }
}