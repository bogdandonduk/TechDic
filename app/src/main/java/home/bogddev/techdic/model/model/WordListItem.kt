package home.bogddev.techdic.model.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class WordListItem(
  val word: String,
  val translation: String,
  val sample: CharSequence
) : Parcelable