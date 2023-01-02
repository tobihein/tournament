package de.tokethesa.projects.tournaments.controller

import de.tokethesa.projects.tournaments.controller.dto.TeamDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/teams")
class TeamsController {
    @GetMapping
    fun getCustomer() = listOf(TeamDto("1", "First Team"), TeamDto("2", "Second Team"), TeamDto("3", "Third Team"))
}