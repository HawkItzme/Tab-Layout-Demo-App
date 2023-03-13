package com.example.tab_layoutdemoapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tab_layoutdemoapp.fragment.BooksFragments
import com.example.tab_layoutdemoapp.fragment.GameFragment
import com.example.tab_layoutdemoapp.fragment.MovieFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {


    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return BooksFragments()
            1 -> return GameFragment()
        }
        return MovieFragment()
    }
}

