package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;

import java.util.List;
import java.util.ArrayList;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class DamenosServiceProxy implements DamenosService {
    DamenosService damenosService;
	List<DamenosPizza> cache = new ArrayList<>();
	public DamenosServiceProxy() {
		this.damenosService = new DamenosServiceImpl();
	}

    @Override
    public List<DamenosPizza> getPizzas() {
        // TODO - implementar proxy
        if (cache.isEmpty()) {
    		cache = damenosService.getPizzas();
    	}
        else {
    		System.out.println("listagem recuperada");
    	}
        return cache;
    }
}
