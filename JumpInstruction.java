package au.sweatkid.adventofcode2015.day23;

import java.util.Objects;


class JumpInstruction implements Instruction {

  private final int offset;

  JumpInstruction(int offset) {
    this.offset = offset;
  }

  int offset() {
    return offset;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    JumpInstruction that = (JumpInstruction) object;
    return offset == that.offset;
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset);
  }

  @Override
  public String toString() {
    return "jmp " + offset;
  }
}
