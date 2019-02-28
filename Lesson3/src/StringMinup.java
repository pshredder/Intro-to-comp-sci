
public class StringMinup {

	public static void main(String[] args) {
	
	//String x = "The number of rabbits is";
	//int argh = 129;
	//System.out.println(x + " " + argh + ".");
	 
	//String g = "Computer Science is for nerds";
	//System.out.println(g.toLowerCase());
	
	//String m = "\"Look here!\"";
	//int h = m.length() - 2;
	//System.out.println( m + " has" + h + " characters.");
	
	//String q = "Hello again";
	//System.out.println( q.substring(0,5) + "\n" + q);
	
	//String v = "A backslash looks like this \\, ...right?";
	//System.out.println(v);
	
	
	String s1 = "Allan Alda";
	String s2 = "John Wayne";
	String s3 = "Gregory Peck";
	System.out.println( s1.substring(2,5) + " " + s1.substring(0,1));
	System.out.println( s2.substring(2,5) + " " + s2.substring(5,7));
	System.out.println( s3.substring(2,7) + " " + s3.substring(8,9));
	
	
	System.out.println("a\\b\\c\\\"d\"" + "\n" + "\\t is a tab, \\n is a ner line, \\\" prints a \"quote\"" + "\n" + "\"line one\"" + "\n"
	+ "\\\\ denotes a single line comment" ); 
	}

}
