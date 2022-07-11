package home.bogddev.techdic.ui.wordlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import home.bogddev.techdic.databinding.LayoutAlphabetListItemBinding
import home.bogddev.techdic.databinding.LayoutWordListItemBinding
import home.bogddev.techdic.model.model.WordListItem

class WordListAdapter(val wordListItems: List<WordListItem>) : RecyclerView.Adapter<WordListAdapter.ViewHolder>() {
  lateinit var layoutInflater: LayoutInflater

  class ViewHolder(val viewBinding: LayoutWordListItemBinding) : RecyclerView.ViewHolder(viewBinding.root) {
    lateinit var item: WordListItem
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
    ViewHolder(LayoutWordListItemBinding.inflate(
      if (this::layoutInflater.isInitialized)
        layoutInflater
      else
        LayoutInflater.from(parent.context).apply {
          layoutInflater = this
        }, parent, false))

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.item = wordListItems[position]

    holder.viewBinding.layoutWordListItemWordTextView.text = holder.item.word
    holder.viewBinding.layoutWordListItemTranslationTextView.text = holder.item.translation

    if (holder.item.sample.isNotEmpty()) {
      holder.viewBinding.layoutWordListItemSampleTextView.visibility = View.VISIBLE
      holder.viewBinding.layoutWordListItemSampleTextView.text = holder.item.sample
    } else {
      holder.viewBinding.layoutWordListItemSampleTextView.visibility = View.GONE
    }
  }

  override fun getItemCount(): Int = wordListItems.size
}