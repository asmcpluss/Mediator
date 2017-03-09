
public class Main {
	public static void main(String args[]){
		MainBoard m = new MainBoard();
		CDDriver cd = new CDDriver(m);
		SoundCard sc = new SoundCard(m);
		VideoCard vc = new VideoCard(m);
		CPU cpu = new CPU(m);
		m.setCdDriver(cd);
		m.setCpu(cpu);
		m.setSoundCard(sc);
		m.setVideoCard(vc);
		cd.readCD();
	}

}
