package com.example.translator.core.presentation

import com.example.translator.translate.domain.translate.TranslateError
import com.example.translator.translate.presentation.UiHistoryItem

data class TranslateState(
    val fromText: String = "",
    val toText: String? = null,
    val isTranslating: Boolean =  false,
    val fromLanguage: UiLanguage = UiLanguage.byCode("en"),
    val toLanguage: UiLanguage = UiLanguage.byCode("az"),
    val isChoosingFromLanguage: Boolean = false,
    val isChoosingToLanguage: Boolean = false,
    val error: TranslateError? = null,
    val history: List<UiHistoryItem> = emptyList()
)