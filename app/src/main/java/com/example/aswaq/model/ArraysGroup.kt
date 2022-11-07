package com.example.aswaq.model

import com.example.aswaq.R

class ArraysGroup {
    val list=ArrayList<ItemModel>()
    fun setFruit()
    {
        list.add(ItemModel("برتقال", R.drawable.po))
        list.add(ItemModel("تفاح", R.drawable.tf))
        list.add(ItemModel("فرولة", R.drawable.fro))
        list.add(ItemModel("عنب", R.drawable.aa))
        list.add(ItemModel("مانجو", R.drawable.man))
        list.add(ItemModel("رمان", R.drawable.rom))
        list.add(ItemModel("خوخ", R.drawable.ko))
        list.add(ItemModel("أناناس", R.drawable.ann))
        list.add(ItemModel("تين", R.drawable.tn))
        list.add(ItemModel("مشمش", R.drawable.msh))
    }
    fun setVegetable()
    {
        list.add(ItemModel("فلفل", R.drawable.flf))
        list.add(ItemModel("طماطم", R.drawable.tomato))
        list.add(ItemModel("خيار", R.drawable.kear))
        list.add(ItemModel("بطاطس", R.drawable.pot))
        list.add(ItemModel("جرجير", R.drawable.grg))
        list.add(ItemModel("باذنجان", R.drawable.ptn))
        list.add(ItemModel("كرنب", R.drawable.crn))
        list.add(ItemModel("أرنبيط", R.drawable.arn))
        list.add(ItemModel("بصل", R.drawable.psl))
        list.add(ItemModel("ثوم", R.drawable.som))
    }
    fun setVegetableFruit()
    {
        list.add(ItemModel("فلفل", R.drawable.flf))
        list.add(ItemModel("طماطم", R.drawable.tomato))
        list.add(ItemModel("خيار", R.drawable.kear))
        list.add(ItemModel("سمسم", R.drawable.smsm))
        list.add(ItemModel("بطاطس", R.drawable.pot))
        list.add(ItemModel("برتقال", R.drawable.po))
        list.add(ItemModel("جرجير", R.drawable.grg))
        list.add(ItemModel("بنجر", R.drawable.png))
        list.add(ItemModel("مانجو", R.drawable.man))
        list.add(ItemModel("باذنجان", R.drawable.ptn))
        list.add(ItemModel("كرنب", R.drawable.crn))
        list.add(ItemModel("أرنبيط", R.drawable.arn))
        list.add(ItemModel("بصل", R.drawable.psl))
        list.add(ItemModel("ثوم", R.drawable.som))
    }
}