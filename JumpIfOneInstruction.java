package au.sweatkid.adventofcode2015.day23;


class JumpIfOneInstruction extends ConditionalJumpInstruction {

  JumpIfOneInstruction(RegisterName registerName, int offset) {
    super(registerName, offset);
  }

  @Override
  boolean test(Register register) {
    return register.getValue() == 1;
  }

  @Override
  public String toString() {
    return "jio " + registerName + ", " + offset;
  }
}
