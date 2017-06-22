package Util;

public class Ayudante {

	public static int conversor (String Valor){
		int valorConvertido=0;
		
		try {
			valorConvertido = Integer.parseInt(Valor);
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println( e.getMessage());
		}
		
		return valorConvertido;
	}
}
