package br.com.doug.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.doug.businesscard.R
import br.com.doug.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //o android studio inicia com essa view mas o google recomenda o view binding para o kotlin
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

    }
}