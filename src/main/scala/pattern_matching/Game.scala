/**
  * Created by hsuan on 2017/3/7.
  */
package pattern_matching

object Game extends App{
  import Duel._
  val duel = new Duel()
  val a:Option[Thing] = duel.beat(Rock, Paper)
  val b:Option[Thing] = duel.beat(Rock, Scissor)
  val c:Option[Thing] = duel.beat(Rock, Rock)
  val d:Option[Thing] = duel.beat(Paper, Paper)
  val e:Option[Thing] = duel.beat(Paper, Scissor)
  val f:Option[Thing] = duel.beat(Paper, Rock)
  val g:Option[Thing] = duel.beat(Scissor, Paper)
  val h:Option[Thing] = duel.beat(Scissor, Scissor)
  val i:Option[Thing] = duel.beat(Scissor, Rock)
  println (a.getOrElse("Draw"))
  println (b.getOrElse("Draw"))
  println (c.getOrElse("Draw"))
  println (d.getOrElse("Draw"))
  println (e.getOrElse("Draw"))
  println (f.getOrElse("Draw"))
  println (g.getOrElse("Draw"))
  println (h.getOrElse("Draw"))
  println (i.getOrElse("Draw"))
}
