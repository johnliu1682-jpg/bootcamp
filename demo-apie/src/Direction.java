public enum Direction {
  // 'E', 'W', 'S', 'N'
  EAST('E', 1), //
  SOUTH('S', 2), //
  WEST('W', -1), //
  NORTH('N', -2) //
  ;

  private char value;
  private int label;

  private Direction(char value, int label) {
    this.value = value;
    this.label = label;
  }
  public char getValue(){
    return this.value;
  }
  public int getLabel(){
    return this.label;
  }

  // ! Instance Method
  // public Direction opposite(){
  //   switch (this.value) {
  //     case 'E':
  //       return Direction.WEST;
  //       break;
  //     case 'S':
  //       return Direction.NORTH;
  //       break;
  //     case 'W':
  //       return Direction.EAST;
  //       break;
  //     case 'N':
  //       return Direction.SOUTH;
  //       break;
  //   }
  public Direction opposite() {
    for (Direction d: Direction.values()) {
      if (d.getLabel() * -1 == this.label) {
        return d;
      }
    }
    return null; // impossible
  }

  // ! Static method (check if two direction value are oppoiste)
  public static boolean isOpposite(Direction d1, Direction d2) {
    return d1.getLabel() * -1 == d2.getLabel();
  }

  public static void main(String[] args) {
    System.out.println(Direction.EAST.opposite());
    System.out.println(Direction.SOUTH.opposite());
    System.out.println(Direction.isOpposite(WEST, EAST));
  }

  
}
