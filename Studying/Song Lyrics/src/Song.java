
public class Song {

	public static void main(String[] args)
	{
		wasOldLady();
		fly();
		die();
		
		wasOldLady();
		spider();
		spiderVerse2();
		die();
		
		wasOldLady();
		bird();
		birdVerse2();
		spiderVerse2();
		die();
		
		wasOldLady();
		dog();
		dogVerse2();
		catVerse2();
		birdVerse2();
		spiderVerse2();
		die();
		
		wasOldLady();
		horse();
	}
	
	public static void wasOldLady()
	{
		System.out.print("There was an old lady who swallowed a ");
	}
	
	public static void fly()
	{
		System.out.print("fly, \nI don't know why she swallowd that fly,");
	}
	
	public static void spider()
	{
		System.out.print("spider, \nThat wriggled and jiggled insider her,");
		
	}
	
	public static void spiderVerse2()
	{
		System.out.print("\nShe swallowed the spider to catch the fly,");
		System.out.print("\nI don't know why she swallowed that fly,");
	}
	
	public static void cat()
	{
		System.out.print("cat, \nImagine that to swallow a cat,");
		
	}
	
	public static void catVerse2()
	{
		System.out.print("\nShe swallowed the cat to catch the bird");
	}
	
	public static void bird()
	{
		System.out.print("bird, \nHow absured to swallow a bird,");
		
	}
	
	public static void birdVerse2()
	{
		System.out.print("\nShe swallowed the bird to catch the spider,");
	}
	
	public static void dog()
	{
		System.out.print("dog, \nWhat a hog to swallow a dog.");
		
	}
	
	public static void dogVerse2()
	{
		System.out.print("\nShe swallowed a dog to catch the cat,");
	}
	
	public static void horse()
	{
		System.out.print("horse, \nShe died of course.");
	}
	
	public static void die()
	{
		System.out.print("\nPerhaps she'll die.\n\n");
	}
}
