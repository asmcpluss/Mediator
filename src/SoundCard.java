
public class SoundCard extends Colleague{

	public SoundCard(Mediator m){
		super(m);
	}
	public void soundData(String data){
		System.out.println("sound: "+data);
	}
}
