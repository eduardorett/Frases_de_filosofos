package ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.devedu.novidades.R
import Ifra.Motivationconstants
import Ifra.Securityclasses
import android.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import repositorio.Mock


private lateinit var mSecurityclasses: Securityclasses


private var mphraseFilter :Int = Motivationconstants.FRASEFILTER.ALL

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportActionBar !=null){  // necessario para tirar a support bar
            supportActionBar!!.hide()
        }

        frase.text = "Aguardando a escolha..."
////////////////////////////////////////////////////////////////////////////////////

        buttonnewphase.setOnClickListener {
            random()
        }
        nietchze.setOnClickListener{
            onClick(it)
        }

        platao.setOnClickListener{
            onClick(it)
        }

        montaigne.setOnClickListener{
            onClick(it)
        }

        spinoza.setOnClickListener{
            onClick(it)
        }

        AlertDialog.Builder(this)
            .setTitle("Frases de filósofos")
            .setMessage("Esse app te permite gerar frases dos filósofos clicando em suas fotos, o botão geral entrega uma frase aleatória")
            .setPositiveButton("Sim!") { _,_ ->
                Toast.makeText(this,"Vamos começar!", Toast.LENGTH_SHORT).show()
            }.show()


    }

/////////////////////////////////////////////////////////////////////////////////////////////

    override fun onClick(view: View) {
        val id = view.id

        val listFitler = listOf(R.id.nietchze,R.id.platao,R.id.montaigne,R.id.spinoza)

        if (id == R.id.buttonnewphase){
            handlenewphase()
        } else if (id in listFitler) {
            handlephilter(id)
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    fun handlenewphase() {
        frase.text = Mock().getPhrase(mphraseFilter)
    }
    ////////////////////////////////////////////////////////////////////////////////
    fun handlephilter(id: Int) {

        when(id){
            R.id.buttonnewphase -> {
                mphraseFilter = Motivationconstants.FRASEFILTER.ALL

            }
            R.id.nietchze -> {
                mphraseFilter = Motivationconstants.FRASEFILTER.NIETCHZE
                frase.text = Mock().getPhrase(mphraseFilter)

            }
            R.id.platao -> {
                mphraseFilter = Motivationconstants.FRASEFILTER.PLATAO
                frase.text = Mock().getPhrase(mphraseFilter)

            }
            R.id.montaigne -> {
                mphraseFilter = Motivationconstants.FRASEFILTER.MONTAIGNE
                frase.text = Mock().getPhrase(mphraseFilter)

            }
            R.id.spinoza -> {
                mphraseFilter = Motivationconstants.FRASEFILTER.SPINOZA
                frase.text = Mock().getPhrase(mphraseFilter)

            }
        }
    }

    fun random(){
        mphraseFilter = Motivationconstants.FRASEFILTER.ALL
        frase.text = Mock().getPhrase(mphraseFilter)
    }







}



/////////////////////////////////////////////////////////////////////////////////////////////////////





////////////////////////////////////////////////////////////////////////////
