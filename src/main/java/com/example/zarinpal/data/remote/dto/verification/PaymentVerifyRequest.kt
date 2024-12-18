
package com.example.zarinpal.data.remote.dto.verification

import com.example.zarinpal.data.remote.dto.Config
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PaymentVerifyRequest(
    @SerialName("merchant_id")
    val merchantId: String?=null,
    val sandBox :Boolean?=null,
    val amount: Int,
    val authority :String,
){
    fun copyWithConfig(config: Config): PaymentVerifyRequest {
        return this.copy(
            merchantId = this.merchantId ?: config.merchantId,
            sandBox = this.sandBox ?: config.sandBox
        )
    }
}
