package de.tokethesa.projects.tournaments.base

import de.tokethesa.projects.tournaments.controller.dto.TeamDto
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.test.context.ActiveProfiles

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@EnableFeignClients
@EnableAutoConfiguration
@ActiveProfiles("test")
abstract class AbstractIT(
    val httpClient: HttpClient
) {
    fun createTeam(team: TeamDto): TeamDto? = httpClient.createTeam(team)
    fun readTeams(): List<TeamDto> = httpClient.readAllTeams()
}