package com.pgh.cheker

import android.os.Build
import android.os.Bundle
import android.view.*
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.appcompat.widget.Toolbar
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import android.widget.Toast.LENGTH_SHORT as LENGTH_SHORT1

class AddFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_content, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val edtxt = view.findViewById<EditText>(R.id.edtx)
        val toolbar = view.findViewById<Toolbar>(R.id.tobar)
        toolbar.inflateMenu(R.menu.menu_add)
        toolbar.setNavigationOnClickListener {
            (requireActivity() as? MainActivity?)?.back()
        }
        toolbar.setOnMenuItemClickListener {
            if (it.itemId == R.id.menu_add) {
                (requireActivity() as? interfAdd?)?.ToastData(edtxt.text.toString())
            }
            true
        }
    }
}
