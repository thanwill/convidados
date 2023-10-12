package com.tancy.convidados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tancy.convidados.databinding.ActivityMainBinding
import com.tancy.convidados.fragments.CadastroFragment
import com.tancy.convidados.fragments.ListaFragment
import com.tancy.convidados.fragments.PerfilFragment

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding: ActivityMainBinding

    private val cadastroFragment = CadastroFragment()
    private val listaFragment = ListaFragment()
    private val perfilFragment = PerfilFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFragmentLista.setOnClickListener(this)
        binding.buttonFragmentCadastro.setOnClickListener(this)

        // define o fragmento inicial
        trocarFragmento(listaFragment)

    }

    fun trocarFragmento(fragmento: androidx.fragment.app.Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragmento)
            commit()
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button_fragment_cadastro -> {
                trocarFragmento(cadastroFragment)
            }
            R.id.button_fragment_lista -> {
                trocarFragmento(listaFragment)
            }
        }
    }


}