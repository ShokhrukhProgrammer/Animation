package uz.shoxsoft.animation

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_game.*

//class GameActivity : AppCompatActivity(), Animation.AnimationListener {
class GameActivity : AppCompatActivity(), View.OnClickListener {

    /* private var a1 = false
     private var a2 = false

     private var counter = 0

     private var animation1: Animation? = null
     private var animation2: Animation? = null*/
    private val animation1 = AnimationUtils.loadAnimation(this, R.anim.anim1)
    private val animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2)
    private lateinit var buttons: List<ImageView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        /* animation1 = AnimationUtils.loadAnimation(this, R.anim.anim1)
         animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2)

         animation1?.setAnimationListener(this)

         imgView1.setOnClickListener {
             a1 = true
             counter++
             imgView1.startAnimation(animation1)
         }
         imgView2.setOnClickListener {
             a2 = true
             counter++
             imgView2.startAnimation(animation1)
         }*/
        initialization()
    }

    private fun initialization() {
        playPoint1.setOnClickListener(this)
        playPoint2.setOnClickListener(this)

        img00.setOnClickListener(this)
        img01.setOnClickListener(this)
        img02.setOnClickListener(this)
        img03.setOnClickListener(this)
        img10.setOnClickListener(this)
        img11.setOnClickListener(this)
        img12.setOnClickListener(this)
        img13.setOnClickListener(this)
        img20.setOnClickListener(this)
        img21.setOnClickListener(this)
        img22.setOnClickListener(this)
        img23.setOnClickListener(this)
        img30.setOnClickListener(this)
        img31.setOnClickListener(this)
        img32.setOnClickListener(this)
        img33.setOnClickListener(this)
    }


    override fun onClick(p0: View?) {
        var id = p0?.id
        when (id) {
            R.id.img00 -> {
                animation1.duration = 2000
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
                img00.startAnimation(animation2)
            }
            R.id.img01 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img02 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img03 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img10 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img11 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img12 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img13 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img20 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img21 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img22 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img23 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img30 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img31 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img32 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
            R.id.img33 -> {
                img00.startAnimation(animation1)
                img00.setImageResource(R.drawable.medal)
            }
        }
    }
    /*override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        if (a1) {
            imgView1.setImageResource(R.drawable.medal)
            imgView1.startAnimation(animation2)
            a1 = false
        } else if (a2) {
            imgView2.setImageResource(R.drawable.medal)
            imgView2.startAnimation(animation2)
            a2 = false
        }

        animation2?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {

            }

            override fun onAnimationEnd(p0: Animation?) {
                if (counter == 2) {
                    if (imgView1.drawable.constantState == imgView2.drawable.constantState) {
                        imgView1.visibility = View.INVISIBLE
                        imgView2.visibility = View.INVISIBLE
                    }
                }
            }

            override fun onAnimationRepeat(p0: Animation?) {

            }
        })
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }*/
}