package com.apprinka.api.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.apprinka.api.FollowersFragment
import com.apprinka.api.FollowingFragment

class PagerAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val pages = listOf(
        FollowersFragment(),
        FollowingFragment()
    )


    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Follower"
            else -> "Following"
        }
    }
}