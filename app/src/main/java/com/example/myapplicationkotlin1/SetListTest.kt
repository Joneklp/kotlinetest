
package com.example.myapplicationkotlin1

class SetListTest(val name : String,val  age : Int) {

    // 反射是动态的获取类中的成员
    fun greet(){
        println("这个是类中的成员的名字和年龄：$name,年龄是$age")
    }

}
fun main() {


//    // 获取类中的所有的属性
//    val kClass = SetListTest::class
//    // 获取类的属性信息。
//   val  pro=kClass.members
//    pro.forEach{  println( it.name)}



}