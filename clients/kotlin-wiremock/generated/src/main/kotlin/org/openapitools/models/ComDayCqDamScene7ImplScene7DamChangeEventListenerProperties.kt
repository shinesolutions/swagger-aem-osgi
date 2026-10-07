@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(
    @field:JsonProperty("cq.dam.scene7.damchangeeventlistener.enabled")
    val cqDamScene7DamchangeeventlistenerEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.dam.scene7.damchangeeventlistener.observed.paths")
    val cqDamScene7DamchangeeventlistenerObservedPaths: ConfigNodePropertyArray? = null,

)
