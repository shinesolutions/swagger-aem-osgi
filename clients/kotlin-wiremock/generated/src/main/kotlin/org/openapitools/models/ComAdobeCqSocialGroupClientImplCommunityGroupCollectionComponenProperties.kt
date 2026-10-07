@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(
    @field:JsonProperty("group.listing.pagination.enable")
    val groupListingPaginationEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("group.listing.lazyloading.enable")
    val groupListingLazyloadingEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("page.size")
    val pageSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("priority")
    val priority: ConfigNodePropertyInteger? = null,

)
