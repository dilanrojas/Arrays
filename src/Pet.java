class Pet {
  private String petName;
  private String type;

  public Pet() {
    this.petName = null;
    this.type = null;
  }

  public Pet(String petName, String type) {
    this.petName = petName;
    this.type = type;
  }

  public String getPetName() {
    return this.petName;
  }

  public String getType() {
    return this.type;
  }

  public void setPetName(String petName) {
    this.petName = petName;
  }

  public void setType(String type) {
    this.type = type;
  }
}
