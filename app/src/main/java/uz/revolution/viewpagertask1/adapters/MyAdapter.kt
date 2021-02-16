package uz.revolution.viewpagertask1.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import uz.revolution.viewpagertask1.fragments.ImageFragment
import uz.revolution.viewpagertask1.models.MyModel

class MyAdapter(var data: ArrayList<MyModel>, fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int =data.size

    override fun getItem(position: Int): Fragment {
        return ImageFragment.newInstance(data[position])
    }


}