
/**
 * �����ͣ��
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
		else if(c instanceof CDDriver){//CPU�ֽ����Ƶ��Ƶ
			this.opeCDDriverReadData((CDDriver)c);
		}
	}

	/**
	 * ��CD�ж�ȡ���ݣ�������CPU����
	 * @param c
	 */
	private void opeCDDriverReadData(CDDriver c){
		String data = c.getData();
		cpu.executeData(data);
	}
	
	/**
	 * CPU�ֽ����Ƶ֮�󽻸������Կ��ֱ𲥷���ʾ
	 * @param c
	 */
	private void opeCPU(CPU c){
		String soundData = c.getSoundData();
		String videoData = c.getVideoData();
		soundCard.soundData(soundData);
		videoCard.showData(videoData);
	}

}
