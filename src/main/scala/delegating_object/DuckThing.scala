package delegating_object
import com.example._

class DuckRock extends pattern_matching.Rock  {
  override def toString: String = "Rock"
  override def beat(x: Beat, y: Beat):Beat = x.toString() match {
    case "Rock" => ???
    case "Paper" => y
    case "Scissor" => x
  }
}
class DuckPaper extends Paper {
  override def toString: String = "Paper"
  override def beat(x: Beat, y: Beat):Beat = x.toString() match {
    case "Rock" => ???
    case "Paper" => y
    case "Scissor" => x
  }
}

class DuckScissor extends Scissor {
  override def toString: String = "Scissor"
  override def beat(x: Beat, y: Beat):Beat = x.toString() match {
    case "Rock" => ???
    case "Paper" => y
    case "Scissor" => x
  }
}
