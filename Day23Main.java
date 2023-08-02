package au.sweatkid.adventofcode2015.day23;

import eu.happycoders.adventofcode2015.common.InputLoader;


class Day23Main {

  public static void main(String[] args) {
    String input = InputLoader.loadInput("day23/day23input.txt");

    System.out.println(Day23Solver.solvePart1(input));
    System.out.println(Day23Solver.solvePart2(input));
  }
}
