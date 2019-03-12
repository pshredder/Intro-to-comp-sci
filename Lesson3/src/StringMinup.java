
public class StringMinup {

	public static void main(String[] args) {

		String x = "The number of rabbits is";
		int argh = 129;
		System.out.println(x + " " + argh + ".");
		 
		String g = "Computer Science is for nerds";
		System.out.println(g.toLowerCase());
		
		String m = "\"Look here!\"";
		int h = m.length() - 2;
		System.out.println( m + " has" + h + " characters.");
		
		String q = "Hello again";
		System.out.println( q.substring(0,5) + "\n" + q);
		
		String v = "A backslash looks like this \\, ...right?";
		System.out.println(v);
		
		
		String s1 = "Allan Alda";
		String s2 = "John Wayne";
		String s3 = "Gregory Peck";
		
		String f = s1.substring(3,s1.length() - 3);
		String d = s2.substring(3,s2.length() - 3);
		String i = s3.substring(2,s3.length()-3);

		System.out.println(f + "\n" + d +"\n" + i);
		
		
		System.out.println("a\\b\\c\\\"d\"" + "\n" + "\\t is a tab, \\n is a new line, \\\" prints a \"quote\"" + "\n" + "\"line one\"" +
		"\n" + "\\ line      two\\"+ "\n"
		+ "\\\\ denotes a single line comment" + "\n" + "\\denotes a multiline comment" + "\n" + "\"\\\\\"\\\"" + "\n" + "\n" + " \\\"\\\"\"\\" + "\n" + "\\\"\"\"\"\\" + "\n" ; 
		
		
		String k = "Birthday";
		System.out.println(k.toUpperCase());
		String e = "it's my party";
		System.out.println(e.substring(0,5) + " " + e.substring(9,10)+ " " + "\"" + e.substring(8,13).toUpperCase()+ "\"");
		String w = "whose a whats it";
		System.out.println(w.substring(0,5).toUpperCase() + "\n" + w.substring(14,15) + w.substring(3,4) + " " + w.substring(8,13).toUpperCase() );
		String r = "Every Way The Wind Blows";
		int l = r.substring(14,18).length();
		System.out.println(r.substring(0,5).toLowerCase() + " " + r.substring(6,9).toUpperCase() + " " + r.substring(10,13).toLowerCase() + "\\"+ " " +
		r.substring(14,18).toUpperCase() + "\\" + r.substring(19,24).toLowerCase() + " " + l);
		
		String s = "Peter Piper Picked A Peck Of Pickled Peppers";
		System.out.println(s.substring(19,25) + " " +s.substring(26,28).toLowerCase() + " " + s.substring(29,35) + "        " + s.substring(36,44).toLowerCase()
				+ " " + s.substring(0,11) + " " + s.substring(12,18).toLowerCase());
		String z = " Word has 4 letters";
		int ex = z.substring(0,19).length() - 10;
		System.out.println("\"" + z.substring(10,11) + "\"" + z.substring(11,19) + " " + z.substring(6,9) + 
				" \"" + ex + "\"" + z.substring(11,19));
		String u = "if SUBSTRING is used";
		int o = u.substring(3,15).length() - 3;
		System.out.println(u.substring(3,15).toLowerCase() + " " + o);
		String em = "jim, Jacky, johnny, Jill";
		int se = em.substring(0,3).toLowerCase().length(); 
int t = em.substring(6,11).toUpperCase().length();
int j = em.substring(12,18).toLowerCase().length();
int y = em.substring(19,23).toLowerCase().length();
System.out.println(em.substring(0,3).toLowerCase() + "\\" + se);
System.out.println( em.substring(5,10).toUpperCase() + "\\" + t);
System.out.println( em.substring(12,17).toLowerCase() + "\\" + j);
System.out.println(em.substring(20,24).toLowerCase() + "\\" + y);
	}

}
