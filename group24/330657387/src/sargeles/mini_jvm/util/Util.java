package sargeles.mini_jvm.util;

public class Util {
	public static int byteToInt(byte[] codes){
    	String s1 = byteToHexString(codes);
    	//第二个参数的意思是，该字符串中的数是16进制的。
    	return Integer.valueOf(s1, 16).intValue();
    }
    
    
    
	public static String byteToHexString(byte[] codes ){
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<codes.length;i++){
			byte b = codes[i];
			int value = b & 0xFF;
			String strHex = Integer.toHexString(value);
			if(strHex.length()< 2){
				strHex = "0" + strHex;
			}		
			buffer.append(strHex);
		}
		return buffer.toString();
	}
}
