package uz.revolution.viewpagertask1.fragments

import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vansuita.gaussianblur.GaussianBlur
import kotlinx.android.synthetic.main.fragment_image.view.*
import uz.revolution.viewpagertask1.R
import uz.revolution.viewpagertask1.models.MyModel


private const val ARG_PARAM1 = "param1"

class ImageFragment : Fragment() {

    private var param1: MyModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getSerializable(ARG_PARAM1) as MyModel
        }
    }

    lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_image, container, false)

//        val blurredBitmap: Bitmap = GaussianBlur.with(root.context).radius(1).render(param1!!.fon)
//        root.image_view.setImageBitmap(blurredBitmap)

        root.image_view.setImageResource(param1!!.fon)

        root.sarlavha.text = param1?.sarlavha
        root.matn.text = param1?.matn

        return root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: MyModel) =
            ImageFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_PARAM1, param1)
                }
            }
    }
}