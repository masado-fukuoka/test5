package fukuoka.masado.techacademy.test5

import android.util.Log

class BigDog: Dog {

    //superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int) : super(name, age) {
    }

    override fun say() {
        super.say()
        Log.d("kotlintest", "大好きな犬です。")
    }
}