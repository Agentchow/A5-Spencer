package a4;

public class Avocado extends IngredientImple{

	public Avocado() {
		super("avocado", 0.24, 42);
	}
	
	public boolean getIsRice() {
		return false;
	}
	
	public boolean getIsVegetarian() {
		return true;
	}
	public boolean getIsShellfish() {
		return false;
	}
}
