package ru.perelyginva.widgetanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import ru.perelyginva.widgetanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)

        YoYo.with(Techniques.Flash)
            .duration(700)
            .repeat(5)
            .playOn(findViewById(R.id.one))

        YoYo.with(Techniques.Pulse)
            .duration(700)
            .repeat(5)
            .playOn(findViewById(R.id.two))

        YoYo.with(Techniques.RubberBand)
            .duration(700)
            .repeat(5)
            .playOn(findViewById(R.id.three))

        YoYo.with(Techniques.Shake)
            .duration(700)
            .repeat(5)
            .playOn(findViewById(R.id.four))

        YoYo.with(Techniques.Tada)
            .duration(700)
            .repeat(5)
            .playOn(findViewById(R.id.five))
    }
}