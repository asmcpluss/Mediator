
public class CDDriver extends Colleague{
	private String data;

	public CDDriver(Mediator m){
		super(m);
	}
	public String getData(){
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void readCD(){
		this.data = "this is video,this is sound";
		getMediator().changed(this);
	}
}
