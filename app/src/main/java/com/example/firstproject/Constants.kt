package com.example.firstproject

import java.util.ArrayList

object Constants{
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        //1
        val que1 = Question(1,
            "What country does this flag belong to?",
            R.drawable.background,
            "Jhonny Sins",
            "Mia Khalifa",
            "Daisy Stone",
            "Lana Rhoades",
            1)
        questionsList.add(que1)

        //2
        val que2 = Question(2,
            "What country does this flag belong to?",
            R.drawable.background,
            "Jhonny Sins",
            "Mia Khalifa",
            "Daisy Stone",
            "Lana Rhoades",
            1)
        questionsList.add(que2)

        //3
        val que3 = Question(3,
            "What country does this flag belong to?",
            R.drawable.background,
            "Jhonny Sins",
            "Mia Khalifa",
            "Daisy Stone",
            "Lana Rhoades",
            1)
        questionsList.add(que3)

        //4
        val que4 = Question(4,
            "What country does this flag belong to?",
            R.drawable.background,
            "Jhonny Sins",
            "Mia Khalifa",
            "Daisy Stone",
            "Lana Rhoades",
            1)
        questionsList.add(que4)

        //5
        val que5 = Question(5,
            "What country does this flag belong to?",
            R.drawable.background,
            "Jhonny Sins",
            "Mia Khalifa",
            "Daisy Stone",
            "Lana Rhoades",
            1)
        questionsList.add(que5)

        return questionsList
    }
}