package main.providers

class EarnLotsOfMoney(moneyEarningBusinessLogic: MoneyEarningBusinessLogic) {
  def doIt(): String = {
    moneyEarningBusinessLogic.earnMoney(1000000)
  }
}