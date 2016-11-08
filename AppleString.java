import java.io.IOException;

public class AppleString {

	public static String remove(String word, char removeChar){
        StringBuilder sb = new StringBuilder();
        char[] letters = word.toCharArray();     
        for(char c : letters){
            if(c != removeChar ){
                sb.append(c);
            }
        }     
        return sb.toString();
    }
	public static String removeUsingClass(String word, String removeChar) {
		String temp = word.replace(removeChar ,"");
        return temp;	   
	}


	public static void main(String[] args) throws IOException {
		System.out.println(remove("this is veena",'v'));
		System.out.println(removeUsingClass("this is veena","v"));
		
	
	}
}
