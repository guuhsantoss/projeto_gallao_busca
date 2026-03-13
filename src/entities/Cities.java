package entities;

import java.util.ArrayList;
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
	
	public void addList(Vertices v) {
		list.add(v);
	}
	
}
