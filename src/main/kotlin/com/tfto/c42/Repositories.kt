package com.tfto.c42

import org.springframework.data.repository.CrudRepository
import java.time.ZonedDateTime

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}

interface ImageRepository: CrudRepository<Image, Long> {
    fun findByCaptureTime(captureTime: ZonedDateTime): Image?
}