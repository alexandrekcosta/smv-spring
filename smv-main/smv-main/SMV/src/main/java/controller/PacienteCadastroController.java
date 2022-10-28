package controller;

import java.util.List;

import entidade.PacienteCadastroEntity;
import repositories.PacienteCadastroRepository;

@RestController
@RequestMapping("/usuarios")

public class PacienteCadastroController {
	
private final PacienteCadastroRepository PacienteRepository;
	
	public void UsuarioComumController(PacienteCadastroRepository PacienteRepository){
		
		this.PacienteRepository = PacienteRepository;

}
	
@PostMapping
	
	public PacienteCadastroEntity create(@RequestBody PacienteCadastroEntity paciente){
		
		PacienteCadastroEntity paciente1 = new PacienteCadastroEntity();
		paciente1.setId(paciente.getId());
		paciente1.setCertidao(paciente.getCertidao());
		paciente1.setCnh(paciente.getCnh());
		paciente1.setEmail(paciente.getEmail());
		paciente1.setNomeMae(paciente.getNomeMae());
		paciente1.setNumeroSUS(paciente.getNumeroSUS());
		paciente1.setRaca(paciente.getRaca());
		paciente1.setRg(paciente.getRg());
		paciente1.setId(paciente.getId());
		paciente1.setNome(paciente.getNome());
		paciente1.setCpf(paciente.getCpf());
		paciente1.setSexo(paciente.getSexo());
		paciente1.setNascimento(paciente.getNascimento());
		paciente1.setEndereco(paciente.getEndereco());
		paciente1.setCep(paciente.getCep());
		PacienteRepository.save(paciente1);
		
		return paciente;
	}

@GetMapping(path = "{id}")
public PacienteCadastroEntity get(@PathVariable Long id){
	
	PacienteCadastroEntity paciente = PacienteCadastroRepository.getById(id);
	PacienteCadastroEntity paciente1 = new PacienteCadastroEntity();
	paciente1.setId(paciente.getId());
	paciente1.setCertidao(paciente.getCertidao());
	paciente1.setCnh(paciente.getCnh());
	paciente1.setEmail(paciente.getEmail());
	paciente1.setNomeMae(paciente.getNomeMae());
	paciente1.setNumeroSUS(paciente.getNumeroSUS());
	paciente1.setRaca(paciente.getRaca());
	paciente1.setRg(paciente.getRg());
	paciente1.setId(paciente.getId());
	paciente1.setNome(paciente.getNome());
	paciente1.setCpf(paciente.getCpf());
	paciente1.setSexo(paciente.getSexo());
	paciente1.setNascimento(paciente.getNascimento());
	paciente1.setEndereco(paciente.getEndereco());
	paciente1.setCep(paciente.getCep());
	
	return paciente;
	
	
	}


@PutMapping
public PacienteCadastroEntity update(@RequestBody PacienteCadastroEntity paciente){
	
	PacienteCadastroEntity paciente0 = PacienteCadastroRepository.getById(id);
	PacienteCadastroEntity paciente1 = new PacienteCadastroEntity();
	paciente1.setCertidao(paciente.getCertidao());
	paciente1.setCnh(paciente.getCnh());
	paciente1.setEmail(paciente.getEmail());
	paciente1.setNomeMae(paciente.getNomeMae());
	paciente1.setNumeroSUS(paciente.getNumeroSUS());
	paciente1.setRaca(paciente.getRaca());
	paciente1.setRg(paciente.getRg());
	paciente1.setId(paciente.getId());
	paciente1.setNome(paciente.getNome());
	paciente1.setCpf(paciente.getCpf());
	paciente1.setSexo(paciente.getSexo());
	paciente1.setNascimento(paciente.getNascimento());
	paciente1.setEndereco(paciente.getEndereco());
	paciente1.setCep(paciente.getCep());
	
		return paciente;
	}


@DeleteMapping(path = "{id}")
public void delete(@PathVariable Long id){
	
	PacienteCadastroEntity.deleteById(id);


}



@GetMapping 
public List<PacienteCadastroEntity> listAll(){
	
	List<PacienteCadastroEntity> listEntity = PacienteCadastroRepository.findAll();
	List<PacienteCadastroEntity> listPojo = new ArrayList<>();
	
	for (PacienteCadastroEntity entity:listEntity){
		
		PacienteCadastroEntity paciente0 = PacienteCadastroRepository.getById(id);
		PacienteCadastroEntity paciente1 = new PacienteCadastroEntity();
		paciente1.setId(entity.getId());
		paciente1.setCertidao(entity.getCertidao());
		paciente1.setCnh(entity.getCnh());
		paciente1.setEmail(entity.getEmail());
		paciente1.setNomeMae(entity.getNomeMae());
		paciente1.setNumeroSUS(entity.getNumeroSUS());
		paciente1.setRaca(entity.getRaca());
		paciente1.setRg(entity.getRg());
		paciente1.setId(entity.getId());
		paciente1.setNome(entity.getNome());
		paciente1.setCpf(entity.getCpf());
		paciente1.setSexo(entity.getSexo());
		paciente1.setNascimento(entity.getNascimento());
		paciente1.setEndereco(entity.getEndereco());
		paciente1.setCep(entity.getCep());
		listPojo.add(paciente1);
	}
	
	return listPojo;
}
}
