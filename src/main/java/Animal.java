
public class Animal {
	String family;
	String name;
	int age;
	boolean isMammal;
	
	public Animal(String family, String name, int age, boolean isMammal) {
		this.family = family;
		this.name = name;
		this.age = age;
		this.isMammal = isMammal;
	}
	
	



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (family == null) {
			if (other.family != null)
				return false;
		} else if (!family.equals(other.family))
			return false;
		if (isMammal != other.isMammal)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
	}
	
	
	

}

