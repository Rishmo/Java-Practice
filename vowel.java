public class vowel
{
  public static void main(String[] args) {
	char b[]=new char[40];
	int n=0,i=0;
	int c=0,w=0,j=0;
	for(i=0;i<args.length;i++)
	{
		for(j=0;j<args[i].length();j++)
		{
			b[n]=args[i].charAt(j);
			n++;
		}
	b[n]='\0';
	n++;
	}

	int v=0;
	for(i=0;i<n;i++)
	{
		System.out.print(b[i]);
	}

	for(i=0;i<n;i++)
	{
		if(b[i]=='\0' && i!=0)
		  w+=1;
		else if(b[i]='\0')
		  c+=1;

		if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U')
		v+=1;
	}
System.out.println("\nNumber of Words: "+w+"\nNumber of Characters: "+c+"\nNo Of Vowels: "+v);
	    
  }
}
