package com.example.referencial.pagesCultura

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.referencial.ActivityFavoritos
import com.example.referencial.ActivitySobre
import com.example.referencial.R
import com.example.referencial.pagesCultura.CitacoesCultura

class CitacoesCultura : Fragment(), View.OnClickListener {

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       return inflater!!.inflate(R.layout.fragment_citacoes_cultura,container,false)
      }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var button:Button = view.findViewById(R.id.btn_copy_ma1)
        button.setOnClickListener { view ->
            Log.i("INFO", "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
            when (view?.id) {
                R.id.fav1 -> {
                    ActivityFavoritos.add("“A cultura está acima da diferença da condição social.” - Confúcio")
                }
                //     R.id.fav2 ->
            }

        }
    }

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
        fun newInstance(param1: String?, param2: String?): CitacoesCultura {
            val fragment = CitacoesCultura()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }

    val listener = View.OnClickListener { view ->
        Log.i("INFO", "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
        when (view?.id) {
            R.id.fav1 -> {ActivityFavoritos.add("“A cultura está acima da diferença da condição social.” - Confúcio")}
            //     R.id.fav2 ->
        }
    }

    override fun onClick(v: View?) {
        Log.i("INFO", "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
        when (v?.id) {
            R.id.fav1 -> {ActivityFavoritos.add("“A cultura está acima da diferença da condição social.” - Confúcio")}
       //     R.id.fav2 ->
        }
 /*       ActivityFavoritos.add("“A arte é consolar aqueles que estão quebrados pela vida.” - Van Gogh")
        ActivityFavoritos.add("“A cultura, sob todas as formas de arte, de amor e de pensamento, através dos séculos, capacitou o homem a ser menos escravizado.” - André Malraux")
        ActivityFavoritos.add("“A música oferece à alma uma verdadeira cultura íntima e deve fazer parte da educação do povo.” - François Guizot")
        ActivityFavoritos.add("“A cultura assusta muito. É uma coisa apavorante para os ditadores. Um povo que lê nunca será um povo de escravos.” - António Lobo Antunes")
        ActivityFavoritos.add("“Um país não muda pela sua economia, sua política e nem mesmo sua ciência; muda sim pela sua cultura.” - Herbert José de Sousa")
        ActivityFavoritos.add("“Um povo sem conhecimento, saliência de seu passado histórico, origem e cultura é como uma árvore sem raízes.” - Bob Marley")
        ActivityFavoritos.add("“O que chamamos realidade é apenas o senso comum de nossa cultura. Ignorar outras culturas é estar cego para outras realidades.” - Alan Moore")
        ActivityFavoritos.add("“Cultura é o que fica depois de se esquecer tudo o que foi aprendido.” - Selma Lagerlof")
        ActivityFavoritos.add("“A arte existe para que a realidade não nos destrua.” - Friedrich Nietzsche")

  */
        val intent = Intent(activity, ActivityFavoritos :: class.java)
        startActivity(intent)
    }
}