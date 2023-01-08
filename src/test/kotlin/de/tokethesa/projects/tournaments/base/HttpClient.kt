package de.tokethesa.projects.tournaments.base

import de.tokethesa.projects.tournaments.controller.dto.TeamDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody


@FeignClient(name = "test-feign", url = "http://localhost:8080")
interface HttpClient {
    @PutMapping("/api/teams")
    fun createTeam(@RequestBody teamDto: TeamDto): TeamDto

    @GetMapping("/api/teams")
    abstract fun readAllTeams(): List<TeamDto>

}