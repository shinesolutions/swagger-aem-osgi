@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties(
    @field:JsonProperty("solr.zk.timeout")
    val solrZkTimeout: ConfigNodePropertyString? = null,

    @field:JsonProperty("solr.commit")
    val solrCommit: ConfigNodePropertyString? = null,

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

)
