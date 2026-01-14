class Main {
  public static void main(String[] args) {
    PetManager petManager = new PetManager(12);
    Person person = new Person("Rodolfo Arias", 29, 2, petManager);
    Pet dog = new Pet("Venom", "Dog");
    Pet cat = new Pet("Mini", "Cat");

    person.addPet(dog);
    person.addPet(cat);

    IOManager.printMessage("Pet's array size: " + person.getPetCount() + "\n");
    IOManager.printMessage(person.getPetList());
  }
}
