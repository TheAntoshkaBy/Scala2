package First

import scala.collection.mutable
import scala.collection.immutable.List

import scala.annotation.tailrec
import java.util.Scanner

import scala.collection.mutable.ListBuffer

//import First.Main.exponentiationRec

import scala.math

object Main {
  def main(args: Array[String]): Unit = {

    println(" RIM Baby : VIII = " + parseRomanString("VIII",0,0))
    println(" RIM Baby : XVIII = "+parseRomanString("XVIII",0,0))
    println(" RIM Baby : I = "+parseRomanString("I",0,0))

  }


  def parseRomanString(string: String, result : Int, index : Int): Int = {

    if(index == string.length())result
    else {
      string.charAt(index) match {
        case 'I' => parseRomanString(string, result + 1, index + 1)
        case 'V' => parseRomanString(string, result + 5, index + 1)
        case 'X' => parseRomanString(string, result + 10, index + 1)
        case 'L' => parseRomanString(string, result + 50, index + 1)
        case 'C' => parseRomanString(string, result + 100, index + 1)
        case 'D' => parseRomanString(string, result + 500, index + 1)
        case 'M' => parseRomanString(string, result + 1000, index + 1)

      }
    }
  }

  def chooseClass(obj: AnyRef) =
    obj match {
      case obj:Manager => obj.raisePayment()
      case obj:Granny => obj.knit()
      case obj:Developer => obj.work()
    }

  case class Manager(payment: Int) {
    def raisePayment(): Int =
      payment + 1
  }

  case class Developer(project: String) {
    def work(): String =
      "I am work with " + project
  }

  case class Granny(something: String) {
    def knit(): String =
      "I am knit " + something
  }
}