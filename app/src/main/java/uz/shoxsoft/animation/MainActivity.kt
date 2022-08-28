package uz.shoxsoft.animation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //alpha
//        val animation = AnimationUtils.loadAnimation(this, R.anim.alpha)

//        val alphaAnimation = AlphaAnimation(0.0f, 1.0f)
//        alphaAnimation.duration = 4000

        //scale
//        val animation = AnimationUtils.loadAnimation(this, R.anim.scale)

//        val scaleAnimation = ScaleAnimation(
//            1.0f, 0.0f, 1.0f, 0.0f,
//            Animation.RELATIVE_TO_SELF, 50f,
//            Animation.RELATIVE_TO_SELF, 50f
//        )
//        scaleAnimation.duration = 5000

        //translate
//        val animation = AnimationUtils.loadAnimation(this, R.anim.translate)

//        val translateAnimation = TranslateAnimation(-100f, 300f, -100f, 300f)
//        translateAnimation.duration = 5000

        //rotate
//        val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)

//        val rotaAnimation = RotateAnimation(
//            0.0f, 360f,
//            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f
//        )
//        rotaAnimation.duration = 4000

        //combination animation
//        val animation = AnimationUtils.loadAnimation(this, R.anim.combination)
//        animation.duration = 4000

//        btn.setOnClickListener {
//            txt.startAnimation(animation)
//        }
    }
}