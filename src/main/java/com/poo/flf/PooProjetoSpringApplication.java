package com.poo.flf;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.flf.domain.Categoria;
import com.poo.flf.domain.Cidade;
import com.poo.flf.domain.Cliente;
import com.poo.flf.domain.Endereco;
import com.poo.flf.domain.Estado;
import com.poo.flf.domain.Filme;
import com.poo.flf.domain.enums.TipoCliente;
import com.poo.flf.repositories.CategoriaRepository;
import com.poo.flf.repositories.CidadeRepository;
import com.poo.flf.repositories.ClienteRepository;
import com.poo.flf.repositories.EnderecoRepository;
import com.poo.flf.repositories.EstadoRepository;
import com.poo.flf.repositories.FilmeRepository;

@SpringBootApplication
public class PooProjetoSpringApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private FilmeRepository filmeRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(PooProjetoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria("Ação");
		Categoria cat2 = new Categoria("Terror");
		Categoria cat3 = new Categoria("Comédia");

		Filme f1 = new Filme("Matrix", 5.50);
		Filme f2 = new Filme("Jason x", 6.50);
		Filme f3 = new Filme("Os trapalhoes", 6.50);

		cat1.getFilmes().addAll(Arrays.asList(f1, f2));
		cat1.getFilmes().addAll(Arrays.asList(f2));
		cat1.getFilmes().addAll(Arrays.asList(f3));

		f1.getCategorias().addAll(Arrays.asList(cat1));
		f2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		f3.getCategorias().addAll(Arrays.asList(cat3));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		filmeRepository.saveAll(Arrays.asList(f1, f2, f3));

		Estado est1 = new Estado("Ceará");
		Estado est2 = new Estado("são Paulo");

		Cidade cid1 = new Cidade("Fortaleza", est1);
		Cidade cid2 = new Cidade("São Paulo", est2);
		Cidade cid3 = new Cidade("Lorena", est2);

		est1.getCidades().addAll(Arrays.asList(cid1));
		est2.getCidades().addAll(Arrays.asList(cid2, cid3));

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
		
		Cliente cli1 = new Cliente("Diego Barros", "diego@gmail.com", "321654987-98", TipoCliente.PESSOA_FISICA);
		Cliente cli2 = new Cliente("Marcio Aragão", "marcio@gmail.com", "654321978-87", TipoCliente.PESSOA_JURIDICA);
		
		Endereco end1 =  new Endereco("Rua Rio Branco", "1212", "casa", "Bela Vista", "60440-590", cli1, cid1);
		Endereco end2 =  new Endereco("Rua Rio ABC", "112", "casa", "Encantado", "50780-890", cli2, cid2);
		Endereco end3 =  new Endereco("Rua Rio XYZ", "655", "Ap", "Avenida XPTO", "32154-658", cli2, cid3);
		
		cli1.getEnderecos().addAll(Arrays.asList(end1));
		cli2.getEnderecos().addAll(Arrays.asList(end2,end3));
		
		clienteRepository.saveAll(Arrays.asList(cli1,cli2));
		enderecoRepository.saveAll(Arrays.asList(end1,end2,end3));

	}

}
