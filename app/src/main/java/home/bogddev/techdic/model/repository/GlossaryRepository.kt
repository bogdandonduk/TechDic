package home.bogddev.techdic.model.repository

import home.bogddev.techdic.model.model.AlphabetListItem
import home.bogddev.techdic.model.model.WordListItem
import home.bogddev.techdic.model.source.AlphabetListDataSource

class GlossaryRepository private constructor(
  private val alphabetListDataSource: AlphabetListDataSource,
) {
  companion object {
    @Volatile
    private var instance: GlossaryRepository? = null

    fun getInstance(
      alphabetListDataSource: AlphabetListDataSource,
    ) = instance ?: synchronized(this) {
      instance = GlossaryRepository(alphabetListDataSource)
      instance!!
    }
  }

  suspend fun getAlphabetListItems() = alphabetListDataSource.get()
}