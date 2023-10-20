package com.giovana.ecocarapp.data

import com.giovana.ecocarapp.domain.Carro

object CarFactory {
    val list = listOf(
        Carro(
            id = 1,
            preco = "R$700.000,00",
            bateria = "500 KWH",
            potencia = "400 cv",
            recarga = "60 min",
            urlPhoto = "blablabla",
            isFavorite = false
        ),
        Carro(
            id = 2,
            preco = "R$300.000,00",
            bateria = "200 KWH",
            potencia = "190 cv",
            recarga = "25 min",
            urlPhoto = "blablabla",
            isFavorite = false
        )
    )
// VERBOS HTTP
    // - GET -> Pare recuperar informaçoes
    // - POST -> Para enviar infomacoes para um servidor
    // - DELETE -> Que pra deletar algum recurso
    // - PUT -> Alterar uma entidade como um todo
    // - PATCH -> Alterar um atributo da entidade
}