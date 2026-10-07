@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(
    @field:JsonProperty("service.max_links_per_host")
    val serviceMaxLinksPerHost: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("service.save_external_link_references")
    val serviceSaveExternalLinkReferences: ConfigNodePropertyBoolean? = null,

)
