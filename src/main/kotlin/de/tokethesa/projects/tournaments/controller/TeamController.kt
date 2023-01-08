package de.tokethesa.projects.tournaments.controller

import de.tokethesa.projects.tournaments.controller.dto.TeamDto
import de.tokethesa.projects.tournaments.persistence.TeamRepository
import de.tokethesa.projects.tournaments.persistence.entities.TeamEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/teams")
class TeamController(
    @Autowired val teamRepository: TeamRepository
) {
    @PutMapping
    fun createTeam(@RequestBody team: TeamDto): TeamDto {
        val teamEntity = TeamEntity(team.name)
        val persisted = teamRepository.save(teamEntity)
        return TeamDto(persisted.getId(), persisted.name)
    }
    @GetMapping
    fun getAllTeams() = teamRepository.findAll()
}