package entities;

public class Vertices {
	private String name;
	private Integer distance;
	private Boolean teste = false;
	
	public Vertices(String name, Integer distance) {
		this.name = name;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Boolean getTeste() {
		return teste;
	}

	public void setTeste(Boolean teste) {
		this.teste = teste;
	}
	
	@Override
	public String toString(){
		return name + " " + distance;
	}
	
	
}
