@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(
    @field:JsonProperty("translate.language")
    val translateLanguage: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("translate.display")
    val translateDisplay: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("translate.attribution")
    val translateAttribution: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("translate.caching")
    val translateCaching: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("translate.smart.rendering")
    val translateSmartRendering: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("translate.caching.duration")
    val translateCachingDuration: ConfigNodePropertyString? = null,

    @field:JsonProperty("translate.session.save.interval")
    val translateSessionSaveInterval: ConfigNodePropertyString? = null,

    @field:JsonProperty("translate.session.save.batchLimit")
    val translateSessionSaveBatchLimit: ConfigNodePropertyString? = null,

)
