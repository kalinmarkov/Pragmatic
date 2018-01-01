package animals;

public class ZooMarket {
	public static void main(String[] args) {
		NinjaTurtle donatelo = new NinjaTurtle("Donatello", 17);
		NinjaTurtle rafaelo = new NinjaTurtle("Rafaello", 17);
		NinjaTurtle leonardo = new NinjaTurtle("Leonardo", 17);
		NinjaTurtle michelangelo = new NinjaTurtle("Michelanggelo", 17);
		
		DeepWaterBubbleCullator bulbuk1 = new DeepWaterBubbleCullator("Bulbuck1", 3);
		DeepWaterBubbleCullator bulbuk2 = new DeepWaterBubbleCullator("Bulbuck2", 4);
		
		Zoo zoo = new Zoo(10);
		zoo.addAnimal(donatelo);
		zoo.addAnimal(bulbuk1);
		zoo.addAnimal(rafaelo);
		zoo.addAnimal(bulbuk2);
		zoo.addAnimal(leonardo);
		zoo.addAnimal(michelangelo);
		
		zoo.walkAnimals();
	}
}