package home.bogddev.techdic.ui.core

interface Callback<T> {
  fun onAction(item: T)
}