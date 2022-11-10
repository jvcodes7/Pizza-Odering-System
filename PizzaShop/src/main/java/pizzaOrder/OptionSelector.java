package pizzaOrder;

import java.util.Scanner;

class OptionSelector {

	  public String Name, Value;
	  public String[] Options;

	  public OptionSelector(String name, String[] options) {
	    this.Name = name;
	    this.Options = options;
	  }

	  public void selectOption() {
	    System.out.println("Select " + this.Name + ": ");
	    for (int i = 0; i < this.Options.length; i++) {
	      System.out.println((i + 1) + ". " + this.Options[i]);
	    }
	    System.out.print("Enter " + this.Name + ": ");
	    Scanner sc = new Scanner(System.in);
	    int option = sc.nextInt();
	    if (option > this.Options.length) {
	      System.out.println("Invalid " + this.Name + "\n");
	      this.selectOption();
	      return;
	    }
	    this.Value = this.Options[option - 1];
	    System.out.println("Selected " + this.Name + ": " + this.Value + "\n");
	  }

	  public String getValue() {
	    return this.Value;
	  }
	}
