package de.tokethesa.projects.tournaments.persistence

import de.tokethesa.projects.tournaments.persistence.entities.TeamEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository: JpaRepository<TeamEntity, String> {
}