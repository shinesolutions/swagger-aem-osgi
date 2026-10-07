@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(
    @field:JsonProperty("dav.root")
    val davRoot: ConfigNodePropertyString? = null,

    @field:JsonProperty("dav.create-absolute-uri")
    val davCreateAbsoluteUri: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("dav.realm")
    val davRealm: ConfigNodePropertyString? = null,

    @field:JsonProperty("collection.types")
    val collectionTypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("filter.prefixes")
    val filterPrefixes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("filter.types")
    val filterTypes: ConfigNodePropertyString? = null,

    @field:JsonProperty("filter.uris")
    val filterUris: ConfigNodePropertyString? = null,

    @field:JsonProperty("type.collections")
    val typeCollections: ConfigNodePropertyString? = null,

    @field:JsonProperty("type.noncollections")
    val typeNoncollections: ConfigNodePropertyString? = null,

    @field:JsonProperty("type.content")
    val typeContent: ConfigNodePropertyString? = null,

)
