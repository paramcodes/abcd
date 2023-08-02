package au.sweatkid.adventofcode2015.day23;


class HalfInstruction extends RegisterModificationInstruction {

  HalfInstruction(RegisterName registerName) {
    super(registerName);
  }

  @Override
  void apply(Register register) {
    register.setValue(register.getValue() / 2);
  }

  @Override
  public String toString() {
    return "hlf " + registerName;
  }
}
