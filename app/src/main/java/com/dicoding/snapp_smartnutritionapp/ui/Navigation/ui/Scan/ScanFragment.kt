package com.dicoding.snapp_smartnutritionapp.ui.Navigation.ui.Scan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dicoding.snapp_smartnutritionapp.databinding.FragmentScanBinding
import androidx.camera.view.PreviewView
import org.tensorflow.lite.task.vision.classifier.Classifications

class ScanFragment : Fragment() {

    private var _binding: FragmentScanBinding? = null
    private val binding get() = _binding!!
    private lateinit var imageClassifierHelper: ImageClassifierHelper
    
    private fun startCamera(){
        imageClassifierHelper = ImageClassifierHelper(
            context = this.requireContext(),
            classifierListener = object : ImageClassifierHelper.ClassifierListener {
                override fun onError(error: String) {
                    TODO("Not yet implemented")
                }

                override fun onResults(results: List<Classifications>?, inferenceTime: Long) {
                    TODO("Not yet implemented")
                }
            }
        )
    }
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val scanViewModel =
            ViewModelProvider(this).get(ScanViewModel::class.java)

        _binding = FragmentScanBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}