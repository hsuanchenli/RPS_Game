package delegating_object
import com.example.Thing
/**
  * Created by hsuan on 2017/3/8.
  */

object DuckGame extends App{
  val dr = new DuckRock
  val dp = new DuckPaper
  val ds = new DuckScissor
  val a:Option[Thing] = dr beat dp
  val b:Option[Thing] = dr beat ds
  val c:Option[Thing] = dr beat dr
  val d:Option[Thing] = dp beat dp
  val e:Option[Thing] = dp beat ds
  val f:Option[Thing] = dp beat dr
  val g:Option[Thing] = ds beat dp
  val h:Option[Thing] = ds beat ds
  val i:Option[Thing] = ds beat dr
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
