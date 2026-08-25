package com.example

import android.content.Context
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class SokujaPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(SokujaProvider())
    }
}

class SokujaProvider : MainAPI() {
    override var mainUrl = "https://x6.sokuja.uk/"
    override var name = "Sokuja"
    override val lang = "id"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun search(query: String): List<SearchResponse> {
        // Parser situs sengaja belum diisi.
        // Tambahkan selector/API hanya jika kamu memiliki hak untuk mengintegrasikan sumber tersebut.
        return emptyList()
    }

    override suspend fun load(url: String): LoadResponse {
        throw ErrorLoadingException("Sokuja: parser belum dikonfigurasi")
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        // Jangan menambahkan extractor untuk sumber yang tidak berizin.
        return false
    }
}
