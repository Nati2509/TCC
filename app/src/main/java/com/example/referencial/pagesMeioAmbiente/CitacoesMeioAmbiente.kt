package com.example.referencial.pagesMeioAmbiente

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Context.CLIPBOARD_SERVICE
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import com.example.referencial.ActivityFavoritos
import com.example.referencial.R
import com.example.referencial.pagesEducacao.DadosEducacao


class CitacoesMeioAmbiente : Fragment(), View.OnClickListener {

    //https://www.youtube.com/watch?v=zqArgPfJq3g&ab_channel=Programming-kotlin

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = requireArguments().getString(ARG_PARAM1)
            mParam2 = requireArguments().getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /////////////////////////////////////////////////////////////////////////

        /*val texto1 = getView()?.findViewById<TextView>(R.id.text_ma1)
        val botao = getView()?.findViewById<Button>(R.id.btn_copy_ma1)

        botao.setOnClickListener {
            val myClipboard = context?.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val myClip: ClipData = ClipData.newPlainText("TextView", texto1.toString())
            myClipboard.setPrimaryClip(myClip)

            Toast.makeText(getActivity(), "Toast your message", Toast.LENGTH_SHORT).show();

        }*/

        // opção 2

        /*val texto1 = getView()?.findViewById<TextView>(R.id.text_ma1)
        val botao1 = getView()?.findViewById<Button>(R.id.btn_copy_ma1)

        botao1.setOnClickListener {
            val clipboardManager = getSystemService(AppCompatActivity.CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("TextView", texto1?.text.toString())

            clipboardManager.setPrimaryClip(clipData)

            // Toast.makeText(this, "Texto copiado", Toast.LENGTH_SHORT).show()

            Toast.makeText(getActivity(), "Toast your message", Toast.LENGTH_SHORT).show();

        }*/
        /////////////////////////////////////////////////////////////////////////////////////////////////

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_citacoes_meio_ambiente, container, false)
    }

    // FUNÇÃO COPIAR > onde colocar?



    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment dadosEducacao.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String?, param2: String?): DadosEducacao {
            val fragment = DadosEducacao()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onClick(v: View?) {
        Log.i("INFO", "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
        when (v?.id) {
            R.id.fav1 -> {
                ActivityFavoritos.add("“A cultura está acima da diferença da condição social.” - Confúcio")
            }
            //     R.id.fav2 ->
        }
    }

}