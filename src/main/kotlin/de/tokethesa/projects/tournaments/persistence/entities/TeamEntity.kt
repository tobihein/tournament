package de.tokethesa.projects.tournaments.persistence.entities

import jakarta.persistence.Entity

@Entity
class TeamEntity(
    val name: String
): AbstractBaseEntity() {
}