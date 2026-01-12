class Main {
  public static void main(String[] args) {
    // int[] numbers = { 10, 20, 30, 40, 50 };
    // String[] fruits = new String[3];
    //
    // System.out.println(numbers[2]);
    // System.out.println(fruits[2]);
    //
    // for (int i = 0; i <= numbers.length; i++) {
    // System.out.println(numbers[i]);
    // }

    PetManager petManager = new PetManager(12);
    Person person = new Person("Rodolfo Arias", 29, 2, petManager);

    // System.out.println(person.getPets()[0].getPetName());
    //
    // for (Pet pet : person.getPets()) {
    // System.out.println(pet.getPetName());
    // }

    System.out.println(petManager.getPetCount());
  }
}
