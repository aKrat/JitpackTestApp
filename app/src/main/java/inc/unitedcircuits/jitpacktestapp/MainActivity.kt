package inc.unitedcircuits.jitpacktestapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import inc.unitedcircuits.jitpacktestlibrary.TestClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestClass.add(5.0,7.0)
    }
}
