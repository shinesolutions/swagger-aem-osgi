package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(
    val davRoot: ConfigNodePropertyString? = null,
    val davCreateAbsoluteUri: ConfigNodePropertyBoolean? = null,
    val davRealm: ConfigNodePropertyString? = null,
    val collectionTypes: ConfigNodePropertyArray? = null,
    val filterPrefixes: ConfigNodePropertyArray? = null,
    val filterTypes: ConfigNodePropertyString? = null,
    val filterUris: ConfigNodePropertyString? = null,
    val typeCollections: ConfigNodePropertyString? = null,
    val typeNoncollections: ConfigNodePropertyString? = null,
    val typeContent: ConfigNodePropertyString? = null
)
