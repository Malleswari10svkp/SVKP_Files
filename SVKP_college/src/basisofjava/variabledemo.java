package basisofjava;

public class variabledemo {

		        int id=10; //INSTANCE VARIABLE
				void print()
				{
			String msg="hello"; //LOCAL VARIABLE
			System.out.println(msg);
				}
		static String message="hello students"; //STATIC VARIABLE
		public static void main(String[] args) {
			variabledemo obj=new variabledemo();
			System.out.println(obj.id);
			obj.print();
			System.out.println(message);
		
	}

} 