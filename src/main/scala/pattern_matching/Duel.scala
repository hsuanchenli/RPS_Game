/**
  * Created by hsuan on 2017/3/7.
  */
package pattern_matching

object Duel {
  sealed trait Thing{
    def beat(x:Thing, y:Thing) = ???
  }

  case object Rock extends Thing

  case object Paper extends Thing

  case object Scissor extends Thing
}

class Duel {
  import Duel._
  def beat(x: Thing, y: Thing) = x match {
    case Rock => y match {
      case Rock => Nil
      case Paper => y
      case Scissor => x
    }
    case Paper => y match {
      case Rock => x
      case Paper => Nil
      case Scissor => y
    }
    case Scissor => y match {
      case Rock => y
      case Paper => x
      case Scissor => Nil
    }
  }
}
