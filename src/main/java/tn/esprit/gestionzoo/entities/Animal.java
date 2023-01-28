package tn.esprit.gestionzoo.entities;

public class Animal {
	private String family;
	private String name;
	private int age;
	private boolean isMammal;

	public Animal(String family, String name, int age, boolean isMammal) {
		this.family = family;
		this.name = name;
		this.isMammal = isMammal;
		setAge(age);
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			this.age = 0;
			System.err.println("negatif age");
		}
	}

	public boolean isMammal() {
		return isMammal;
	}

	public void setMammal(boolean isMammal) {
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
