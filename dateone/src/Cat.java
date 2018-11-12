
public class Cat
{
    //猫的名字
	String name;
	//猫的颜色
	String color;
	
	//获取值
	public void mycat()
	{
		System.out.println(this.name+"颜色为："+this.color);
		
	}
		
	
	public static void main(String[] args)
	{
		//设置值
		Cat c1 = new Cat();
		c1.name ="大彭";
		c1.color="蓝色";
		//输出值
		c1.mycat();
		
		System.out.println("--------------------------");
		//设置值
		Cat c2 = new Cat();
		c2.name = "小何";
		c2.color="黑色";
		//输出值
		c2.mycat();
		
	}
}
