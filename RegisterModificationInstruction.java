package au.sweatkid.adventofcode2015.day23;

import java.util.Objects;


abstract class RegisterModificationInstruction implements Instruction {
  final RegisterName registerName;

  RegisterModificationInstruction(RegisterName registerName) {
    Objects.requireNonNull(registerName);
    this.registerName = registerName;
  }

  RegisterName registerName() {
    return registerName;
  }

  abstract void apply(Register register);

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    RegisterModificationInstruction that = (RegisterModificationInstruction) object;
    return registerName == that.registerName;
  }

  @Override
  public int hashCode() {
    return Objects.hash(registerName);
  }
}
