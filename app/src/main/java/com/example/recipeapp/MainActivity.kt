package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.recipeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.mainContainer, CategoriesListFragment())
        fragmentTransaction.commit()

        binding.btnCategory.setOnClickListener {
//            println("btnCategory")
        }

        binding.btnFavorite.setOnClickListener {
            replaceFragment(FavoritesFragment(), R.id.fragmentContainer)
        }

//        initFragment()
    }

//    private fun initFragment() {
//        replaceFragment(CategoriesListFragment(), R.id.mainContainer)
//    }

    private fun replaceFragment(fragment: Fragment, containerId: Int) {
        supportFragmentManager.commit {
            replace(containerId, fragment)
            setReorderingAllowed(true)
            addToBackStack(null)
        }
    }

}

