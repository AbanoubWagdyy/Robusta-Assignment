package com.robusta.ui.home.ui

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope

import javax.inject.Inject
import com.robusta.R
import com.robusta.di.Injectable
import com.robusta.di.injectViewModel

class HomeFragment : Fragment(R.layout.fragment_home), Injectable {

    companion object {
        fun newInstance() =
            HomeFragment()
    }

    init {
        lifecycleScope.launchWhenStarted {
            initOnStart()
        }
    }

    private fun initOnStart() {
        viewModel = injectViewModel(viewModelFactory)
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: HomeVM
}