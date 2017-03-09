
public class CPU extends Colleague{
	private String videoData="";
	private String soundData="";
	
	public CPU(Mediator m){
		super(m);
	}
	
	public String getVideoData(){
		return videoData;
	}

	public String getSoundData(){
		return soundData;
	}
	
	public void executeData(String data){
		String[] arr = data.split(",");
		this.videoData = arr[0];
		this.soundData = arr[1];
		getMediator().changed(this);
	}
}
