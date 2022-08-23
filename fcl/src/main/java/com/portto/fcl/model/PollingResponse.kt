package com.portto.fcl.model

import com.portto.fcl.model.service.Service
import com.portto.fcl.network.ResponseStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


typealias BackChannelRpc = Service
typealias Frame = Service

/**
 *  Ref: https://github.com/onflow/fcl-js/blob/master/packages/fcl/src/current-user/normalize/polling-response.js
 */
@Serializable
data class PollingResponse(
    @SerialName("status")
    val status: ResponseStatus,
    @SerialName("reason")
    val reason: String?,
    @SerialName("data")
    val data: AuthData?,
    @SerialName("updates")
    val updates: BackChannelRpc?,
    @SerialName("local")
    val local: Frame?
)
