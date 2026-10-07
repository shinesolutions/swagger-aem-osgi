@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties(
    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("tagpattern")
    val tagpattern: ConfigNodePropertyString? = null,

    @field:JsonProperty("component.resourceType")
    val componentResourceType: ConfigNodePropertyString? = null,

)
