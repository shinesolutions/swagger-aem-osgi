@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingHapiImplHApiUtilImplProperties(
    @field:JsonProperty("org.apache.sling.hapi.tools.resourcetype")
    val orgApacheSlingHapiToolsResourcetype: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.hapi.tools.collectionresourcetype")
    val orgApacheSlingHapiToolsCollectionresourcetype: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.hapi.tools.searchpaths")
    val orgApacheSlingHapiToolsSearchpaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.sling.hapi.tools.externalurl")
    val orgApacheSlingHapiToolsExternalurl: ConfigNodePropertyString? = null,

    @field:JsonProperty("org.apache.sling.hapi.tools.enabled")
    val orgApacheSlingHapiToolsEnabled: ConfigNodePropertyBoolean? = null,

)
