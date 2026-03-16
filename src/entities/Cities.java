package entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cities {
	private String name;
	private List<Vertices> list = new ArrayList<>();
	
	public Cities() {
		
	}

	public Cities(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<Vertices> getList(){
		return list;
	}

	public void addList(Vertices vertices) {
		list.add(vertices);
		list.sort(Comparator.comparing(Vertices::getDistance));;
	}
	
	public void removeList(Vertices vertices) {
		list.remove(vertices);
	}
	
}
