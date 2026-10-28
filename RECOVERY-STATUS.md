# ADR PRO - source recovery status

Recovered from the compiled APK `ADR_PRO_base.apk` (Drive folder "ELE ADR Pro Logger"). No original source existed.

- Package / applicationId: `com.ELE.ADR.Merger`, code namespace `com.example`, v1.0 (code 1), minSdk 24, targetSdk 36, Kotlin 2.2, Jetpack Compose, Room.
- App name: "ADR PRO". Reads CSV files from test folders (picked folder, multiple files, USB sync), extracts one cell per file (default B9), shows stats, previews, keeps a history database, exports/shares the combined result (two output formats).
- `recovery/decompiled-java`: jadx output of the app classes (com.example: MainActivity, CsvAggregatorViewModel, CsvParserUtil, Room database, Compose components, models).
- `recovery/resources`: decoded resources and manifest.

Status: reference only. The buildable Kotlin/Compose project is not written yet.
