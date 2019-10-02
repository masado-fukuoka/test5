package fukuoka.masado.techacademy.test5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("まさどうさん", 29, "仕事")      // 名前をまさどう、年齢29歳で、Humanのインスタンスを作る
        human.say()  // まさどうがほえます
        human.think()


        val human2 = Human("たろうさん", 39,"趣味")    // 名前をたろう、年齢39歳で、humanインスタンスを作る
        human2.say()  // たろうがほえます
        human2.think()











    }
}



