
public class Man
{

	public static void main(String[] args)
	{
		Dog  dog1= new Dog();
		dog1.setColorName("À¶É«");
		Dog.eat();
		
		
		System.out.println(dog1.getColorName());
		
		System.out.println("---------------------");
		
		Dog  dog2= new  Dog();
		dog2.setColorName("ºÚÉ«");
		Dog.eat();
		
		System.out.println(dog2.getColorName());
		
		
		
	}
}
