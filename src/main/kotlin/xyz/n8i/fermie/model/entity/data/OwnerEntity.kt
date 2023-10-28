package xyz.n8i.fermie.model.entity.data

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "data_owner")
class OwnerEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "ownr_id") val ownrId: Long,
    @Column(name = "ownr_username") val ownrUsername: String,
    @Column(name = "ownr_password") val ownrPassword: String,
    @Column(name = "ownr_active") val ownrActive: Boolean,
    @Column(name = "ownr_create_datetime") val ownrCreateDatetime: LocalDateTime,
    @Column(name = "ownr_update_datetime") val ownrUpdateDatetime: LocalDateTime? = null,
)