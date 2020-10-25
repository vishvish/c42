package com.tfto.c42

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.io.File

@Component
class Ingest {

    var logger: Logger = LoggerFactory.getLogger(Ingest::class.java)

    fun walkTheFolder() {
        logger.info("Walk the Folders")

        File("/Users/vish/Pictures/Ingest/").walk().forEach {
//            println(it)
            logger.info(it.path)
        }
    }
}