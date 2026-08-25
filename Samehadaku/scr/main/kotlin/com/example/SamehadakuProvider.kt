package com.example

import android.content.Context
import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class SamehadakuPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(SamehadakuProvider())
    }
}

class SamehadakuProvider : MainAPI() {
    override var mainUrl = "https://samehadaku.example"
    override var name = "Samehadaku"
    override val lang = "id"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun search(query: String): List<SearchResponse> {
        // Parser situs sengaja belum diisi.
        // Tambahkan selector/API hanya jika kamu memiliki hak untuk mengintegrasikan sumber tersebut.
        return emptyList()
    }

    override suspend fun load(url: String): LoadResponse {
        throw ErrorLoadingException("Samehadaku: parser belum dikonfigurasi")
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
