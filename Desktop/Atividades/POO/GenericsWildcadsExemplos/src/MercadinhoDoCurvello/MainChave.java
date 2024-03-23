package MercadinhoDoCurvello;

public class MainChave {
	 public static void main(String[] args) {
	 
	        KeyValueStore<String> stringStore = new KeyValueStore<>();
	        System.out.println("Adicionando valores à KeyValueStore<String>:");
	        System.out.println("Inseriu (chave1, valor1)? " + stringStore.add("chave1", "valor1")); // Deve retornar true
	        System.out.println("Inseriu (chave2, valor2)? " + stringStore.add("chave2", "valor2")); // Deve retornar true
	        System.out.println("Inseriu (chave1, valor3)? " + stringStore.add("chave1", "valor3")); // Deve retornar false
	        System.out.println("Valor associado à chave1: " + stringStore.get("chave1")); // Deve retornar valor1

	        KeyValueStore<Integer> integerStore = new KeyValueStore<>();
	        System.out.println("\nAdicionando valores à KeyValueStore<Integer>:");
	        System.out.println("Inseriu (chave1, 10)? " + integerStore.add("chave1", 10)); // Deve retornar true
	        System.out.println("Inseriu (chave2, 20)? " + integerStore.add("chave2", 20)); // Deve retornar true
	        System.out.println("Inseriu (chave1, 30)? " + integerStore.add("chave1", 30)); // Deve retornar false
	        System.out.println("Valor associado à chave1: " + integerStore.get("chave1")); // Deve retornar 10
	    }
}
