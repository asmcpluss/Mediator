
/**
 * 具体调停类
 * @author Dell
 *
 */
public class MainBoard implements Mediator{
	private CDDriver cdDriver = null;
	private CPU cpu = null;
	private VideoCard videoCard = null;
	private SoundCard soundCard = null;
	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
	@Override
	public void changed(Colleague c) {
		if(c instanceof CPU){
			this.opeCPU((CPU)c);
		}
		else if(c instanceof CDDriver){//CPU分解好视频音频
			this.opeCDDriverReadData((CDDriver)c);
		}
	}

	/**
	 * 从CD中读取数据，并交给CPU处理
	 * @param c
	 */
	private void opeCDDriverReadData(CDDriver c){
		String data = c.getData();
		cpu.executeData(data);
	}
	
	/**
	 * CPU分解好视频之后交给声卡显卡分别播放显示
	 * @param c
	 */
	private void opeCPU(CPU c){
		String soundData = c.getSoundData();
		String videoData = c.getVideoData();
		soundCard.soundData(soundData);
		videoCard.showData(videoData);
	}

}
