package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		//1°
		//System.out.println("Processo Seletivo");
		/*analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);*/
		
		//2°
		//selecaoCandidatos();
		
		//3°
		//imprimirSelecionados();
		
		//4°
		String [] candidatos = {"CARLOS","LETICIA","BERNARDO","MARIA","THIAGO"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	//4°
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1; 
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
			
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");
	}
	
	//4°
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	//3°
	static void imprimirSelecionados() {
		String [] candidatos = {"CARLOS","LETICIA","BERNARDO","MARIA","THIAGO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);
		}
		System.out.println();
		System.out.println("Forma abrevida de interação for each");
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi : " + candidato);
		}
	}
	
	
	
	//2°
	static void selecaoCandidatos() {
		
		String [] candidatos = {"CARLOS","LETICIA","BERNARDO","MARIA","THIAGO","ROSANGELA","LE","LEANDRO","LUANA","KAIQUE"};
		
		int candidatosSelecionados = 0;
		int canditadosAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && canditadosAtual < candidatos.length) {
			String candidato = candidatos[canditadosAtual];
			double salarioPretendito = valorPretendido();
			
			System.out.println("O Candidato " + candidato + " Solicitou salário " + salarioPretendito);
			
			if(salarioBase >= salarioPretendito) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			
			canditadosAtual++;
		}
	}
	//2°
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	//1°
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
