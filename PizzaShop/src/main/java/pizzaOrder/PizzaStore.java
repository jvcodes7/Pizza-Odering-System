package pizzaOrder;

import java.util.Scanner;



class pizzaStores {

	  public OptionSelector Cuisine, Category, Size, PizzaOptions;
	  public Pizza SelectedPizza;
	  public int Amount;

	   pizzaStores() {
	    

	    Cuisine = new OptionSelector("Cuisine", new String[] { "Regular", "Jain", "Non-veg" });
	    Category = new OptionSelector("Category", new String[] { "Classic", "Premium", "Supreme" });
	    Size = new OptionSelector("Size", new String[] { "Regular", "Medium", "Large" });

	    Cuisine.selectOption();
	    Category.selectOption();
	    Size.selectOption();

	    if (Category.getValue() == "Classic") {
	      PizzaOptions = new OptionSelector("Pizza", new String[] { "Tomchi", "Capanito" });
	    } else if (Category.getValue() == "Premium") {
	      PizzaOptions = new OptionSelector("Pizza", new String[] { "Red Indian", "Party Lovers" });
	    } else if (Category.getValue() == "Supreme") {
	      PizzaOptions = new OptionSelector("Pizza", new String[] { "American Heat", "Re-Union" });
	    }

	    PizzaOptions.selectOption();

	    if (PizzaOptions.getValue() == "Tomchi") {
	      SelectedPizza = new Pizza("Tomchi", new String[] { "Tomato", "Cheese", "Chicken" });
	    } 
	    else if (PizzaOptions.getValue() == "Capanito")
	    {
	      SelectedPizza = new Pizza("Capanito", new String[] { "Capsicum", "Onion", "Tomato & Cheese" });
	    }
else if (PizzaOptions.getValue() == "Red Indian") {
	      SelectedPizza = new Pizza("Red Indian", new String[] { "Cheese", "Paneer", "Chilly" });
	    }
else if (PizzaOptions.getValue() == "Party Lovers") {
	      SelectedPizza = new Pizza("Party Lovers", new String[] { "Cheese", "Sweet Corn", "Capsicum", "Tomato" });
	    }
else if (PizzaOptions.getValue() == "American Heat") 
	    {
	      SelectedPizza = new Pizza("American Heat", new String[] 
	    		  { "Cheese", "Capsicum", "Baby Corn" });
	    } 
else if (PizzaOptions.getValue() == "Re-Union") {
	      SelectedPizza = new Pizza("Re-Union", new String[] 
	    		  { "Cheese", "Spinach", "Capsicum", "Baby Corn", "Onlives" });
	    }

	    SelectedPizza.takePreference();

	    if (Category.getValue() == "Classic") {
	      if (Size.getValue() == "Regular")
	      {
	        Amount = 135;
	      } else if (Size.getValue() == "Medium") 
	      {
	        Amount = 210;
	      } else if (Size.getValue() == "Large")
	      {
	        Amount = 360;
	      }
	    } else if (Category.getValue() == "Premium") {
	      if (Size.getValue() == "Regular") {
	        Amount = 165;
	      } else if (Size.getValue() == "Medium") {
	        Amount = 240;
	      } else if (Size.getValue() == "Large") {
	        Amount = 395;
	      }
	    } else if (Category.getValue() == "Supreme") {
	      if (Size.getValue() == "Regular") {
	        Amount = 190;
	      } else if (Size.getValue() == "Medium") {
	        Amount = 290;
	      } else if (Size.getValue() == "Large") {
	        Amount = 425;
	      }
	    }

	    System.out.println("You Have Selected " + Category.getValue() + " " + SelectedPizza.Name + " " + Size.getValue()
	        + " with " + SelectedPizza.getIngredients() + " worth price " + Amount);
	    System.out.print("Enter 1 to Confirm Order or 0 to Cancel Order : ");
	    Scanner sc = new Scanner(System.in);
	    
	    // Step 4--> Confirmation of order
	    
	    int confirm = sc.nextInt();
	    System.out.println();
	    if (confirm == 1) {
	      System.out.println("Your Order is Confirmed\n Thank you Visit Again");
	    } else {
	      System.out.println("Your Order is Cancelled");
	    }
	  }
	}
