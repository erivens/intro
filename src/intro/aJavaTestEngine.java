package intro;

public class aJavaTestEngine {

	public static final String SHELLEY = "Mary Shelley";
	public static final String ALLAN = "Allan Rune Pettersson";
	public static final String DOYLE = "Arthur Conan Doyle";

	public static String nameTheAuthor(String novel, int year) {
	    if(year <= 1900 && (novel.contains("Frankenstein") ||
	                        novel.contains("Last")) ||
	                        novel.contains("Falkner")) {
	        return SHELLEY;
	    }else if (novel.contains("Frankenstein")) {
	        return ALLAN;
	    }else if(novel.contains("Lost") || novel.contains("Scarlet")) return DOYLE;
	    return null;
	}

	public static void main(String[] args) {
	    System.out.println(nameTheAuthor("Frankenstein", 1818));   // line 1
	    System.out.println(nameTheAuthor("The Last Man", 1826));    // line 2
	    System.out.println(nameTheAuthor("The Lost World", 1912));   // line 3
	    System.out.println(nameTheAuthor("Frankenstein's Aunt", 1900)); // line 4
	    System.out.println(nameTheAuthor("A Study in Scarlet", 1886)); // line 5
	    
	    
	    System.out.println();
        String name = "Cerberus";
        int puppyCounter = 10;
        puppyCounter = puppyCounter + 10/3;
        System.out.println(name);  // line 1
        System.out.println(puppyCounter); // line 2
        System.out.print(name + " has how many heads? ");
        double heads = 3;
        System.out.println(heads + "heads"); // line 3
        boolean isCool = true;
        System.out.println(name + " is " + isCool); // line 4
        //Scanner scanner = new Scanner(System.in);
        System.out.print("How many heads again? ");
        double dbl = 3.0;  // assume 3 is entered
        System.out.println(dbl); // line 5
    }

}
	