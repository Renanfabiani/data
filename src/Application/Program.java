package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));//definir que o time zone dele é GMT para ficar horário brasil
		
		
		Date y1 = sdf1.parse("25/06/2018");//importar o java util date, parseexception e simpledateformat
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));//para criar uma data ISO 8601 padrão UTC com classe instat 
		
		
		Date x1 = new Date();//para criar um horário atual
		Date x2 = new Date (System.currentTimeMillis());//para também criar o horário atual
		Date x3 = new Date(0L);//Cria uma data UTC (3 horas antes de 1970 1 de janeiro)
		Date x4 = new Date(1000L * 60L* 60L * 5L);//1000 milissegundos multiplica por 60 para min, depois por 60 pra hora e depois pra 5 pra ficar 5 horas da manhã
		
		
		System.out.println("-----------------");
		System.out.println("y1: " + y1);//Sem formatar
		System.out.println("y2: " + y2);//
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y3: " + y3);//imprime 12:42 UTC 3 horas de 15:42 antes porque é Brasil
		System.out.println("-----------------");
		System.out.println("y1: " + sdf2.format(y1));//para importar no formato dd/mm/yyy
		System.out.println("y2: " + sdf2.format(y2));//para importar no formato dd/mm/yyy hh:mm:ss
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y3: " + sdf2.format(y3));//imprime 12:42 UTC 3 horas de 15:42 antes porque é Brasil
		System.out.println("-----------------");
		System.out.println("y1: " + sdf3.format(y1));//para importar no formato dd/mm/yyy
		System.out.println("y2: " + sdf3.format(y2));//para importar no formato dd/mm/yyy hh:mm:ss
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y3: " + sdf3.format(y3));//imprime 12:42 UTC 3 horas de 15:42 antes porque é Brasil
		
		
		
		
	}

}
