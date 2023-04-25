package com.example.translator.translate.data.translate

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class TranslateDto(
    @SerialName("q") var textToTranslate: String,
    @SerialName("source") var sourceLanguageCode: String,
    @SerialName("target") var targetLanguageCode: String,
)
