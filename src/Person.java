class Person {
  private String name;
  private int age;
  Pet[] pets;
  private PetManager petManager;

  public Person() {
    this.name = null;
    this.age = 0;
    this.pets = null;
    this.petManager = null;
  }

  public Person(
      String name,
      int age,
      int numbersOfPets,
      PetManager petManager) {
    this.name = name;
    this.age = age;
    this.pets = new Pet[numbersOfPets];
    this.petManager = petManager;
  }

  public boolean addPet(Pet pet) {
    return petManager.addPet(pet);
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public Pet[] getPets() {
    return pets;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setPets(int numbersOfPets) {
    this.pets = new Pet[numbersOfPets];
  }

  public int getPetCount() {
    return this.petManager.getPetCount();
  }

  public String getPetList() {
    return this.petManager.getPetList();
  }
}
