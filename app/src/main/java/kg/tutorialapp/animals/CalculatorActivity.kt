package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_activity)

        var calcText: TextView = findViewById(R.id.result)

        fun appendOnClick(clear: Boolean, string: String){
            calcText.append(string)
        }

        fun clear(){
            calcText.text = ""
        }

        fun calculate(){
            try {
                val text = ExpressionBuilder(calcText.text.toString()).build().evaluate()
                val longText = text.toLong()

                if (text == longText.toDouble()){
                    calcText.text = longText.toString()
                }else{
                    calcText.text = text.toString()
                }
            } catch (e:Exception){
                Toast.makeText(this@CalculatorActivity,e.message,Toast.LENGTH_LONG).show()
            }
        }
        fun back(){
            val number = calcText.text.toString()
            if (number.isNotEmpty()) {
                calcText.text = number.substring(0,number.length - 1)
            }

            calcText.text = ""

        }

        val btn1 = findViewById<Button>(R.id.btn_1)
        val btn2 = findViewById<Button>(R.id.btn_2)
        val btn3 = findViewById<Button>(R.id.btn_3)
        val btn4 = findViewById<Button>(R.id.btn_4)
        val btn5 = findViewById<Button>(R.id.btn_5)
        val btn6 = findViewById<Button>(R.id.btn_6)
        val btn7 = findViewById<Button>(R.id.btn_7)
        val btn8 = findViewById<Button>(R.id.btn_8)
        val btn9 = findViewById<Button>(R.id.btn_9)
        val btn0 = findViewById<Button>(R.id.btn_0)
        val dot = findViewById<Button>(R.id.btn_dot)

        btn1.setOnClickListener { appendOnClick(true, "1")}
        btn2.setOnClickListener { appendOnClick(true, "2")}
        btn3.setOnClickListener { appendOnClick(true, "3")}
        btn4.setOnClickListener { appendOnClick(true, "4")}
        btn5.setOnClickListener { appendOnClick(true, "5")}
        btn6.setOnClickListener { appendOnClick(true, "6")}
        btn7.setOnClickListener { appendOnClick(true, "7")}
        btn8.setOnClickListener { appendOnClick(true, "8")}
        btn9.setOnClickListener { appendOnClick(true, "9")}
        btn0.setOnClickListener { appendOnClick(true, "0")}
        dot.setOnClickListener  { appendOnClick(true, ".")}

        val plus = findViewById<Button>(R.id.btn_plus)
        val minus = findViewById<Button>(R.id.btn_substract)
        val divide = findViewById<Button>(R.id.btn_divide)
        val multiply = findViewById<Button>(R.id.btn_multiply)
        val bntOpenB = findViewById<Button>(R.id.btn_open)
        val btnCloseB = findViewById<Button>(R.id.btn_close)

        plus.setOnClickListener { appendOnClick(false, "+") }
        minus.setOnClickListener { appendOnClick(false, "-") }
        divide.setOnClickListener { appendOnClick(false, "/") }
        multiply.setOnClickListener {appendOnClick(false, "*")  }
        bntOpenB.setOnClickListener { appendOnClick(false, "(") }
        btnCloseB.setOnClickListener {appendOnClick(false, ")")  }

        val btnClear = findViewById<Button>(R.id.btn_clear)
        val btnEqual = findViewById<Button>(R.id.btn_equal)
        val btnBack = findViewById<Button>(R.id.btn_back)

        btnClear.setOnClickListener {
            clear()
        }
        btnEqual.setOnClickListener {
            calculate()
        }
        btnBack.setOnClickListener {
            back()
        }


    }

}