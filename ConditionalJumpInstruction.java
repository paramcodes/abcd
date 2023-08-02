package au.sweatkid.adventofcode2015.day23;

import java.util.Objects;


abstract class ConditionalJumpInstruction implements Instruction {

  final RegisterName registerName;
  final int offset;

  ConditionalJumpInstruction(RegisterName registerName, int offset) {
    this.registerName = registerName;
    this.offset = offset;
  }

  RegisterName registerName() {
    return registerName;
  }

  int offset() {
    return offset;
  }

  abstract boolean test(Register register);

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    ConditionalJumpInstruction that = (ConditionalJumpInstruction) object;
    return offset == that.offset && registerName == that.registerName;
  }

  @Override
  public int hashCode() {
    return Objects.hash(registerName, offset);
  }
}
