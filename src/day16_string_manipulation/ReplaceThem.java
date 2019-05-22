package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println("Without spaces: " + withNoSpaces);
		
		System.out.println(sentence);
		//replace , with !!!
		
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
		
		String mixed = "&^@#j$a-v|a@#$";
		//clean up mixed
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
	//	mixed = mixed.replace("$", "");
	//	mixed = mixed.replace("-", "");
	//	mixed = mixed.replace("|", "");
	//	System.out.println(mixed);
		
		mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("a", "");
		System.out.println(mixed);
		
		String result = "About 115.000.000 results (0.59 seconds)";
		
		//using string methods (replace, substring) get number of results
		//115.000.000
		
		result = result.replace("About ", "");
		//result = result.replace(" results (0.59 seconds)", "");   might break
	result = result.substring(0, result.indexOf(" "));
		System.out.println(result);
		result= result.replace(".", "");
		System.out.println(result);
		
	
	}
}
