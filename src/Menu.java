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
			listOfFlavors.add("Banana");
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

	public class Yogurt extends BeverageItem{
		
		public Yogurt(String flavor){
			ArrayList <String> listOfFlavors = new ArrayList<String>();
			listOfFlavors.add("Strawberry");
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
	
}
