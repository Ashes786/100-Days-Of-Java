
public class PhraseOMactic {
    public static void main() {
		// word lists
		String[] wordList1 = {"love", "hatred","fun","enjoy"};
		String[] wordList2 = {"ice cream", "cake","biryani","Spaghetti"};
		String[] wordList3 = {"python", "Web Development","Robotics","Artificial Intelligence"};
		// finding legth of the lists
		int length1 = wordList1.length;
		int length2 = wordList2.length;
		int length3 = wordList3.length;
		// random numbers
		int rand1= (int) (Math.random() * length1);
		int rand2= (int) (Math.random() * length2);
		int rand3= (int) (Math.random() * length3);

        // Now building a new Random string.
        String randomString = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
        System.out.println(randomString);
		
	}
}
