public class Main {
	public static void main(String[] args) {
		/*
		 * Exerc�cio 2.
		 */
		EquipamentoEletronico tablet = new Tablet();
		
		EquipamentoEletronico smartphone = new Smartphone();
		
		Equipamento equipamento = new Equipamento();
		
		Object objeto = new Object();
		
		Movel movel = new Movel();
		
		Tablet tablet2 = new Tablet();
		
		Smartphone smartphone2 = new Smartphone();
		
		//objeto para equipamento convers�o impl�cita
		objeto = equipamento;
		System.out.println(objeto);
		
		//objeto para m�vel  convers�o impl�cita
		objeto=movel;
		System.out.println(objeto);
		
		//equipamento para tablet2 convers�o impl�cita
		equipamento=tablet2;
		System.out.println(equipamento);
		
		//equipamento para smartphone2 convers�o impl�cita
		equipamento=smartphone2;
		System.out.println(equipamento);
		
		//smartphone para tablet convers�o impl�cita
		smartphone=tablet;
		System.out.println(smartphone);
		
		//smartphone2 para tablet2 convers�o imposs�vel (erro de compila��o)
		//smartphone2=tablet2;
		//System.out.println(smartphone2);
		
		//equipamento para tablete convers�o expl�cita
		equipamento=(Equipamento) tablet;
		System.out.println(equipamento);
		
		//movel para tablete convers�o expl�cita
		movel=(Movel) tablet;
		System.out.println(movel);
		
		//tablet para equipamento convers�o expl�cita
		tablet=(EquipamentoEletronico) equipamento;
		System.out.println(tablet);
		
		
		/*
		 * Exerc�cio 3.
		 * 
		 * A. A classe ChowChow extends a classe Cachorro
		 * lodo o instanceof � verdadeiro
		 */
		ChowChow chowChow = new ChowChow();
		Boolean valor = chowChow instanceof Cachorro;
		System.out.println("Verdadeiro ou Falso: "+valor);
		
		/*
		 * B. A classe Cachorro n�o extends a classe ChowChow
		 * logo o instanceof � falso
		 */
		Cachorro cachorro = new Cachorro();
		Boolean valor2 = cachorro instanceof ChowChow;
		System.out.println("Verdadeiro ou Falso 2: "+valor2);
	}
}