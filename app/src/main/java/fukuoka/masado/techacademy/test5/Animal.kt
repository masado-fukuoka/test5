package fukuoka.masado.techacademy.test5

open abstract class Animal{

    //プロパティ
    var age: Int
    var name: String

    //引数付きコンストラクタ
    constructor(name: String, age: Int){
        this.name = name
        this. age = age
    }

    open abstract fun say()

}