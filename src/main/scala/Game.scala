/**
  * Created by hsuan on 2017/3/7.
  */
package com.example

import pattern_matching.Duel

object Game extends App{
  import Duel._
  import DuckDuel._
  val duel = new Duel()
  val duck_duel = new DuckDuel()
  println(duel.beat(Rock, Paper))
  println(duck_duel.beat(DuckPaper, DuckRock))
}
