package xyz.n8i.fermie.model.entity.master

import jakarta.persistence.*

@Entity
@Table(name = "mas_category")
class CategoryEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "cate_id") val cateId: Long,
    @Column(name = "cate_title") val cateTitle: String,
    @Column(name = "cate_description") val cateDescription: String? = null,
)