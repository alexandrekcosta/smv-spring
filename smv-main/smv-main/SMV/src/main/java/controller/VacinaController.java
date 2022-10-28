package controller;

import java.util.ArrayList;
import java.util.List;

import entidade.PacienteCadastroEntity;
import entidade.VacinaEntity;
import repositories.PacienteCadastroRepository;
import repositories.VacinaRepository;

@RestController
@RequestMapping("/usuarios")

public class VacinaController {
	
private final VacinaRepository vacinaRepository;
	
	public VacinaController(VacinaRepository vacinaRepository){
		
		this.vacinaRepository = vacinaRepository;

}
	
@PostMapping
	
	public VacinaEntity create(@RequestBody VacinaEntity vacina){
		
		VacinaEntity vacina1 = new VacinaEntity();
		vacina1.setNome(vacina.getNome());
		vacina1.setDoses(vacina.getDoses());
		vacina1.setData(vacina.getData());
		vacina1.setDosesDescricao(vacina.getDosesDescricao());
		return vacina;
	}

@GetMapping(path = "{id}")
public VacinaEntity get(@PathVariable Long id){
	
	VacinaEntity entity = VacinaRepository.getById(id);
	VacinaEntity vacina1 = new VacinaEntity();
	vacina1.setNome(entity.getNome());
	vacina1.setDoses(entity.getDoses());
	vacina1.setData(entity.getData());
	vacina1.setDosesDescricao(entity.getDosesDescricao());
	
	return vacina1;
	
	
	}

@PutMapping
public VacinaEntity update (@RequestBody VacinaEntity vacina){
	
	VacinaEntity vacina1 = new VacinaEntity();
	vacina1.setNome(vacina.getNome());
	vacina1.setDoses(vacina.getDoses());
	vacina1.setData(vacina.getData());
	vacina1.setDosesDescricao(vacina.getDosesDescricao());
		vacina1 = VacinaRepository.save(vacina1);
		vacina.setId(vacina1.getId());
	
		return vacina;
	}

@DeleteMapping(path = "{id}")
public void delete(@PathVariable Long id){
	
	VacinaRepository.deleteById(id);


}

@GetMapping 
public List<VacinaEntity> listAll(){
	
	List<VacinaEntity> listEntity = VacinaRepository.findAll();
	List<VacinaEntity> listPojo = new ArrayList<>();
	
	for (VacinaEntity entity:listEntity){
		
		VacinaEntity vacina1 = new VacinaEntity();
		vacina1.setNome(entity.getNome());
		vacina1.setDoses(entity.getDoses());
		vacina1.setData(entity.getData());
		vacina1.setDosesDescricao(entity.getDosesDescricao());
		listPojo.add(vacina1);
	}
	
	return listPojo;
	
}
}
