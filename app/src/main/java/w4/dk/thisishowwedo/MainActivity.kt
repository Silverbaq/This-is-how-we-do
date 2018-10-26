package w4.dk.thisishowwedo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import w4.dk.thisishowwedo.retrofit.RetrofitActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRetrofit.setOnClickListener { startActivity(RetrofitActivity.newInstance(this)) }

    }
}
