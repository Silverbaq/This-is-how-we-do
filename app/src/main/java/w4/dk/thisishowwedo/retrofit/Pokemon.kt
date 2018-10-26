package w4.dk.thisishowwedo.retrofit

data class Pokemon(
        val abilities: List<Ability>,
        val base_experience: Int,
        val forms: List<Form>,
        val game_indices: List<GameIndice>,
        val height: Int,
        val held_items: List<Any>,
        val id: Int,
        val is_default: Boolean,
        val location_area_encounters: String,
        val moves: List<Move>,
        val name: String,
        val order: Int,
        val species: Species,
        val sprites: Sprites,
        val stats: List<Stat>,
        val types: List<Type>,
        val weight: Int
) {
    data class Sprites(
            val back_default: String,
            val back_female: Any,
            val back_shiny: String,
            val back_shiny_female: Any,
            val front_default: String,
            val front_female: Any,
            val front_shiny: String,
            val front_shiny_female: Any
    )

    data class Ability(
            val ability: Ability,
            val is_hidden: Boolean,
            val slot: Int
    ) {
        data class Ability(
                val name: String,
                val url: String
        )
    }

    data class Form(
            val name: String,
            val url: String
    )

    data class Stat(
            val base_stat: Int,
            val effort: Int,
            val stat: Stat
    ) {
        data class Stat(
                val name: String,
                val url: String
        )
    }

    data class Species(
            val name: String,
            val url: String
    )

    data class GameIndice(
            val game_index: Int,
            val version: Version
    ) {
        data class Version(
                val name: String,
                val url: String
        )
    }

    data class Move(
            val move: Move,
            val version_group_details: List<VersionGroupDetail>
    ) {
        data class VersionGroupDetail(
                val level_learned_at: Int,
                val move_learn_method: MoveLearnMethod,
                val version_group: VersionGroup
        ) {
            data class MoveLearnMethod(
                    val name: String,
                    val url: String
            )

            data class VersionGroup(
                    val name: String,
                    val url: String
            )
        }

        data class Move(
                val name: String,
                val url: String
        )
    }

    data class Type(
            val slot: Int,
            val type: Type
    ) {
        data class Type(
                val name: String,
                val url: String
        )
    }
}