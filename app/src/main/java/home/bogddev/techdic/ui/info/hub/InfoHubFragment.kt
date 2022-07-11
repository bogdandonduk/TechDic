package home.bogddev.techdic.ui.info.hub

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import home.bogddev.techdic.R
import home.bogddev.techdic.databinding.FragmentInfoHubBinding
import home.bogddev.techdic.model.core.preferences.Preferences
import home.bogddev.techdic.ui.info.detailed.InfoDetailedFragment

class InfoHubFragment : Fragment() {
  private lateinit var viewBinding: FragmentInfoHubBinding

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View = FragmentInfoHubBinding.inflate(inflater, container, false).apply { viewBinding = this }.root

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    viewBinding.fragmentInfoHubOptionOneButtonConstraintLayout.setOnClickListener {
      findNavController().navigate(
        R.id.action_infoHubFragment_to_infoDetailedFragment,
        bundleOf(
          InfoDetailedFragment.KEY_TEXT_CONTENT to resources.getString(R.string.what_is_techdic_content)
        )
      )
    }

    viewBinding.fragmentInfoHubOptionTwoButtonConstraintLayout.setOnClickListener {
      findNavController().navigate(
        R.id.action_infoHubFragment_to_infoDetailedFragment,
        bundleOf(
          InfoDetailedFragment.KEY_TEXT_CONTENT to resources.getString(R.string.how_to_use_content)
        )
      )
    }

    View.OnClickListener {
      Preferences.setFirstLaunchPassed(requireContext())
      requireActivity().onBackPressed()
    }.apply {
      viewBinding.fragmentInfoHubOptionThreeButtonConstraintLayout.setOnClickListener(this)
      viewBinding.fragmentInfoHubGoImageButton.setOnClickListener(this)
    }
  }
}