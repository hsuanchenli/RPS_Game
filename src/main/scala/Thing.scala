package com.example
class Thing
trait Beat{
  def beat(x: Beat, y: Beat) = ???
}
class Rock extends Thing with Beat  {
  override def toString: String = "Rock"
  override def beat(x: Beat, y: Beat):Beat = x.toString() match {
    case "Rock" => ???
    case "Paper" => y
    case "Scissor" => x
  }
}
class Paper extends Beat {
  override def toString: String = "Paper"
  override def beat(x: Beat, y: Beat):Beat = x.toString() match {
    case "Rock" => ???
    case "Paper" => y
    case "Scissor" => x
  }
}
class Scissor extends Beat {
  override def toString: String = "Scissor"
  override def beat(x: Beat, y: Beat):Beat = x.toString() match {
    case "Rock" => ???
    case "Paper" => y
    case "Scissor" => x
  }
}
