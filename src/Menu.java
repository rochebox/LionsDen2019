import java.util.ArrayList;

public class Menu {
	
	public class Item{
		
		private double price;
		private ArrayList<String> ingredient = new ArrayList<String>();
		private int minutesToPrepare;
		private String brand = "Lions Den";
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public ArrayList<String> getIngredient() {
			return ingredient;
		}
		
		public void addIngredient(String ingrd) {
			this.ingredient.add(ingrd);
		}
	
		public int getMinutesToPrepare() {
			return minutesToPrepare;
		}
		
		public void setMinutesToPrepare(int minutesToPrepare) {
			this.minutesToPrepare = minutesToPrepare;
		}
		
		public String getBrand() {
			return brand;
		}
		
		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		
		
	}
	
	public abstract class BeverageItem extends Item{
		
		public abstract void prepare();
		
	}
	
	public class Smoothie extends BeverageItem{

		public Smoothie(String flavor) {
			ArrayList <String> listOfFlavors = new ArrayList<String>();
			listOfFlavors.add("Strawberry");
			listOfFlavors.add("Straberry Banana");
			listOfFlavors.add("Oreo");
			listOfFlavors.add("Mango");
			listOfFlavors.add("Peach");
			listOfFlavors.add("Wildberry");
			listOfFlavors.add("Vanilla");
			if(listOfFlavors.contains(flavor)) {
				this.addIngredient(flavor);
				this.prepare();
			}else {
				// raise error
			}
		}
		
		@Override
		public void prepare() {
			// TODO Auto-generated method stub
			this.setPrice(4.75);
			this.setMinutesToPrepare(3);
		}
		
	}
	
	public abstract class BottledDrinks extends BeverageItem{

		@Override
		public void prepare() {
			// TODO Auto-generated method stub
			this.setMinutesToPrepare(0);
		}
		
		public abstract void chooseBrand();
		
	}
	
	public class HonestTea extends BottledDrinks{

		public HonestTea(String flavor) {
			ArrayList <String> listOfFlavors = new ArrayList<String>();
			listOfFlavors.add("Peach");
			listOfFlavors.add("Raspberry");
			listOfFlavors.add("Pomegranate");
			if(listOfFlavors.contains(flavor)) {
				this.addIngredient(flavor);
				this.prepare();
				this.chooseBrand();
			}else {
				// raise error
			}
		}
		
		@Override
		public void chooseBrand() {
			// TODO Auto-generated method stub
			this.setBrand("Honest");
		}
	
	}	

	
	public class Bai extends BottledDrinks{

		public Bai(String flavor) {
			ArrayList <String> listOfFlavors = new ArrayList<String>();
			listOfFlavors.add("Cocconut");
			listOfFlavors.add("Strawberry Banana");
			if(listOfFlavors.contains(flavor)) {
				this.addIngredient(flavor);
				this.prepare();
				this.chooseBrand();
			}else {
				// raise error
			}
		}
		
		@Override
		public void chooseBrand() {
			// TODO Auto-generated method stub
			this.setBrand("Bai");
			this.setPrice(7.0);
		}
	
	}	

	public class BodyArmour extends BottledDrinks{

		public BodyArmour(String flavor) {
			ArrayList <String> listOfFlavors = new ArrayList<String>();
			listOfFlavors.add("Fruit Punch");
			if(listOfFlavors.contains(flavor)) {
				this.addIngredient(flavor);
				this.prepare();
				this.chooseBrand();
			}else {
				// raise error
			}
		}
		
		@Override
		public void chooseBrand() {
			// TODO Auto-generated method stub
			this.setBrand("Body Armour");
		}
	
	}

	public class Arizona extends BottledDrinks{

		public Arizona(String flavor) {
			ArrayList <String> listOfFlavors = new ArrayList<String>();
			listOfFlavors.add("Green Tea");
			if(listOfFlavors.contains(flavor)) {
				this.addIngredient(flavor);
				this.prepare();
				this.chooseBrand();
			}else {
				// raise error
			}
		}
		
		@Override
		public void chooseBrand() {
			// TODO Auto-generated method stub
			this.setBrand("Arizona");
		}
	
	}	
	
	public class Soda extends BottledDrinks{

		public Soda(String flavor) {
			ArrayList <String> listOfFlavors = new ArrayList<String>();
			listOfFlavors.add("Ginger Ale");
			listOfFlavors.add("Sprite");
			listOfFlavors.add("Coke");
			listOfFlavors.add("Fanta");
			listOfFlavors.add("MinuteMaid Lemonade");
			if(listOfFlavors.contains(flavor)) {
				this.addIngredient(flavor);
				this.prepare();
				this.chooseBrand();
			}else {
				// raise error
			}
		}
		
		@Override
		public void chooseBrand() {
			// TODO Auto-generated method stub
			this.setBrand("Multiple-Soda");
		}
	
	}	
	
	public class Yogurt extends BeverageItem{
		
		public Yogurt(String flavor){
			ArrayList <String> listOfFlavors = new ArrayList<String>();
			listOfFlavors.add("Strawberry");
			listOfFlavors.add("Original");
			if(listOfFlavors.contains(flavor)) {
				this.addIngredient(flavor);
				this.prepare();
			}else {
				// raise error
			}
		}
		
		@Override
		public void prepare() {
			// TODO Auto-generated method stub
			this.setPrice(4.75);
			this.setBrand("Chobani");
			this.setMinutesToPrepare(0);
		}
		
	}
	
	public abstract class FoodItem extends Item{
		
		public abstract void prepare();
		
	}
	
	public abstract class BreakfastFood extends FoodItem;
	
	public class FriedEggCheeseOnEnglishMuffin extends BreakfastFood{
		
		public FriedEggCheeseOnEnglishMuffin(String egg, String bread, String meat){
			this.addIngredient(egg + " cooked egg");
			this.addIngredient("Cheese");
			this.addIngredient(bread);
			this.addIngredient(meat);
		}

	}
	
	public static void main(String[] args) {
		Bai mycoco = new Bai("Cocconut");
		System.out.println(mycoco.getPrice());
		System.out.println(mycoco.getIngredient());
		System.out.println(mycoco.getMinutesToPrepare());
		System.out.println(mycoco.getBrand());
	}
}
