package one_to_many_uni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String provider;
	private int imrc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getImrc() {
		return imrc;
	}
	public void setImrc(int imrc) {
		this.imrc = imrc;
	}
	@Override
	public String toString() {
		return "Sim [id=" + id + ", provider=" + provider + ", imrc=" + imrc + "]";
	}
	
	

}
