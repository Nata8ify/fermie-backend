package xyz.n8i.fermie.repository.jpa.data

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import xyz.n8i.fermie.model.entity.data.FermentEntity

@Repository
interface FermentRepository : JpaRepository<FermentEntity, Long> {
}