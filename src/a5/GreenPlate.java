package a5;

public class GreenPlate extends PlateImpl{
	
	public GreenPlate(Sushi contents) throws PlatePriceException {
		super(contents, Color.GREEN, 2.0);
	}
}