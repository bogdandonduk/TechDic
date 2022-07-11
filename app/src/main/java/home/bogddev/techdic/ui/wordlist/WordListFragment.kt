package home.bogddev.techdic.ui.wordlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import home.bogddev.techdic.databinding.FragmentWordListBinding
import home.bogddev.techdic.model.model.AlphabetListItem

@AndroidEntryPoint
class WordListFragment : Fragment() {
  private lateinit var viewBinding: FragmentWordListBinding

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View = FragmentWordListBinding.inflate(inflater, container, false).apply { viewBinding = this }.root

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    viewBinding.fragmentWordsListListRecyclerView.apply {
      layoutManager = LinearLayoutManager(requireContext())

      arguments?.getParcelable<AlphabetListItem>(KEY_ALPHABET_ITEM)?.words?.apply {
        adapter = WordListAdapter(this)
      }
    }
  }

  companion object {
    const val KEY_ALPHABET_ITEM = "key_alphabetItem"
  }
}