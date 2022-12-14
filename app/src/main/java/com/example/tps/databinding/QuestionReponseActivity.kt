package com.example.tps.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.tps.R

class QuestionReponseActivity : AppCompatActivity() {
    lateinit var binding : ActivityQuestionReponseBinding
    lateinit var questions : Array<QuestionReponse>
    var score = 0
    var cpt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            DataBindingUtil.setContentView(this, R.layout.activity_question_reponse)

        questions = arrayOf(
            QuestionReponse("Fait-il froid dehors ?", true),
            QuestionReponse("Etes-vous un canard ?", false),
            QuestionReponse("La reponse est-elle 42 ?", true),
            QuestionReponse("Sommes-nous en Decembre ?", true),
            QuestionReponse("Les chaussettes de l'archiduchesse sont-elle seches et archiseches ?", true),
            QuestionReponse("La reponse a cette question est faux", false)
            )
        score = 0
        cpt = 0

        binding.question = questions[cpt]
        binding.score = score
        binding.compteur = cpt
        binding.nbQuestions = questions.size

        binding.button5.setOnClickListener {
            clickSurReponse(true)
        }

        binding.button6.setOnClickListener {
            clickSurReponse(false)
        }

        binding.button7.setOnClickListener {
            binding.button7.visibility = View.INVISIBLE
            binding.button5.isEnabled = true
            binding.button6.isEnabled = true
            score = 0
            cpt = 0

            binding.question = questions[cpt]
            binding.score = score
            binding.compteur = cpt
            binding.nbQuestions = questions.size
            binding.message = null
        }
    }

    fun clickSurReponse(reponse : Boolean) {
        cpt++
        if (binding.question?.reponse == reponse) score++
        if (cpt >= questions.size) {
            binding.message = when(score) {
                0 -> "Gros naze"
                in 1..(questions.size/2) -> "Pas ouf"
                in questions.size/2+1 until questions.size -> "Pas mal"
                questions.size -> "You're the boss"
                else -> "Pas cense arriver"
            }
            binding.button5.isEnabled = false
            binding.button6.isEnabled = false
            binding.question = null
            binding.score = score
            binding.compteur = cpt
            binding.button7.visibility = View.VISIBLE
        }
        else {
            binding.question = questions[cpt]
            binding.score = score
            binding.compteur = cpt
        }
    }
}