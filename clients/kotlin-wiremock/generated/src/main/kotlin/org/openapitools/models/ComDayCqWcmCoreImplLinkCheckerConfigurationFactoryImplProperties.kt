@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(
    @field:JsonProperty("link.expired.prefix")
    val linkExpiredPrefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("link.expired.remove")
    val linkExpiredRemove: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("link.expired.suffix")
    val linkExpiredSuffix: ConfigNodePropertyString? = null,

    @field:JsonProperty("link.invalid.prefix")
    val linkInvalidPrefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("link.invalid.remove")
    val linkInvalidRemove: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("link.invalid.suffix")
    val linkInvalidSuffix: ConfigNodePropertyString? = null,

    @field:JsonProperty("link.predated.prefix")
    val linkPredatedPrefix: ConfigNodePropertyString? = null,

    @field:JsonProperty("link.predated.remove")
    val linkPredatedRemove: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("link.predated.suffix")
    val linkPredatedSuffix: ConfigNodePropertyString? = null,

    @field:JsonProperty("link.wcmmodes")
    val linkWcmmodes: ConfigNodePropertyArray? = null,

)
