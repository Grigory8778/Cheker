package com.pgh.cheker

import android.os.Build
import android.os.Bundle
import android.service.controls.actions.FloatAction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class RecFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.second_fragment, container, false)

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val add = view.findViewById<FloatingActionButton>(R.id.add_butt)
        val toolbar = view.findViewById<Toolbar>(R.id.tobar)
        val rs = view.findViewById<RecyclerView>(R.id.res)
        val layoutManager = LinearLayoutManager(context)
        val adapter = StAdapter(
            listOf(
                StResult(
                    "dsadasd",
                    "https://ribalych.ru/wp-content/uploads/2020/03/smeshnye-kartinki-nastroenie_001-1.jpg"
                ),
                StResult(
                    "aaaaaaaaaaaaaaa",
                    "https://i.pinimg.com/736x/d9/86/a9/d986a9476263f1e9399e2f0f6020f6da.jpg"
                ),
                StResult(
                    "ghhjaaaa",
                    "https://the-flow.ru/uploads/images/resize/830x0/adaptiveResize/15/77/94/35/48/bb23aed40cd7.jpg"
                )
            )
        )
        rs.layoutManager = layoutManager
        rs.adapter = adapter
        toolbar.inflateMenu(R.menu.menu_main)
        toolbar.setNavigationOnClickListener {
            requireActivity().finish()
        }
        add.setOnClickListener {
            (requireActivity() as? MainActivity?)?.secFragment()
        }
    }
    fun click(st: String){
        Toast.makeText(context, st, Toast.LENGTH_SHORT).show()
    }
}