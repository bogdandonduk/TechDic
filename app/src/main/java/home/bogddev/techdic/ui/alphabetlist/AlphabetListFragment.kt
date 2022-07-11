package home.bogddev.techdic.ui.alphabetlist

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import home.bogddev.techdic.R
import home.bogddev.techdic.databinding.FragmentAlphabetListBinding
import home.bogddev.techdic.model.core.preferences.Preferences
import home.bogddev.techdic.model.model.AlphabetListItem
import home.bogddev.techdic.ui.core.Callback
import home.bogddev.techdic.ui.wordlist.WordListFragment
import javax.inject.Inject

@AndroidEntryPoint
class AlphabetListFragment : Fragment() {
  lateinit var viewBinding: FragmentAlphabetListBinding
  @Inject lateinit var viewModel: AlphabetListFragmentViewModel

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View = FragmentAlphabetListBinding.inflate(inflater, container, false).apply { viewBinding = this }.root

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    if (!Preferences.isFirstLaunch(requireContext())) {
      viewBinding.fragmentAlphabetListListRecyclerView.apply {
        layoutManager = LinearLayoutManager(requireContext())

        adapter = AlphabetListAdapter(
          emptyList(),
          object : Callback<AlphabetListItem> {
            override fun onAction(item: AlphabetListItem) {
              findNavController().navigate(
                R.id.action_alphabetListFragment_to_wordListFragment,
                bundleOf(
                  WordListFragment.KEY_ALPHABET_ITEM to item
                )
              )
            }
          }
        )

        viewModel.alphabetListItems.observe(viewLifecycleOwner) {
          (adapter as? AlphabetListAdapter)?.alphabetListItems = it ?: emptyList()
          adapter?.notifyDataSetChanged()
        }

        viewModel.getAlphabetListItems()
      }
    } else {
      findNavController().navigate(R.id.action_alphabetListFragment_to_infoHubFragment)
    }
  }
}