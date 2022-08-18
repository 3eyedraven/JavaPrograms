import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MainClass {

	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
		method5();
	}
	public static void method1() {
		String str="hello, welc348660ome to Jav4a Fullstack Train4ing";
		Pattern pattern = Pattern.compile("\\d?");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
			
		}}
		public static void method2() {
			String str="hello, welc348660ome to Jav4a Fullstack Train4ing";
			Pattern pattern = Pattern.compile("\\d");
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
				
			}
		}
		public static void method3() {
				String str="hello, welc348660ome to Jav4a Fullstack Train4ing";
				Pattern pattern = Pattern.compile("\\d+");
				Matcher matcher = pattern.matcher(str);
				while (matcher.find()) {
					System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
					
				}	}
		public static void method4() {
				String str="hello, welc348660ome to Jav4a Fullstack Train4ing";
				Pattern pattern = Pattern.compile("\\d?");
				Matcher matcher = pattern.matcher(str);
				while (matcher.find()) {
					System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());
						
					}
		
	}

}
