
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
	
	String f = s1.substring(2, 7);
	String h = s2.substring(2, 7);
	String i = s3.substring(2, 9);

	System.out.println(f + "\n" + h +"\n" + i);
	
	
	System.out.println("a\\b\\c\\\"d\"" + "\n" + "\\t is a tab, \\n is a ner line, \\\" prints a \"quote\"" + "\n" + "\"line one\"" + "\n"
	+ "\\\\ denotes a single line comment" + "\n" + "\"\\\\\"\\\"" + "\n" + " \\\"\\\"\"\\" + "\n" + "\\\"\"\"\"\\" + "\n"); 
	
	
	String d = "Birthday";
	System.out.println(d.toUpperCase());
	String e = "it's my party";
	System.out.println(e.substring(0,5) + " " + e.substring(9,10)+ " " + "\"" + e.substring(8,13).toUpperCase()+ "\"");
	String w = "whose a whats it";
	System.out.println(w.substring(0,5).toUpperCase() + "\n" + w.substring(14,15) + w.substring(3,4) + " " + w.substring(8,13).toUpperCase() );
	String r = "Every Way The Wind Blows";
	int l = r.substring(14,18).length();
	System.out.println(r.substring(0,5).toLowerCase() + " " + r.substring(6,9).toUpperCase() + " " + r.substring(10,13).toLowerCase() + "\\"+ " " +
	r.substring(14,18).toUpperCase() + "\\" + r.substring(19,24).toLowerCase() + " " + l);
	
	String q = "Peter Piper Picked A Peck Of Pickled Peppers";
	System.out.println(q.substring(19,25) + " " +q.substring(26,28).toLowerCase() + " " + q.substring(29,35) + "        " + q.substring(36,44).toLowerCase()
			+ " " + q.substring(0,11) + " " + q.substring(12,18).toLowerCase());
	String z = " Word has 4 letters";
	System.out.println(z.);
	
	}

}
