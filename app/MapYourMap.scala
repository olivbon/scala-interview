package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap {

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")

  val namesInDepartments:Map[String, List[String]] = devDepartments.foldLeft(Map[String,List[String]]()) {
    case (newMap, value) if newMap.contains(value._2) => newMap + (value._2 -> (devNames.getOrElse(value._1,"") :: newMap.getOrElse(value._2,List())))
    case (newMap, value) => newMap + (value._2 -> List(devNames.getOrElse(value._1,"")))
  }

}
