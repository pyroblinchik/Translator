package com.example.translator.translate.data.translate

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class TranslatedDto(
    var translatedText: String,
)
