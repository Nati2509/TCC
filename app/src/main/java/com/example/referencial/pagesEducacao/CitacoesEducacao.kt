package com.example.referencial.pagesEducacao

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.referencial.ActivityFavoritos
import com.example.referencial.R

/**
 * A simple [Fragment] subclass.
 * Use the [ReferencialEducacao.newInstance] factory method to
 * create an instance of this fragment.
 */

class CitacoesEducacao : Fragment(), View.OnClickListener {
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_citacoes_educacao, container, false)
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
         * @return A new instance of fragment citacoesEducacao.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String?, param2: String?): CitacoesEducacao {
            val fragment = CitacoesEducacao()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
           // fragment.arguments = args
            return fragment
        }
    }

    override fun onClick(v: View?) {
        Log.i("INFO", "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
        when (v?.id) {
            R.id.fav1 -> {
                ActivityFavoritos.add("???A cultura est?? acima da diferen??a da condi????o social.??? - Conf??cio")
            }
            //     R.id.fav2 ->
        }
    }

}