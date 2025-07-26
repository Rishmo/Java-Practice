class ReverseString { 

    public static String reverseString(String str) 

    { 
        int n = str.length(); 

        char temp; 

        for (int i = 0; i < n / 2; i++) { 

            str = str.substring(0, i) 

                  + str.charAt(n - i - 1) 

                  + str.substring(i + 1, n - i - 1) 

                  + str.charAt(i) 

                  + str.substring(n - i); 

        } 

        return str; 

    } 


    public static void main(String[] args) 

    { 

        if (args.length > 0) {

            System.out.println(reverseString(args[0])); 

        } 

        else

            System.out.println("No command line "

                               + "arguments found."); 

    } 
}