package com.tfto.c42

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/ingest")
class IngestController(private val repository: ImageRepository, private val ingest: Ingest) {
    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/start")
    fun startIngest() = ingest.walkTheFolder()

}
