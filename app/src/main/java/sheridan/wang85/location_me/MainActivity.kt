package sheridan.wang85.location_me

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fabAddLocation.setOnClickListener{
            val intent = Intent(
                this@MainActivity,AddLocation::class.java)
                startActivity(intent)

        }
    }

}