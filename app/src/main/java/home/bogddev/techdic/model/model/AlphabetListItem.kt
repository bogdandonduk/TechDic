package home.bogddev.techdic.model.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AlphabetListItem(
  val letter: String,
  val words: List<WordListItem>
) : Parcelable