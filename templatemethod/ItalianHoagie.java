package templatemethod;

class ItalianHoagie extends Hoagie {
	
	String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
	String[] cheeseUsed = {"Provolone"};
	String[] vegetablesUsed = {"Lettuse", "Tomato", "Onion", "Sweet Potato"};
	String[] condimentsUsed = {"Oil", "Vinegar"};

	@Override
	void addMeat() {
		System.out.print("Adding the meat: ");
		
		for (String meat : meatUsed) {
			System.out.print(meat + " ");
		}
		System.out.println();
	}

	@Override
	void addCheese() {
		System.out.print("Adding the cheese: ");
		
		for (String cheese : cheeseUsed) {
			System.out.print(cheese + " ");
		}
		System.out.println();
		
	}

	@Override
	void addVegetables() {
		System.out.print("Adding the vegetables: ");
		
		for (String vegetable : vegetablesUsed) {
			System.out.print(vegetable + " ");
		}
		System.out.println();
		
	}

	@Override
	void addCondiments() {
		System.out.print("Adding the condiments: ");
		
		for (String condiment : condimentsUsed) {
			System.out.print(condiment + " ");
		}
		System.out.println();
		
	}
	
}
