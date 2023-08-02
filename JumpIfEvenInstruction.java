package au.sweatkid.adventofcode2015.day23;


class JumpIfEvenInstruction extends ConditionalJumpInstruction {

  JumpIfEvenInstruction(RegisterName registerName, int offset) {
    super(registerName, offset);
  }

  @Override
  boolean test(Register register) {
    return register.getValue() % 2 == 0;
  }

  @Override
  public String toString() {
    return "jie " + registerName + ", " + offset;
  }
}
