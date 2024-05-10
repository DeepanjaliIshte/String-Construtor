
public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Deepanjali";
		System.out.println(s1);
		
		String s2=new String();
		System.out.println(s2.length());
		
		StringBuffer sb=new StringBuffer("Deepa");
		String s3=new String(sb);
		System.out.println(s3);
		
		StringBuilder sb1=new StringBuilder("DRI");
		String s=new String(sb1);
		System.out.println(s);
		
		byte[] b= {100,101,102,103,104,105,106,107,108,109,110,111,120,121};
		String s4=new String(b);
		System.out.println(s4);
		
		char[] c={'a','b','c','d','e'};
		String s5=new String(c);
		System.out.println(s5);
	}
	
}




