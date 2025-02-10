import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
    int a = 10; 
    //long
    //float
    double b = 20.5; 
    char c = 'A'; 
    boolean d = true; 
    String str = "Hello, Java!"; 

    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public void showDataTypes() {
        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + d);
        System.out.println("String: " + str);

        byte x=-125;
		int i = 12;		
		char c='z';		
		//short		
		float f =12.1234567890123456789f;		
		double d =12.123456789123456789;		
		long l = 999999999999999999L;		
		boolean b= true;		
		String s ="abcdef";
		
		System.out.println(x+"\n\n");
		System.out.println(d+" "+s);
		System.out.println(i);
		System.out.println(f);
		System.out.println(c);
		System.out.println(b);
		System.out.println(l);
    }

    public void print2DArray() {
        System.out.println("2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void controlStatements() {
        System.out.println("Looping from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping 3 using continue.");
                continue; 
            }
            System.out.println("Number: " + i);
        }
    }

    public void stringOperations() {
        char c[] = {'n','i', 'r', 'u'};
		
		String s0 = new String(c);
		
		String s1 = "niru";
		
		//or                       
		
		String s2 = new String("niru");
		String s3 = "niru";
		
		System.out.println(s1==s2);
		System.out.println(s0==s1);
		System.out.println(s0==s2);
		System.out.println(s1==s3);

		System.out.println("\n"+ s1.equals(s2));
		System.out.println(s0.equals(s1));
		System.out.println(s0.equals(s2));
		System.out.println(s1.equals(s3));

		//both may look same but are different
		//string created using literals is different than created using 'new' keyword
		
		s1 = s1.concat("  "+s2);
		System.out.println(s1);
		
		System.out.println(s1.charAt(3));  //charAt()
		
		System.out.println(s1.substring(2,7)); //substring()
		
		System.out.println(s1.length());   //length()
		
		System.out.println("contains: " + s1.contains("nir"));  //contains a substring
		
		System.out.println(s2.equals(s0));  //this gives true 
		
		s1 = s1.replace('n', 'z');  //replaces only char, not string/substring
		
		
		System.out.println(s1);
		
		System.out.println(s1.indexOf('z'));   //index of char or substring
		System.out.println(s1.indexOf("ru"));   //index of char or substring

		System.out.println(s1.indexOf('z',5));  //index of char or substring from 5th char
		
		System.out.println(s1.toUpperCase());  //uppercase or lowercase
		
		char ss[] = s1.toCharArray();  //string to char array
		for(char i: ss)               // for each loop
		System.out.println(i);
		
		String Ss = "Hi I am Niranjan !"; //split()
		String sarr[] = Ss.split(" ");
		//String sarr[] = Ss.split("");
		//String sarr[] = Ss.split("[.]");
		
		String strz = "  ab cd  ".strip();  //removes spaces from beginning and end of a string
		System.out.println("strz:"+strz+s1); 

		
		for(String y: sarr)
		{
			System.out.println("arr " + y);
		}
		
		String s5 = "abcd";
		String s6 = s5.concat(" nsjcwdc"); //concat()

		s5 = s5+" nsjcwdc";
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s6==s5);
    }

    public void showDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Date & Time: " + now.format(formatter));
    }

    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        obj.showDataTypes();
        obj.print2DArray();
        obj.controlStatements();
        obj.stringOperations();
        obj.showDateTime();
    }
}
