@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties(
    @field:JsonProperty("solr.home.path")
    val solrHomePath: ConfigNodePropertyString? = null,

    @field:JsonProperty("solr.core.name")
    val solrCoreName: ConfigNodePropertyString? = null,

)
