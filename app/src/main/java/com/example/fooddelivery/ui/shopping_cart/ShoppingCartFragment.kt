package com.example.fooddelivery.ui.shopping_cart

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.fooddelivery.R
import com.example.fooddelivery.databinding.FragmentShoppingCartBinding
import com.example.fooddelivery.ui.base.BaseFragment

class ShoppingCartFragment : BaseFragment<FragmentShoppingCartBinding>(FragmentShoppingCartBinding::inflate) {

    private val viewModel: ShoppingCartViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //start to code
    }

}