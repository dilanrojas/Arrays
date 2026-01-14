class PetManager {
  private int size;
  private Pet[] list;

  public PetManager() {
    this.size = 0;
    this.list = null;
  }

  public PetManager(int numberOfPets) {
    this.size = 0;
    this.list = new Pet[numberOfPets];
  }

  public boolean addPet(Pet pet) {
    if (pet == null)
      return false;

    if (size >= list.length) {
      System.out.println("Pet array limit reached. Making it bigger...");
      list = growList();
    }

    list[size] = pet;
    size++;
    return true;
  }

  public boolean removePet(int index) {
    if (index < 0 || index >= size)
      return false;

    list[index] = null;
    leftShifting(index);

    return true;
  }

  public void leftShifting(int index) {
    if (index < 0 || index >= size)
      return;

    for (int i = index; i < size - 1; i++) {
      list[i] = list[i + 1];
    }

    size--;
    list[size] = null;
  }

  public int getSize() {
    return size;
  }

  public Pet[] getPets() {
    Pet[] pets = new Pet[this.size];

    for (int i = 0; i < this.size; i++) {
      pets[i] = this.list[i];
    }

    return pets;
  }

  public String getList() {
    String list = "=== Pets list ===\n";

    for (Pet p : getPets()) {
      list += p.toString() + "\n";
    }

    return list;
  }

  public boolean updatePets(Pet pet, int index) {
    if (pet == null)
      return false;

    if (index < 0 || index >= size)
      return false;

    if (list[index] == pet)
      return true;

    return false;
  }

  public Pet[] growList() {
    Pet[] newArray = new Pet[list.length + 5];

    for (int i = 0; i < list.length; i++) {
      newArray[i] = list[i];
    }

    return newArray;
  }
}
