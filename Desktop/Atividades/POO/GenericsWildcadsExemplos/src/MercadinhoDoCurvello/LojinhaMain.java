package MercadinhoDoCurvello;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class LojinhaMain {

	public static void main(String[] args) {
		Mercadorias<String> Banana = new Mercadorias<>("B1b1b1", 50, new Date(11), new Date(0));
		Mercadorias<String> ProblemasPsicologicos = new Mercadorias<>("Nao realizar as atividades", 00, new Date(12), new Date(20)); 
		Mercadorias<Integer> Agua = new Mercadorias<>(1, 00, new Date(12), new Date(20)); 
		
		List <Mercadorias<?>> listaLojinha = new ArrayList<>();
		listaLojinha.add(Banana);
		listaLojinha.add(ProblemasPsicologicos);
		listaLojinha.add(Agua);
		
		for(Mercadorias<?> x : listaLojinha ) {
			System.out.println(x);
		}
	}

}
