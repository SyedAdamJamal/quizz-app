 package com.example.firstproject

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

 class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

     private var mCurrentPosition: Int = 1
     private var mQuestionsList: ArrayList<Question>? = null
     private var mSelectedOptionPosition: Int = 0

     private lateinit var progressBar: ProgressBar

     private lateinit var tv_question : TextView
     private lateinit var iv_image : ImageView
     private lateinit var tv_progress: TextView
     private lateinit var tv_option_one : TextView
     private lateinit var tv_option_two : TextView
     private lateinit var tv_option_three : TextView
     private lateinit var tv_option_four : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        progressBar = findViewById(R.id.progressBar)

        tv_question = findViewById(R.id.tv_question)
        iv_image = findViewById(R.id.iv_image)
        tv_progress = findViewById(R.id.tv_progress)
        tv_option_one = findViewById(R.id.tv_option_one)
        tv_option_two = findViewById(R.id.tv_option_two)
        tv_option_three = findViewById(R.id.tv_option_three)
        tv_option_four = findViewById(R.id.tv_option_four)

        mQuestionsList = Constants.getQuestions()

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)


    }

     private fun setQuestion(){
         mCurrentPosition = 1
         val question: Question? = mQuestionsList!!.get(mCurrentPosition - 1)

         defaultOptionsView()

         progressBar.progress = mCurrentPosition
         tv_progress.text = "$mCurrentPosition"+"/"+progressBar.max

         tv_question.text = question!!.question
         iv_image.setImageResource(question.image)
     }

     private fun defaultOptionsView(){
         val options = ArrayList<TextView>()
         options.add(0,tv_option_one)
         options.add(1, tv_option_two)
         options.add(2, tv_option_three)
         options.add(3,tv_option_four)

         for (option in options){
             option.setTextColor(Color.parseColor("#7A8089"))
             option.typeface = Typeface.DEFAULT
             option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
         }
     }

     override fun onClick(v: View?) {
         when(v?.id){
             R.id.tv_option_one ->{
                 selectedOptionView(tv_option_one, 1)
             }
             R.id.tv_option_two ->{
                 selectedOptionView(tv_option_two, 2)
             }
             R.id.tv_option_three ->{
                 selectedOptionView(tv_option_three, 3)
             }
             R.id.tv_option_four ->{
                 selectedOptionView(tv_option_four, 4)
             }
         }
     }

     private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
         defaultOptionsView()
         mSelectedOptionPosition = selectedOptionNum

         tv.setTextColor(Color.parseColor("#363A43"))
         tv.setTypeface(tv.typeface, Typeface.BOLD)
         tv.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
     }
 }