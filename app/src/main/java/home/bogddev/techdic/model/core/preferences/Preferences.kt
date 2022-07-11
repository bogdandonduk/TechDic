package home.bogddev.techdic.model.core.preferences

import android.content.Context

object Preferences {
  private const val KEY_IS_FIRST_LAUNCH = "isFirstLaunch"
  private const val SP_SUFFIX = "_sharedPrefs"
  fun isFirstLaunch(context: Context) =
    context.getSharedPreferences(context.packageName + SP_SUFFIX, Context.MODE_PRIVATE).getBoolean(
      KEY_IS_FIRST_LAUNCH,
      true
    )

  fun setFirstLaunchPassed(context: Context, value: Boolean = true) {
    context.getSharedPreferences(context.packageName + SP_SUFFIX, Context.MODE_PRIVATE).edit().putBoolean(KEY_IS_FIRST_LAUNCH, !value).apply()
  }
}