package au.sweatkid.adventofcode2015.day23;


class TripleInstruction extends RegisterModificationInstruction {

  TripleInstruction(RegisterName registerName) {
    super(registerName);
  }

  @Override
  void apply(Register register) {
    register.setValue(register.getValue() * 3);
  }

  @Override
  public String toString() {
    return "tpl " + registerName;
  }
}
