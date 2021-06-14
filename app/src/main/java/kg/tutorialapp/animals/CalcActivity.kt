package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.math.BigDecimal
import java.math.RoundingMode

class CalcActivity : AppCompatActivity() {

    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var result: TextView
    lateinit var btn_add: Button
    lateinit var btn_subtract: Button
    lateinit var btn_multiply: Button
    lateinit var btn_divide: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calc_activity)

        num1 = findViewById(R.id.number1) as EditText
        num2 = findViewById(R.id.number2) as EditText
        result = findViewById(R.id.result) as TextView

        btn_add = findViewById(R.id.btnPlus) as Button
        btn_add.setOnClickListener() {
            add()
        }
        btn_subtract = findViewById(R.id.btnSub) as Button
        btn_subtract.setOnClickListener() {
            subtract()
        }
        btn_multiply = findViewById(R.id.btnMulti) as Button
        btn_multiply.setOnClickListener() {
            multiply()
        }
        btn_divide = findViewById(R.id.btnDiv) as Button
        btn_divide.setOnClickListener() {
            divide()
        }
    }

    fun add() {
        if (notEmpty()) {
            val first = num1.text.toString().trim().toBigDecimal()
            val second = num2.text.toString().trim().toBigDecimal()
            result.text = String.format("%s + %s = %s",first.toFloat(), second.toFloat(), first.add(second).toString())
        }
    }
    fun subtract() {
        if (notEmpty()) {
            val first = num1.text.toString().trim().toBigDecimal()
            val second = num2.text.toString().trim().toBigDecimal()
            result.text = String.format("%s - %s = %s",first.toFloat(), second.toFloat(), first.subtract(second).toString())
        }
    }
    fun multiply() {
        if (notEmpty()) {
            val first = num1.text.toString().trim().toBigDecimal()
            val second = num2.text.toString().trim().toBigDecimal()
            result.text = String.format("%s * %s = %s",first.toFloat(), second.toFloat(), first.multiply(second).toString())
        }
    }
    fun divide() {
        if (notEmpty()) {
            val first = num1.text.toString().trim().toBigDecimal()
            val second = num2.text.toString().trim().toBigDecimal()
            if (second.compareTo(BigDecimal.ZERO) == 0){
                num2.error = "На ноль делить нельзя."
            } else{result.text = String.format("%s / %s = %s",first.toFloat(), second.toFloat(), first.divide(second, 2, RoundingMode.HALF_UP).toString())}
        }
    }

    fun notEmpty(): Boolean {
        var inputNumber = true
        if (num1.text.toString().trim().isEmpty()) {
            num1.error = "Введите цифру."
            inputNumber = false
        }
        if (num2.text.toString().trim().isEmpty()) {
            num2.error = "Введите цифру."
            inputNumber = false
        }
        return inputNumber
    }
}