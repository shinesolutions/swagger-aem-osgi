package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(
    val cqCommerceCataloggeneratorBucketsize: ConfigNodePropertyInteger? = null,
    val cqCommerceCataloggeneratorBucketname: ConfigNodePropertyString? = null,
    val cqCommerceCataloggeneratorExcludedtemplateproperties: ConfigNodePropertyArray? = null
)
