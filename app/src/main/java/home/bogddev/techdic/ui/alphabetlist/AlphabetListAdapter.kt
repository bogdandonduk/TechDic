package home.bogddev.techdic.ui.alphabetlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import home.bogddev.techdic.databinding.LayoutAlphabetListItemBinding
import home.bogddev.techdic.model.model.AlphabetListItem
import home.bogddev.techdic.ui.core.Callback

class AlphabetListAdapter(var alphabetListItems: List<AlphabetListItem>, val onClickCallback: Callback<AlphabetListItem>) : RecyclerView.Adapter<AlphabetListAdapter.ViewHolder>() {
  lateinit var layoutInflater: LayoutInflater

  class ViewHolder(val viewBinding: LayoutAlphabetListItemBinding, val onClickCallback: Callback<AlphabetListItem>) : RecyclerView.ViewHolder(viewBinding.root) {
    lateinit var item: AlphabetListItem

    init {
      viewBinding.root.setOnClickListener {
        if (this::item.isInitialized)
          onClickCallback.onAction(item)
      }
    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
    ViewHolder(LayoutAlphabetListItemBinding.inflate(
      if (this::layoutInflater.isInitialized)
        layoutInflater
      else
        LayoutInflater.from(parent.context).apply {
          layoutInflater = this
        }, parent, false), onClickCallback)

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.item = alphabetListItems[position]

    holder.viewBinding.layoutAlphabetListItemTextTextView.text = holder.item.letter
  }

  override fun getItemCount(): Int = alphabetListItems.size
}