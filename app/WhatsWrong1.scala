package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    def support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  Supporter.city //What does this print ?
  Supporter.support //What does this print and why ? How to fix it ?
}
