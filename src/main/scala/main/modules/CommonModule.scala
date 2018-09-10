package main.modules

import com.softwaremill.macwire.wire
import main.providers.{EarnLotsOfMoney, MoneyEarningBusinessLogic}

trait CommonModule {
  lazy val moneyEarningBusinessLogic: MoneyEarningBusinessLogic = wire[MoneyEarningBusinessLogic]
  lazy val earnLotsOfMoney: EarnLotsOfMoney = wire[EarnLotsOfMoney]
}
