@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(
    @field:JsonProperty("version.id")
    val versionId: ConfigNodePropertyString? = null,

    @field:JsonProperty("cache.on")
    val cacheOn: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("concurrency.level")
    val concurrencyLevel: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cache.start.size")
    val cacheStartSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cache.ttl")
    val cacheTtl: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cache.size")
    val cacheSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("time.limit")
    val timeLimit: ConfigNodePropertyInteger? = null,

)
