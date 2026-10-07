@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(
    @field:JsonProperty("cq.commerce.cataloggenerator.bucketsize")
    val cqCommerceCataloggeneratorBucketsize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.commerce.cataloggenerator.bucketname")
    val cqCommerceCataloggeneratorBucketname: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.commerce.cataloggenerator.excludedtemplateproperties")
    val cqCommerceCataloggeneratorExcludedtemplateproperties: ConfigNodePropertyArray? = null,

)
