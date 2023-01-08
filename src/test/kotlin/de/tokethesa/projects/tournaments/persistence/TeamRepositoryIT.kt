package de.tokethesa.projects.tournaments.persistence

import de.tokethesa.projects.tournaments.base.AbstractJpaIT
import de.tokethesa.projects.tournaments.persistence.entities.TeamEntity
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class TeamRepositoryIT(
    @Autowired val teamRepository: TeamRepository
): AbstractJpaIT() {

    @Test
    fun persistTeam() {
        val teamEntity = TeamEntity("MyTeam")
        teamRepository.save(teamEntity)
        val persistedEntity = teamRepository.findById(teamEntity.getId())
        assertThat(persistedEntity.isPresent).isTrue
        assertThat(persistedEntity.get()).isEqualTo(teamEntity)
    }
}