package pizzaOrder;

import java.util.Scanner;

class Pizza {

	  public String Name;
	  public String[] Ingredients;

	  public Pizza(String name, String[] ingredients) {
	    this.Name = name;
	    this.Ingredients = ingredients;
	  }

	  public void takePreference() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Select Ingredients: ");
	    System.out.println("Enter 1 for Yes and 0 for No");
	    for (int i = 0; i < this.Ingredients.length; i++) {
	      System.out.print("Do you want " + this.Ingredients[i] + "? ");
	      int ingredient = sc.nextInt();
	      if (ingredient != 1) {
	        this.Ingredients[i] = "";
	      }
	    }
	    System.out.println("Selected Ingredients: " + getIngredients() + "\n");
	  }

	  public String getIngredients() {
	    String ingredients = "";
	    int isFirst = 1;
	    for (int i = 0; i < this.Ingredients.length; i++) {
	      if (this.Ingredients[i] != "") {
	        ingredients += ((isFirst == 0) ? ", " : "") + this.Ingredients[i];
	        isFirst = 0;
	      }
	    }
	    return ingredients;
	  }
	}
