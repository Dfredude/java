package Chapter06;

public class fPrimitiveDataTypes {
	public static void main(String args[]) {
		byte bool_min = boolToByte(Boolean.FALSE), bool_max = boolToByte(Boolean.TRUE);
		byte byte_min = Byte.MIN_VALUE, byte_max = Byte.MAX_VALUE;
		short short_min = Short.MIN_VALUE, short_max = Short.MAX_VALUE;
		int char_min = Character.MIN_VALUE, char_max = Character.MAX_VALUE;
		int int_min = Integer.MIN_VALUE, int_max = Integer.MAX_VALUE;
		long long_min = Long.MIN_VALUE, long_max = Long.MIN_VALUE;
		float float_min = Float.MIN_VALUE, float_max = Long.MAX_VALUE;
		double double_min = Double.MIN_VALUE, double_max = Double.MAX_VALUE;
		System.out.println("Bool's min value: "+bool_min+ " & max value: "+bool_max);
		System.out.println("Byte's min value: "+byte_min+ " & max value: "+byte_max);
		System.out.println("Short's min value: "+short_min+ " & max value: "+short_max);
		System.out.println("Char's min value: "+char_min+ " & max value: "+char_max);
		System.out.println("Int's min value: "+int_min+ " & max value: "+int_max);
		System.out.println("Float's min value: "+float_min+ " & max value: "+float_max);
		System.out.println("Double's min value: "+double_min+ " & max value: "+double_max);
	}

	public static byte boolToByte(boolean bool) {
		byte myInt = (byte) (bool ? 1 : 0); // using cast operator similar to C++ rather than the wrapper class Boolean.parseByte
		return myInt;
	}

}
