/**
  * Created by hsuan on 2017/3/7.
  */
package pattern_matching

object Duel {

  sealed trait Thing {
    def beat(x: Thing, y: Thing) = ???
  }

  case object Rock extends Thing

  case object Paper extends Thing

  case object Scissor extends Thing

}

class Duel {

  import Duel._

  def beat(x: Thing, y: Thing) = x match {
    case Rock => y match {
      case Rock => None
      case Paper => Some(y)
      case Scissor => Some(x)
    }
    case Paper => y match {
      case Rock => Some(x)
      case Paper => None
      case Scissor => Some(y)
    }
    case Scissor => y match {
      case Rock => Some(y)
      case Paper => Some(x)
      case Scissor => None
    }
  }
}
