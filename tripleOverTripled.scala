def triple(i: Int): String = i.toString.repeat(3)

def zipWithTriple(digits: Range): Seq[(String, Int)] = 
  digits.map(triple).zip(digits)

def calc(i: Int, j: Int) = i / j / 3

@main
def tripleOverTripled: Unit =
  println(
    zipWithTriple((1 to 9)).map(pair => 
      s"""
         ${pair(0)}
      ${"\u2015".repeat(9)} = ${calc(pair(0).toInt, pair(1))} 
      ${pair(1)} + ${pair(1)} + ${pair(1)}
      """
    ).mkString("\n")
  )
