class PetManager {
  private int petCount;
  private Pet[] petList;

  public PetManager() {
    this.petCount = 0;
    this.petList = null;
  }

  public PetManager(int numberOfPets) {
    this.petCount = numberOfPets;
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
}
