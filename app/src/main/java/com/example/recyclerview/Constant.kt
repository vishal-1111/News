package com.example.recyclerview

object Constant {
    private lateinit var dataList: ArrayList<rv_model>
    fun getData(): ArrayList<rv_model>{ dataList=ArrayList<rv_model>()
        dataList.add(rv_model(R.drawable.news,"HEADLINE 1","INDIA"))
        dataList.add(rv_model(R.drawable.global,"HEADLINE 2","INDIA"))
        dataList.add(rv_model(R.drawable.commentator,"HEADLINE 3","INDIA"))
        dataList.add(rv_model(R.drawable.politics,"HEADLINE 4","INDIA"))
        dataList.add(rv_model(R.drawable.globalwarming,"HEADLINE 5","INDIA"))
        dataList.add(rv_model(R.drawable.popcorn,"HEADLINE 6","INDIA"))
        dataList.add(rv_model(R.drawable.place,"HEADLINE 7","INDIA"))

        return dataList


    }
}