package home.bogddev.techdic.ui.info.detailed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import home.bogddev.techdic.databinding.FragmentInfoDetailedBinding

class InfoDetailedFragment : Fragment() {
  private lateinit var viewBinding: FragmentInfoDetailedBinding

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View = FragmentInfoDetailedBinding.inflate(inflater, container, false).apply { viewBinding = this }.root

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    arguments?.getString(KEY_TEXT_CONTENT, null)?.apply {
      viewBinding.fragmentInfoDetailedTextTextView.text = this
    }
  }

  companion object {
    const val KEY_TEXT_CONTENT = "key_textContent"
  }
}