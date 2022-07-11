package home.bogddev.techdic.ui

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.findNavController
import dagger.hilt.android.AndroidEntryPoint
import home.bogddev.techdic.R
import home.bogddev.techdic.databinding.ActivityMainBinding
import home.bogddev.techdic.ui.alphabetlist.AlphabetListFragment
import home.bogddev.techdic.ui.info.detailed.InfoDetailedFragment
import home.bogddev.techdic.ui.wordlist.WordListFragment

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
  private lateinit var viewBinding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    viewBinding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(viewBinding.root)

    supportActionBar?.setBackgroundDrawable(ResourcesCompat.getDrawable(resources, R.drawable.bg_toolbar, null))
  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.menu_main, menu)

    menu?.findItem(R.id.menu_main_item_info)?.setOnMenuItemClickListener {
      try {
        val navController = findNavController(R.id.mainNavHost)

        supportFragmentManager.findFragmentById(R.id.mainNavHost)?.childFragmentManager?.fragments?.first().apply {
          when (this) {
            is AlphabetListFragment -> navController.navigate(R.id.action_alphabetListFragment_to_infoHubFragment)
            is WordListFragment -> navController.navigate(R.id.action_wordListFragment_to_infoHubFragment)
            is InfoDetailedFragment -> onBackPressed()
          }
        }
      } catch (thr: Throwable) {
        thr.printStackTrace()
      }

      false
    }

    return true
  }
}