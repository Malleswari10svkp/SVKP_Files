package basicsofjava;

public class DatatypeDemo {

	public static void main(String[] args) {
		//byte -1 byte
				byte byteMax = 127;
				byte byteMin = -128;
				System.out.println("Min range of byte is" +byteMin +" Max range of byte" + byteMax);

				//short -2 byte
			    short shortMax = 32767;
			   	short shortMin = -32768;
				System.out.println("Min range of short is" +shortMin +" Max range of byte" +byteMax);
		       
				//int - 4 bytes
				 int maxInt=2147483647;
				 int minInt=-2147483648;
				System.out.println("Min range of int is" +minInt +" Max range of int" +maxInt);
				
				//long = 8 bytes
				long maxlong=9223372036854775807L;
				long minlong=-9223372036854775808L;
				System.out.println("Min range of long is" +minlong +" Max range of long" +maxlong);
				
				//float -4 bytes //double - 8 bytes
				float f=3234.141243278345f;
				double d=3456.14124512345678902345678914d;
				System.out.println("float value" +f +"double" + d);
				
				//boolean
				boolean status=false;
				System.out.println("boolean value is"+ status);
				
				char c='M';
				System.out.println("char value" + c);
		      

	}

}
