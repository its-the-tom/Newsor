package com.itsthetom.newsor

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.itsthetom.newsor.adapters.LatestNewsRvAdapter
import com.itsthetom.newsor.adapters.NewsAdapter
import com.itsthetom.newsor.databinding.FragmentHomeBinding
import com.itsthetom.newsor.datamodel.DummyData


class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding
    private lateinit var latestNewsAdapter:LatestNewsRvAdapter
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater)

        initViews()
        return binding.root
    }

    private fun initViews() {
        latestNewsAdapter= LatestNewsRvAdapter {
            //Latest News Item clicked, take actions
        }

        newsAdapter=NewsAdapter {
            //News Item clicked, take action
        }


        binding.rvLatestNews.adapter=latestNewsAdapter
        latestNewsAdapter.submitList(DummyData.latestNews)


        binding.rvNews.adapter=newsAdapter
        newsAdapter.submitList(DummyData.latestNews)

         if (resources.configuration.orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) {
            binding.rvNews.layoutManager=LinearLayoutManager(context)
            Log.d("TAG","Portait")
        }else{
         binding.rvNews.layoutManager=GridLayoutManager(context,2,GridLayoutManager.VERTICAL,false)
         Log.d("TAG","Landscape")
     }
    }




}