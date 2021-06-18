package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat

class GesturesActivity : AppCompatActivity(), GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener{

    lateinit var gesture: TextView
    lateinit var gesture_result: TextView
    private lateinit var detectorCompat: GestureDetectorCompat

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gestures_activity)

        gesture = findViewById(R.id.gesture)
        gesture_result = findViewById(R.id.gesture_result)
        detectorCompat = GestureDetectorCompat(this, this )
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return if (detectorCompat.onTouchEvent(event)) {
            true
        }else {super.onTouchEvent(event)
        }
    }

    override fun onDown(event: MotionEvent): Boolean {return true
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {return true
    }

    override fun onLongPress(event: MotionEvent ){
        gesture.text = "Long press"
        gesture_result.text = event.toString()
    }

    override fun onScroll(
        e1: MotionEvent,
        e2: MotionEvent?,
        dX: Float,
        dY: Float): Boolean{return true
    }

    override fun onShowPress(event: MotionEvent){
        gesture.text = "Press"
        gesture_result.text = event.toString()
    }

    override fun onSingleTapUp(event: MotionEvent): Boolean{

        gesture.text = "Single Tap"
        gesture_result.text = event.toString()
        return true
    }

    override fun onDoubleTap(event: MotionEvent): Boolean{
        gesture.text = "Double Tap"
        gesture_result.text = event.toString()
        return true
    }

    override fun onDoubleTapEvent(event: MotionEvent): Boolean{
        return true
    }

    override fun onSingleTapConfirmed(event: MotionEvent?): Boolean {
        gesture.text = "Single Tap Confirmed "
        gesture_result.text = event.toString()
        return true
    }
}