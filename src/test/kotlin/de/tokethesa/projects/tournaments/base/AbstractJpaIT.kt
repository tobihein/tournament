package de.tokethesa.projects.tournaments.base

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.ActiveProfiles

@DataJpaTest
@ActiveProfiles("test")
abstract class AbstractJpaIT {
}