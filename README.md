# CloudStream 4-Web Template

Struktur provider sudah diganti menjadi:

1. `Samehadaku`
2. `Otakudesu`
3. `Sokuja`
4. `Donghuastream`

Setiap folder sudah memiliki `build.gradle.kts`, `AndroidManifest.xml`, dan provider Kotlin sendiri sehingga keempat module terdaftar di `settings.gradle.kts`.

**Catatan:** URL pada provider menggunakan domain `.example` sebagai placeholder agar tidak menebak atau mengunci ke domain pihak ketiga yang dapat berubah. Ganti `mainUrl` dengan URL yang memang kamu punya hak untuk integrasikan.

Template ini tidak menyertakan scraper atau extractor untuk sumber video pihak ketiga. Method `search()`, `load()`, dan `loadLinks()` perlu disesuaikan dengan API/HTML sumber yang kamu berwenang integrasikan.

Dokumentasi CloudStream:
https://recloudstream.github.io/csdocs/devs/gettingstarted/
