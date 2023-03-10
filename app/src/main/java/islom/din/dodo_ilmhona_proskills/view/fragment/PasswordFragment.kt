package islom.din.dodo_ilmhona_proskills.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import islom.din.dodo_ilmhona_proskills.R
import islom.din.dodo_ilmhona_proskills.databinding.FragmentPassvordBinding

class PasswordFragment : Fragment() {
    private lateinit var binding: FragmentPassvordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentPassvordBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.getNewCod.setOnClickListener {
            val action = PasswordFragmentDirections.actionPasswordFragmentToProfilFragement2()
            findNavController().navigate(action)
        }
    }
}