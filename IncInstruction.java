package au.sweatkid.adventofcode2015.day23;


class IncInstruction extends RegisterModificationInstruction {

  IncInstruction(RegisterName registerName) {
    super(registerName);
  }

  @Override
  void apply(Register register) {
    register.setValue(register.getValue() + 1);
  }

  @Override
  public String toString() {
    return "inc " + registerName;
  }
}
