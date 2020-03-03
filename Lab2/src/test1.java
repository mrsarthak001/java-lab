import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
      
		class visitor
		{
		    static int guest = 0;
		    String name;
		    char gender;

		  visitor(String name, char gender)
		    {
		        this.name = name;
		        this.gender = gender;
		        guest++;
		        welcome();
		    }

		    void welcome()
		    {
		        String[] words = name.split(" ");
		        System.out.print("Welcome ");
		        if(gender == 'm')
		        {
		            System.out.print("Mr. ");
		        }
		        else
		        {
		            System.out.print("Mrs. ");
		        }
		        for(int i=0 ; i<words.length-1; i++)
		        {
		            System.out.print(words[i].toCharArray()[0] + ". ");
		        }
		        System.out.print(words[words.length-1]);
		        System.out.println(" You are " + guest + "th visitor.");
		    }



}
	}

	public class Main
	{

	    public void main (String[] args)
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter your name : ");
	        String name = s.nextLine();
	        System.out.print("Enter your gender : ");
	        char gender = s.next().charAt(0);

	        visitor v1 = new visitor(name, gender);

	        visitor v2 = new visitor("sarthak jain sarthak jain", 'sarthak');
	    }
	}

}