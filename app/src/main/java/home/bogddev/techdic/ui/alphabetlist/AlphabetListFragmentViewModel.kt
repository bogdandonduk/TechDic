package home.bogddev.techdic.ui.alphabetlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import home.bogddev.techdic.model.model.AlphabetListItem
import home.bogddev.techdic.model.repository.GlossaryRepository
import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

class AlphabetListFragmentViewModel @Inject constructor(
  private val glossaryRepository: GlossaryRepository
) : ViewModel() {
  val alphabetListItems = MutableLiveData<List<AlphabetListItem>>()

  fun getAlphabetListItems() {
    viewModelScope.launch(Default) {
      alphabetListItems.postValue(
        glossaryRepository.getAlphabetListItems()
      )
    }
  }
}