package home.bogddev.techdic.model.core.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import home.bogddev.techdic.model.repository.GlossaryRepository
import home.bogddev.techdic.model.source.AlphabetListDataSource
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class GlossaryRepositoryModule {
  companion object {
    @Provides
    fun provideGlossaryRepository(alphabetListDataSource: AlphabetListDataSource) : GlossaryRepository = GlossaryRepository.getInstance(alphabetListDataSource)
  }
}