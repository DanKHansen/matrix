case class Matrix(s: String):
   private val m: Vector[Vector[Int]] = s.split("\n").map(_.split(" ").map(_.toInt).toVector).toVector

   def row(r: Int): Vector[Int] = m(r)
   def column(c: Int): Vector[Int] = m.map(_(c))
