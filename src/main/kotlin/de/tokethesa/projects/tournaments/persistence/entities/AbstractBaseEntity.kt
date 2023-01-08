package de.tokethesa.projects.tournaments.persistence.entities

import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.springframework.data.util.ProxyUtils
import java.util.*

@MappedSuperclass
abstract class AbstractBaseEntity {
    @Id
    private var id: String = UUID.randomUUID().toString()

    fun setId(id: String) {
        this.id=id
    }
    fun getId(): String = id

    override fun equals(other: Any?): Boolean {
        other ?: return false

        if(this === other) return true

        if(javaClass != ProxyUtils.getUserClass(other)) return false
        other as AbstractBaseEntity

        return this.getId() == other.getId()
    }

    override fun hashCode(): Int = 31
}