package de.tokethesa.projects.tournaments.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/teams")
class TeamsController {
    @GetMapping
    fun getCustomer() = "Hello my team"
}