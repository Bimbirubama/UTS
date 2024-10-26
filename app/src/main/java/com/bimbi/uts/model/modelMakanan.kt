package com.bimbi.uts.model

import com.bimbi.uts.R

data class modelMakanan(
    val image : Int,
    val nama : String
)
object Mocklist1 {

    fun getmodel(): List<modelMakanan> {
        val itemModel1 = modelMakanan(
            R.drawable.makanan,
            "Chicken Curry"

        )

        val itemModel2 = modelMakanan(
            R.drawable.makan2,
            "Chicken Burger"
        )

        val itemModel3 = modelMakanan(
            R.drawable.makan2,
            "Borccoli lasagna"
        )

        val itemModel4 =modelMakanan(
            R.drawable.makan5,
            "Borccoli lasagna"
        )

        val itemModel5 = modelMakanan(
            R.drawable.makanan,
            "Borccoli lasagna"
        )



        val itemList: ArrayList<modelMakanan> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList

    }
}

