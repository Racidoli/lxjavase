
public class Cat
{
    //è������
	String name;
	//è����ɫ
	String color;
	
	//��ȡֵ
	public void mycat()
	{
		System.out.println(this.name+"��ɫΪ��"+this.color);
		
	}
		
	
	public static void main(String[] args)
	{
		//����ֵ
		Cat c1 = new Cat();
		c1.name ="����";
		c1.color="��ɫ";
		//���ֵ
		c1.mycat();
		
		System.out.println("--------------------------");
		//����ֵ
		Cat c2 = new Cat();
		c2.name = "С��";
		c2.color="��ɫ";
		//���ֵ
		c2.mycat();
		
	}
}
