import java.util.Scanner; 
class Experiment4
{
	Scanner sc = new Scanner(System.in);
	public void sortStrings()
	{
		System.out.print("How many Names "); 
		int i, j, n;
		n = sc.nextInt();
		String[] str = new String[n]; 
		System.out.println("Enter " + n + " Strings"); 
		for(i = 0; i < n; i++)
		{
			str[i] = new String(sc.next());
		}
		for(i = 0; i < n; i++)
		{
			for(j = i+1; j < n; j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp = str[i]; str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("Given Strings in Alphabetical Order"); 
		for(i=0; i<n ; i++)
			System.out.println(str[i]);
	}
}
class Mainclass
{
	public static void main(String args[])
	{
		Experiment4 obj = new Experiment4(); 
		obj.sortStrings();
	}
}
