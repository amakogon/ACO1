package week8.day2;

public class Salad {

  private final int kapusta;
  private final int oil;
  private int salt;
  private int cucumbers;
  private int tomat;
  private int onion;
  private int pepper;
  private int petrushka;
  private int ukrop;

  private Salad(SaladBuilder builder) {
    this.kapusta = builder.kapusta;
    this.oil = builder.oil;
    this.salt = builder.salt;
    this.cucumbers = builder.cucumbers;
    this.tomat = builder.tomat;
    this.onion = builder.onion;
    this.pepper = builder.pepper;
    this.petrushka = builder.petrushka;
    this.ukrop = builder.ukrop;
  }

  public int getKapusta() {
    return kapusta;
  }

  public int getOil() {
    return oil;
  }

  public int getSalt() {
    return salt;
  }

  public void setSalt(int salt) {
    this.salt = salt;
  }

  public int getCucumbers() {
    return cucumbers;
  }

  public void setCucumbers(int cucumbers) {
    this.cucumbers = cucumbers;
  }

  public int getTomat() {
    return tomat;
  }

  public void setTomat(int tomat) {
    this.tomat = tomat;
  }

  public int getOnion() {
    return onion;
  }

  public void setOnion(int onion) {
    this.onion = onion;
  }

  public int getPepper() {
    return pepper;
  }

  public void setPepper(int pepper) {
    this.pepper = pepper;
  }

  public int getPetrushka() {
    return petrushka;
  }

  public void setPetrushka(int petrushka) {
    this.petrushka = petrushka;
  }

  public int getUkrop() {
    return ukrop;
  }

  public void setUkrop(int ukrop) {
    this.ukrop = ukrop;
  }

  public static SaladBuilder builder(int kapusta, int oil) {
    return new SaladBuilder(kapusta, oil);
  }

  public static class SaladBuilder {
    private final int kapusta;
    private final int oil;
    private int salt;
    private int cucumbers;
    private int tomat;
    private int onion;
    private int pepper;
    private int petrushka;
    private int ukrop;

    private SaladBuilder(int kapusta, int oil) {
      this.kapusta = kapusta;
      this.oil = oil;
    }

    public SaladBuilder salt(int salt) {
      this.salt = salt;
      return this;
    }

    public SaladBuilder cucumbers(int cucumbers) {
      this.cucumbers = cucumbers;
      return this;
    }

    public SaladBuilder tomat(int tomat) {
      this.tomat = tomat;
      return this;
    }

    public SaladBuilder onion(int onion) {
      this.onion = onion;
      return this;
    }

    public SaladBuilder pepper(int pepper) {
      this.pepper = pepper;
      return this;
    }

    public SaladBuilder petrushka(int petrushka) {
      this.petrushka = petrushka;
      return this;
    }

    public SaladBuilder ukrop(int ukrop) {
      this.ukrop = ukrop;
      return this;
    }

    public Salad build() {
      return new Salad(this);
    }

  }
}
