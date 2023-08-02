package au.sweatkid.adventofcode2015.day23;

import java.util.List;


class Day23Solver {

  static int solvePart1(String input) {
    List<Instruction> instructions = PuzzleInputParser.parse(input);

    CpuEmulator cpuEmulator = new CpuEmulator(instructions);
    cpuEmulator.run();

    return cpuEmulator.getRegisterB();
  }

  static int solvePart2(String input) {
    List<Instruction> instructions = PuzzleInputParser.parse(input);

    CpuEmulator cpuEmulator = new CpuEmulator(instructions);
    cpuEmulator.setRegisterA(1);
    cpuEmulator.run();

    return cpuEmulator.getRegisterB();
  }
}
