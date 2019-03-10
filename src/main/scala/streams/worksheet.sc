import streams.StringParserTerrain

object testLevel extends StringParserTerrain {
  val level =
    """ST
      |oo
      |oo""".stripMargin
  val testPos = Pos(1, 1)
}

val x = testLevel
//val z:Boolean =testLevel.vector(0)(5) != '-'
val tt = x.vector.lift(5)
val y = x.terrain(x.testPos)
val z= x.findChar('S',x.vector)

val rr= Level1.neighborsWithHistory(Block(Pos(1,1),Pos(1,1)), List(Left,Up))
