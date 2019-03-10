import streams.StringParserTerrain

object testLevel extends StringParserTerrain {
  val level =
    """ST
      |oo
      |oo""".stripMargin
  val testPos = Pos(1, 1)
}

val x = testLevel
x.sol
