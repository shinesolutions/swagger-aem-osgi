package org.openapitools.server.api.model

import org.openapitools.server.api.model.ComAdobeCqSocialSrpImplSocialSolrConnectorProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialSrpImplSocialSolrConnectorInfo(
    val pid: kotlin.String? = null,
    val title: kotlin.String? = null,
    val description: kotlin.String? = null,
    val properties: ComAdobeCqSocialSrpImplSocialSolrConnectorProperties? = null
)
