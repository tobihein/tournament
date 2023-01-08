package de.tokethesa.projects.tournaments.controller
import de.tokethesa.projects.tournaments.base.AbstractIT
import de.tokethesa.projects.tournaments.base.HttpClient
import de.tokethesa.projects.tournaments.controller.dto.TeamDto
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType

class TeamControllerIT(
    @Autowired httpClient: HttpClient
): AbstractIT(httpClient) {

    @Test
    fun createTeam() {
        val team = TeamDto(null, "myTeam")
        val persistedTeam = this.createTeam(team)
            assertThat(persistedTeam?.id).isNotNull
            assertThat(persistedTeam?.name).isEqualTo(team.name)
    }

    @Test
    fun readAllTeams() {
        this.createTeam(TeamDto(null, "Team1"))
        this.createTeam(TeamDto(null, "Team2"))
        this.createTeam(TeamDto(null, "Team3"))
        val readTeams = this.readTeams()
        assertThat(readTeams.size).isGreaterThanOrEqualTo(3)
        assertThat(readTeams.map{it.name}).containsAll(listOf("Team1", "Team2", "Team3"))
        assertThat(readTeams.filter{ it.id == null }).isEmpty()
    }
}