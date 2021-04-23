package com.pgh.cheker

import android.os.Build
import android.os.Bundle
import android.view.*
import android.widget.Toolbar
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment

class AddBut : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_add_content, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolb = view.findViewById<Toolbar>(R.id.tobar)
        toolb.inflateMenu(R.menu.menu_add)
    }
}