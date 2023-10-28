package xyz.n8i.fermie.model.entity.data

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "data_ferment")
class FermentEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "ferm_id") val fermId: Long,
    @Column(name = "ferm_category") val fermCategory: Long,
    @Column(name = "ferm_ferment_owner_id") val fermFermentOwnerId: Long,
    @Column(name = "ferm_title") val fermTitle: String,
    @Column(name = "ferm_description") val fermDescription: String?,
    @Column(name = "ferm_note") val fermNote: String?,
    @Column(name = "ferm_image_url") val fermImageUrl: String,
    @Column(name = "ferm_generation") val fermGeneration: Int,
    @Column(name = "ferm_parent_generation_id") val fermParentGenerationId: Long,
    @Column(name = "ferm_status") val fermStatus: String,
    @Column(name = "ferm_is_favorite") val fermIsFavorite: Boolean,
    @Column(name = "ferm_start_fermented_datetime") val fermStartFermentedDatetime: LocalDateTime? = null,
    @Column(name = "ferm_end_fermented_datetime") val fermEndFermentedDatetime: LocalDateTime? = null,
    @Column(name = "ferm_create_datetime") val fermCreateDatetime: LocalDateTime,
    @Column(name = "ferm_update_datetime") val fermUpdateDatetime: LocalDateTime? = null,
)