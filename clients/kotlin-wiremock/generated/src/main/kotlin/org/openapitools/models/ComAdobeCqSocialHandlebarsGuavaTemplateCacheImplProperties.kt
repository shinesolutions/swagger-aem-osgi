@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(
    @field:JsonProperty("parameter.guava.cache.enabled")
    val parameterGuavaCacheEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("parameter.guava.cache.params")
    val parameterGuavaCacheParams: ConfigNodePropertyString? = null,

    @field:JsonProperty("parameter.guava.cache.reload")
    val parameterGuavaCacheReload: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("service.ranking")
    val serviceRanking: ConfigNodePropertyInteger? = null,

)
