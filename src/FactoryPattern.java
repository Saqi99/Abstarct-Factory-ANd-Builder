
public class FactoryPattern {
	public static void main(String[] args){
	
		MealBuilder additem=new MealBuilder();
		Meal item1=additem.prepareVegMeal();
		item1.showItems();
		
		
		Meal item2=additem.prepareNonVegMeal();
		item2.showItems();
	
	}

}
