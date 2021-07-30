import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Etl {
	
    Map<String, Integer> transform(Map<Integer, List<String>> old) {
    	
    	// Instância do Map de retorno com os dados no novo formato.
    	Map<String, Integer> mapEtl = new HashMap<>();
    	
    	// Percorre o map recebido por parâmetro verificando o valor da chave atual, percorrendo os valores dessa chave e armazenando no Map de retorno.
    	old.forEach((key, value) -> value.forEach(letter-> mapEtl.put(letter.toLowerCase(), key)));
    	
        return mapEtl;
    }
}
