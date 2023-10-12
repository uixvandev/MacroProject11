package com.mobile.macroprojectkelompok11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://images.unsplash.com/photo-1597165826924-f0e9fb81762e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2940&q=80","Kesehatanmu adalah aset berharga. Teruslah peduli dengan kualitas udara di sekitarmu!"))
        imageList.add(SlideModel("https://images.unsplash.com/photo-1611273426858-450d8e3c9fce?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjZ8fHBvbGx1dGlvbnxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=800&q=60","Jaga kesehatanmu dengan baik, karena kualitas udara yang bersih adalah kunci untuk hidup yang lebih baik dan berkualitas!"))
        imageList.add(SlideModel("https://images.unsplash.com/photo-1616943412395-5ecf65f437d1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2841&q=80","Saat kamu memperhatikan kualitas udara di sekitarmu, kamu juga menjaga kesehatanmu yang tak ternilai."))


        imageSlider.setImageList(imageList, ScaleTypes.FIT, )
    }
}