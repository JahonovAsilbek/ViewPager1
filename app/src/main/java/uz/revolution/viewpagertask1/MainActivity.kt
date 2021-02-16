package uz.revolution.viewpagertask1

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_image.*
import uz.revolution.viewpagertask1.adapters.MyAdapter
import uz.revolution.viewpagertask1.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var data: ArrayList<MyModel>
    lateinit var myAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        data = ArrayList()
        data.add(MyModel("Xush kelibsiz", "Kim ko‘rubdur, ey ko‘ngul, ahli jahondin yaxshilig‘, \n" +
                "Kimki, ondin yaxshi yo‘q, ko‘z tutma ondin yaxshilig‘", R.drawable.rectangle1))
        data.add(MyModel("Hikoyalar dunyosi", "Gar zamonni nayf qilsam ayb qilma, ey rafiq, \n" +
                "Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ ! ", R.drawable.rectangle2))
        data.add(MyModel("Kitob ortidan..", "Dilrabolardin yomonliq keldi mahzun ko‘ngluma,\n" +
                " Kelmadi jonimg'a hech oromi jondin yaxshilig'.", R.drawable.rectangle3))
        data.add(MyModel("Bizga qo`shiling", "Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p,\n" +
                " Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?", R.drawable.rectangle4
        ))

        myAdapter = MyAdapter(data, supportFragmentManager)
        view_pager.adapter = myAdapter
        tab_layout.setupWithViewPager(view_pager)

    }
}