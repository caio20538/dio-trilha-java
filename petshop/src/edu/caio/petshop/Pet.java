package edu.caio.petshop;

public class Pet {
	
	private final String name;
	private boolean clean;
	
	public Pet(String name) {
		this.name = name;
		this.clean = false;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
	    return name;
	}

	
	
}
