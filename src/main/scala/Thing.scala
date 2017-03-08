package com.example
class Thing {
  def beat(x: Thing, y: Thing) = ???
}

class Rock extends Thing   {
  override def toString: String = "Rock"
  def beat(y: Thing):Option[Thing]= y.toString() match {
    case "Rock" =>  None
    case "Paper" => Some(y)
    case "Scissor" => Some(this)
  }
}
class Paper extends Thing{
  override def toString: String = "Paper"
  def beat(y: Thing) = y.toString() match {
    case "Rock" =>None
    case "Paper" => Some(y)
    case "Scissor" => Some(this)
  }
}
class Scissor extends Thing {
  override def toString: String = "Scissor"
  def beat(y: Thing)= y.toString() match {
    case "Rock" => None
    case "Paper" => Some(y)
    case "Scissor" => Some(this)
  }
}
