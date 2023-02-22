package com.example.sandbox.repo

import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Service
class OnlinerRepository (
    private var webClient: WebClient
)
{
    fun getAllManufacturers(): Mono<String> {
        return webClient
            .get()
            .uri("manufacturers")
            .retrieve()
            .bodyToMono(String::class.java)
    }

    fun getManufacturersInfo(id: Int): Mono<String> {
        logger.debug("Get Manufacter Info for $id;")
        return webClient
            .get()
            .uri("manufacturers/$id")
            .retrieve()
            .bodyToMono(String::class.java)
    }

    fun getModelInfo(idManufacter: Int, idModel: Int): Mono<String> {
        logger.debug("Get Manufacter Info for $idManufacter and $idModel Model;")
        return webClient
            .get()
            .uri("manufacturers/$idManufacter/models/$idModel")
            .retrieve()
            .bodyToMono(String::class.java)
    }

    fun getGenerationInfo(idManufacter: Int, idModel: Int, idGeneration: Int): Mono<String> {
        logger.debug("Get Manufacter Info for $idManufacter and $idModel Model for $idGeneration generation;")
        return webClient
            .get()
            .uri("manufacturers/$idManufacter/model/$idModel/generations/$idGeneration")
            .retrieve()
            .bodyToMono(String::class.java)
    }

    companion object {
        private val logger = LogManager.getLogger()
    }
}