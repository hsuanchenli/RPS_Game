package delegating_object
import com.example._

class DuckRock extends Rock  {
  override def toString: String = "Rock"
  override def beat(y: Thing) = y.toString() match {
    case "Rock" => None
    case "Paper" => Some(y)
    case "Scissor" => Some(this)
  }
}
class DuckPaper extends Paper {
  override def toString: String = "Paper"
  override def beat(y: Thing)= y.toString() match {
    case "Rock" => Some(this)
    case "Paper" => None
    case "Scissor" =>Some(y)
  }
}

class DuckScissor extends Scissor {
  override def toString: String = "Scissor"
  override def beat(y: Thing)= y.toString() match {
    case "Rock" => Some(y)
    case "Paper" => Some(this)
    case "Scissor" => None
  }
}
