package main

import main.modules.CommonModule

object App extends App with CommonModule {
  val moneyEarned = earnLotsOfMoney.doIt()
  println(moneyEarned)
}
