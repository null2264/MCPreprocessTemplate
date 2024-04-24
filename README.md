# MCPreprocessTemplate

Template for MC mods using ReplayMod's preprocessor

Recommended to be changed:
- The namespace, the mod name and the mod id:
  - `src/java/...`
  - Filename of `src/main/resources/examplemod.mixins.json`
  - Mod ID and/or Mod Name in:
    - `src/main/resources/fabric.mod.json`
    - `src/main/resources/META-INF/mods.toml`
    - `src/main/resources/pack.mcmeta`
    - `gradle.properties`
    - `src/java/**/*.java`
- The icon (`src/main/resources/icon.png`)
- The license in:
  - `LICENSE`
  - `src/main/resources/fabric.mod.json`
  - `src/main/resources/META-INF/mods.toml`
- `default_changelog` in `gradle.properties`
- `modrinth_project` in `gradle.properties`
- `curseforge_project` in `gradle.properties`
- Anything marked with `TODO(addingVersion)` in `build.gradle`
- Version list in `versions/`

## License

This template is licensed under the [BSD Zero Clause License](/LICENSE)
