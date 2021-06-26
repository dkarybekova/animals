package kg.tutorialapp.animals

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.TextView


class FragmentArg : Fragment(R.layout.fragment_arg){

    private lateinit var listener: FragmentArgListener


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val textView = view.findViewById<TextView>(R.id.fragment_text)

        val messageFromMainActivity = arguments?.getString("Key2")

        if (messageFromMainActivity == "")
            listener.showToast()
        else textView.text = messageFromMainActivity

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is FragmentArgListener){
            listener = context
        }
    }
    companion object{
        const val TAG = "A"
    }
}