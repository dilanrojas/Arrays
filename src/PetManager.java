class PetManager {
  private int petCount;
  private Pet[] petList;

  public PetManager() {
    this.petCount = 0;
    this.petList = null;
  }

  public PetManager(int numberOfPets) {
    this.petCount = 0;
    this.petList = new Pet[numberOfPets];
  }

  public boolean addPet(Pet pet) {
    if (pet == null)
      return false;

    petList[petCount++] = pet;
    return true;
  }

  public int getPetCount() {
    return petCount;
  }

  public String getPetList() {
    String list = "=== Pets list ===\n";

    for (Pet p : petList) {
      if (p != null)
        list += p.toString() + "\n\n";
    }

    return list;
  }
}
