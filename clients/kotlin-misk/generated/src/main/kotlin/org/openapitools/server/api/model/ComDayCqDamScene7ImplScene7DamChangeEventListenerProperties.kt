package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(
    val cqDamScene7DamchangeeventlistenerEnabled: ConfigNodePropertyBoolean? = null,
    val cqDamScene7DamchangeeventlistenerObservedPaths: ConfigNodePropertyArray? = null
)
