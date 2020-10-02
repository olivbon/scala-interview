package com.particeep.test

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
  def encodeParamsInUrl(params: Map[String, String]): String = {
    params.foldLeft(""){
      case (url, value) if url == "" => "?" + url + value._1 + "=" + value._2
      case (url, value) => url + "&" + value._1 + "=" + value._2
    }
  }


  /**
    * Test if a String is an email
    */
  def isEmail(maybeEmail: String): Boolean = maybeEmail.matches("[A-Za-z0-9]*@[a-z]*.[a-z]*")


  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i:Int, n:Int):Int = {
    def power2(acc: Int)(j: Int, m: Int): Int = {
      m match {
        case 0 => acc
        case _ => power2(acc * j)(j, m - 1)
      }
    }

    power2(1)(i, n)
  }
}
