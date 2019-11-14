package threads;

public class Bread {

	private String name;
	private float weight;

	public Bread(String name, float weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Bread [name=" + name + ", weight=" + weight + "]";
	}
	
	
}
