
public class MainClass {

	public static void main(String[] args) {
		
		Integer num=new Integer(4);
		Integer num2=new Integer(7);
		num+=num2; //auto unboxing
		System.out.println(num);
		
		int num3=80;
		Integer num4=num3; //autoboxing
		System.out.println(num4);
	}

}
