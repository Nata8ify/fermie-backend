package xyz.n8i.fermie.repository.jpa.master

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import xyz.n8i.fermie.model.entity.master.CategoryEntity

@Repository
interface CategoryRepository : JpaRepository<CategoryEntity, Long> {
}