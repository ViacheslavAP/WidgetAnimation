package ru.perelyginva.widgetanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.perelyginva.widgetanimation.databinding.ActivityTwoBinding

class TwoActivity : AppCompatActivity() {
    private var binding: ActivityTwoBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTwoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)

        binding?.firstActivity?.setOnClickListener(View.OnClickListener {
            val startMainActivity = Intent(this, MainActivity::class.java)
            startActivity(startMainActivity)
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        })

    }
}